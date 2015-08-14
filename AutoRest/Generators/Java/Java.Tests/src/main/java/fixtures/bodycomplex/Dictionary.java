// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import fixtures.bodycomplex.models.DictionaryWrapper;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

public class Dictionary {
    private DictionaryService service;
    public Dictionary(RestAdapter restAdapter) {
        service = restAdapter.create(DictionaryService.class);
    }
    public interface DictionaryService {
        @GET("/complex/dictionary/typed/valid")
        DictionaryWrapper getValid() throws ServiceException;

        @GET("/complex/dictionary/typed/valid")
        void getValidAsync(ServiceCallback<DictionaryWrapper> serviceCallback);

        @PUT("/complex/dictionary/typed/valid")
        void putValid(@Body DictionaryWrapper complexBody) throws ServiceException;

        @PUT("/complex/dictionary/typed/valid")
        void putValidAsync(@Body DictionaryWrapper complexBody, ServiceCallback<Void> serviceCallback);

        @GET("/complex/dictionary/typed/empty")
        DictionaryWrapper getEmpty() throws ServiceException;

        @GET("/complex/dictionary/typed/empty")
        void getEmptyAsync(ServiceCallback<DictionaryWrapper> serviceCallback);

        @PUT("/complex/dictionary/typed/empty")
        void putEmpty(@Body DictionaryWrapper complexBody) throws ServiceException;

        @PUT("/complex/dictionary/typed/empty")
        void putEmptyAsync(@Body DictionaryWrapper complexBody, ServiceCallback<Void> serviceCallback);

        @GET("/complex/dictionary/typed/null")
        DictionaryWrapper getNull() throws ServiceException;

        @GET("/complex/dictionary/typed/null")
        void getNullAsync(ServiceCallback<DictionaryWrapper> serviceCallback);

        @GET("/complex/dictionary/typed/notprovided")
        DictionaryWrapper getNotProvided() throws ServiceException;

        @GET("/complex/dictionary/typed/notprovided")
        void getNotProvidedAsync(ServiceCallback<DictionaryWrapper> serviceCallback);

    }
    public DictionaryWrapper getValid() throws ServiceException {
        try {
            return getValidDelegate(service.getValid(), null).getBody();
        } catch (RetrofitError error) {
            return getValidDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        service.getValidAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DictionaryWrapper> getValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DictionaryWrapper>()
                  .register(200, DictionaryWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putValid(DictionaryWrapper complexBody) throws ServiceException {
        try {
            return putValidDelegate(service.putValid(complexBody), null).getBody();
        } catch (RetrofitError error) {
            return putValidDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        service.putValidAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putValidDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                  .register(200, Void.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public DictionaryWrapper getEmpty() throws ServiceException {
        try {
            return getEmptyDelegate(service.getEmpty(), null).getBody();
        } catch (RetrofitError error) {
            return getEmptyDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        service.getEmptyAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DictionaryWrapper> getEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DictionaryWrapper>()
                  .register(200, DictionaryWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putEmpty(DictionaryWrapper complexBody) throws ServiceException {
        try {
            return putEmptyDelegate(service.putEmpty(complexBody), null).getBody();
        } catch (RetrofitError error) {
            return putEmptyDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
        service.putEmptyAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putEmptyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                  .register(200, Void.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public DictionaryWrapper getNull() throws ServiceException {
        try {
            return getNullDelegate(service.getNull(), null).getBody();
        } catch (RetrofitError error) {
            return getNullDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        service.getNullAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNullDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DictionaryWrapper> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DictionaryWrapper>()
                  .register(200, DictionaryWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public DictionaryWrapper getNotProvided() throws ServiceException {
        try {
            return getNotProvidedDelegate(service.getNotProvided(), null).getBody();
        } catch (RetrofitError error) {
            return getNotProvidedDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback) {
        service.getNotProvidedAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getNotProvidedDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<DictionaryWrapper> getNotProvidedDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<DictionaryWrapper>()
                  .register(200, DictionaryWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

}
