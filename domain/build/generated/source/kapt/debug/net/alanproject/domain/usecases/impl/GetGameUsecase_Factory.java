// Generated by Dagger (https://dagger.dev).
package net.alanproject.domain.usecases.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import net.alanproject.domain.repository.RawgRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetGameUsecase_Factory implements Factory<GetGameUsecase> {
  private final Provider<RawgRepository> rawgRepositoryProvider;

  public GetGameUsecase_Factory(Provider<RawgRepository> rawgRepositoryProvider) {
    this.rawgRepositoryProvider = rawgRepositoryProvider;
  }

  @Override
  public GetGameUsecase get() {
    return newInstance(rawgRepositoryProvider.get());
  }

  public static GetGameUsecase_Factory create(Provider<RawgRepository> rawgRepositoryProvider) {
    return new GetGameUsecase_Factory(rawgRepositoryProvider);
  }

  public static GetGameUsecase newInstance(RawgRepository rawgRepository) {
    return new GetGameUsecase(rawgRepository);
  }
}
