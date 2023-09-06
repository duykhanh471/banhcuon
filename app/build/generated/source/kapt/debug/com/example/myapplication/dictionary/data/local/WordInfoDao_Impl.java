package com.example.myapplication.dictionary.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity;
import com.example.myapplication.dictionary.data.util.Converters;
import com.example.myapplication.dictionary.domain.model.Meaning;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WordInfoDao_Impl implements WordInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WordInfoEntity> __insertionAdapterOfWordInfoEntity;

  private Converters __converters;

  public WordInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWordInfoEntity = new EntityInsertionAdapter<WordInfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `word_table` (`word`,`meanings`,`id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WordInfoEntity value) {
        if (value.getWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getWord());
        }
        final String _tmp = __converters().toMeaningsJson(value.getMeanings());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        if (value.getId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertWordInfo(final List<WordInfoEntity> info,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWordInfoEntity.insert(info);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getWordInfo(final String word,
      final Continuation<? super List<WordInfoEntity>> continuation) {
    final String _sql = "select * from word_table where word like '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (word == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, word);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<WordInfoEntity>>() {
      @Override
      public List<WordInfoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final int _cursorIndexOfMeanings = CursorUtil.getColumnIndexOrThrow(_cursor, "meanings");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WordInfoEntity> _result = new ArrayList<WordInfoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WordInfoEntity _item;
            final String _tmpWord;
            if (_cursor.isNull(_cursorIndexOfWord)) {
              _tmpWord = null;
            } else {
              _tmpWord = _cursor.getString(_cursorIndexOfWord);
            }
            final List<Meaning> _tmpMeanings;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfMeanings)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfMeanings);
            }
            _tmpMeanings = __converters().fromMeaningsJson(_tmp);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new WordInfoEntity(_tmpWord,_tmpMeanings,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteWordInfo(final List<String> words,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("delete from word_table where word in(");
        final int _inputSize = words.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        final String _sql = _stringBuilder.toString();
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        for (String _item : words) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindString(_argIndex, _item);
          }
          _argIndex ++;
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(Converters.class);
  }

  private synchronized Converters __converters() {
    if (__converters == null) {
      __converters = __db.getTypeConverter(Converters.class);
    }
    return __converters;
  }
}
