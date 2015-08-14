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
import fixtures.bodycomplex.models.ArrayWrapper;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

public class Array {
    private ArrayService service;
    public Array(RestAdapter restAdapter) {
        service = restAdapter.create(ArrayService.class);
    }
    public interface ArrayService {
        @GET("/complex/array/valid")
        ArrayWrapper getValid() throws ServiceException;

        @GET("/complex/array/valid")
        void getValidAsync(ServiceCallback<ArrayWrapper> serviceCallback);

        @PUT("/complex/array/valid")
        void putValid(@Body ArrayWrapper complexBody) throws ServiceException;

        @PUT("/complex/array/valid")
        void putValidAsync(@Body ArrayWrapper complexBody, ServiceCallback<Void> serviceCallback);

        @GET("/complex/array/empty")
        ArrayWrapper getEmpty() throws ServiceException;

        @GET("/complex/array/empty")
        void getEmptyAsync(ServiceCallback<ArrayWrapper> serviceCallback);

        @PUT("/complex/array/empty")
        void putEmpty(@Body ArrayWrapper complexBody) throws ServiceException;

        @PUT("/complex/array/empty")
        void putEmptyAsync(@Body ArrayWrapper complexBody, ServiceCallback<Void> serviceCallback);

        @GET("/complex/array/notprovided")
        ArrayWrapper getNotProvided() throws ServiceException;

        @GET("/complex/array/notprovided")
        void getNotProvidedAsync(ServiceCallback<ArrayWrapper> serviceCallback);

    }
    public ArrayWrapper getValid() throws ServiceException {
        try {
            return getValidDelegate(service.getValid(), null).getBody();
        } catch (RetrofitError error) {
            return getValidDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
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

    private ServiceResponse<ArrayWrapper> getValidDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                  .register(200, ArrayWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putValid(ArrayWrapper complexBody) throws ServiceException {
        try {
            return putValidDelegate(service.putValid(complexBody), null).getBody();
        } catch (RetrofitError error) {
            return putValidDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
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

    public ArrayWrapper getEmpty() throws ServiceException {
        try {
            return getEmptyDelegate(service.getEmpty(), null).getBody();
        } catch (RetrofitError error) {
            return getEmptyDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
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

    private ServiceResponse<ArrayWrapper> getEmptyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                  .register(200, ArrayWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putEmpty(ArrayWrapper complexBody) throws ServiceException {
        try {
            return putEmptyDelegate(service.putEmpty(complexBody), null).getBody();
        } catch (RetrofitError error) {
            return putEmptyDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback) {
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

    public ArrayWrapper getNotProvided() throws ServiceException {
        try {
            return getNotProvidedDelegate(service.getNotProvided(), null).getBody();
        } catch (RetrofitError error) {
            return getNotProvidedDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback) {
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

    private ServiceResponse<ArrayWrapper> getNotProvidedDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<ArrayWrapper>()
                  .register(200, ArrayWrapper.class)
                  .registerError(Error)
                  .build(response, error);
    }

}
