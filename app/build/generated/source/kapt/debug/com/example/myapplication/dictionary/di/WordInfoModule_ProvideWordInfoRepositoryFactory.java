package com.example.myapplication.dictionary.di;

import com.example.myapplication.dictionary.data.local.WordInfoDatabase;
import com.example.myapplication.dictionary.data.remote.DictionaryAPI;
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository;
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
public final class WordInfoModule_ProvideWordInfoRepositoryFactory implements Factory<WordInfoRepository> {
  private final Provider<WordInfoDatabase> dbProvider;

  private final Provider<DictionaryAPI> apiProvider;

  public WordInfoModule_ProvideWordInfoRepositoryFactory(Provider<WordInfoDatabase> dbProvider,
      Provider<DictionaryAPI> apiProvider) {
    this.dbProvider = dbProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public WordInfoRepository get() {
    return provideWordInfoRepository(dbProvider.get(), apiProvider.get());
  }

  public static WordInfoModule_ProvideWordInfoRepositoryFactory create(
      Provider<WordInfoDatabase> dbProvider, Provider<DictionaryAPI> apiProvider) {
    return new WordInfoModule_ProvideWordInfoRepositoryFactory(dbProvider, apiProvider);
  }

  public static WordInfoRepository provideWordInfoRepository(WordInfoDatabase db,
      DictionaryAPI api) {
    return Preconditions.checkNotNullFromProvides(WordInfoModule.INSTANCE.provideWordInfoRepository(db, api));
  }
}
