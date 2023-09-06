package com.example.myapplication.dictionary.presentation;

import com.example.myapplication.dictionary.domain.use_case.GetWordInfo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class WordInfoViewModel_Factory implements Factory<WordInfoViewModel> {
  private final Provider<GetWordInfo> getWordInfoProvider;

  public WordInfoViewModel_Factory(Provider<GetWordInfo> getWordInfoProvider) {
    this.getWordInfoProvider = getWordInfoProvider;
  }

  @Override
  public WordInfoViewModel get() {
    return newInstance(getWordInfoProvider.get());
  }

  public static WordInfoViewModel_Factory create(Provider<GetWordInfo> getWordInfoProvider) {
    return new WordInfoViewModel_Factory(getWordInfoProvider);
  }

  public static WordInfoViewModel newInstance(GetWordInfo getWordInfo) {
    return new WordInfoViewModel(getWordInfo);
  }
}
