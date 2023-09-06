package com.example.myapplication.dictionary.di;

import com.example.myapplication.dictionary.data.remote.DictionaryAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class WordInfoModule_ProvideDictionaryApiFactory implements Factory<DictionaryAPI> {
  @Override
  public DictionaryAPI get() {
    return provideDictionaryApi();
  }

  public static WordInfoModule_ProvideDictionaryApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DictionaryAPI provideDictionaryApi() {
    return Preconditions.checkNotNullFromProvides(WordInfoModule.INSTANCE.provideDictionaryApi());
  }

  private static final class InstanceHolder {
    private static final WordInfoModule_ProvideDictionaryApiFactory INSTANCE = new WordInfoModule_ProvideDictionaryApiFactory();
  }
}
