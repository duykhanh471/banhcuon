package com.example.myapplication.dictionary.di;

import android.app.Application;
import com.example.myapplication.dictionary.data.local.WordInfoDatabase;
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
public final class WordInfoModule_ProvideWordInfoDatabaseFactory implements Factory<WordInfoDatabase> {
  private final Provider<Application> appProvider;

  public WordInfoModule_ProvideWordInfoDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public WordInfoDatabase get() {
    return provideWordInfoDatabase(appProvider.get());
  }

  public static WordInfoModule_ProvideWordInfoDatabaseFactory create(
      Provider<Application> appProvider) {
    return new WordInfoModule_ProvideWordInfoDatabaseFactory(appProvider);
  }

  public static WordInfoDatabase provideWordInfoDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(WordInfoModule.INSTANCE.provideWordInfoDatabase(app));
  }
}
