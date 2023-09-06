package com.example.myapplication.dictionary.di;

import com.example.myapplication.dictionary.domain.repository.WordInfoRepository;
import com.example.myapplication.dictionary.domain.use_case.GetWordInfo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class WordInfoModule_ProvideGetWordInfoUseCaseFactory implements Factory<GetWordInfo> {
  private final Provider<WordInfoRepository> repositoryProvider;

  public WordInfoModule_ProvideGetWordInfoUseCaseFactory(
      Provider<WordInfoRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetWordInfo get() {
    return provideGetWordInfoUseCase(repositoryProvider.get());
  }

  public static WordInfoModule_ProvideGetWordInfoUseCaseFactory create(
      Provider<WordInfoRepository> repositoryProvider) {
    return new WordInfoModule_ProvideGetWordInfoUseCaseFactory(repositoryProvider);
  }

  public static GetWordInfo provideGetWordInfoUseCase(WordInfoRepository repository) {
    return Preconditions.checkNotNullFromProvides(WordInfoModule.INSTANCE.provideGetWordInfoUseCase(repository));
  }
}
