package com.example.myapplication.dictionary.presentation;

import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.core.util.Resources;
import com.example.myapplication.dictionary.domain.use_case.GetWordInfo;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "getWordInfo", "Lcom/example/myapplication/dictionary/domain/use_case/GetWordInfo;", "(Lcom/example/myapplication/dictionary/domain/use_case/GetWordInfo;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel$UIEvent;", "_searchQuery", "Landroidx/compose/runtime/MutableState;", "", "_state", "Lcom/example/myapplication/dictionary/presentation/WordInfoState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "searchJob", "Lkotlinx/coroutines/Job;", "searchQuery", "Landroidx/compose/runtime/State;", "getSearchQuery", "()Landroidx/compose/runtime/State;", "state", "getState", "onSearch", "", "query", "UIEvent", "app_debug"})
public final class WordInfoViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myapplication.dictionary.domain.use_case.GetWordInfo getWordInfo = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.String> searchQuery = null;
    private final androidx.compose.runtime.MutableState<com.example.myapplication.dictionary.presentation.WordInfoState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.myapplication.dictionary.presentation.WordInfoState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.myapplication.dictionary.presentation.WordInfoViewModel.UIEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.myapplication.dictionary.presentation.WordInfoViewModel.UIEvent> eventFlow = null;
    private kotlinx.coroutines.Job searchJob;
    
    @javax.inject.Inject
    public WordInfoViewModel(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.domain.use_case.GetWordInfo getWordInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.myapplication.dictionary.presentation.WordInfoState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.myapplication.dictionary.presentation.WordInfoViewModel.UIEvent> getEventFlow() {
        return null;
    }
    
    public final void onSearch(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel$UIEvent;", "", "()V", "ShowInfoBox", "Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel$UIEvent$ShowInfoBox;", "app_debug"})
    public static abstract class UIEvent {
        
        private UIEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel$UIEvent$ShowInfoBox;", "Lcom/example/myapplication/dictionary/presentation/WordInfoViewModel$UIEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowInfoBox extends com.example.myapplication.dictionary.presentation.WordInfoViewModel.UIEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.myapplication.dictionary.presentation.WordInfoViewModel.UIEvent.ShowInfoBox copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowInfoBox(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
    }
}