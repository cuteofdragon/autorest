// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.bodydate;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import java.util.Date;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

public class DateOperations {
    private DateService service;
    public DateOperations(RestAdapter restAdapter) {
        service = restAdapter.create(DateService.class);
    }
    public interface DateService {
        @GET("/date/null")
        Date getNull() throws ServiceException;

        @GET("/date/null")
        void getNullAsync(ServiceCallback<Date> serviceCallback);

        @GET("/date/invaliddate")
        Date getInvalidDate() throws ServiceException;

        @GET("/date/invaliddate")
        void getInvalidDateAsync(ServiceCallback<Date> serviceCallback);

        @GET("/date/overflowdate")
        Date getOverflowDate() throws ServiceException;

        @GET("/date/overflowdate")
        void getOverflowDateAsync(ServiceCallback<Date> serviceCallback);

        @GET("/date/underflowdate")
        Date getUnderflowDate() throws ServiceException;

        @GET("/date/underflowdate")
        void getUnderflowDateAsync(ServiceCallback<Date> serviceCallback);

        @PUT("/date/max")
        void putMaxDate(@Body Date dateBody) throws ServiceException;

        @PUT("/date/max")
        void putMaxDateAsync(@Body Date dateBody, ServiceCallback<Void> serviceCallback);

        @GET("/date/max")
        Date getMaxDate() throws ServiceException;

        @GET("/date/max")
        void getMaxDateAsync(ServiceCallback<Date> serviceCallback);

        @PUT("/date/min")
        void putMinDate(@Body Date dateBody) throws ServiceException;

        @PUT("/date/min")
        void putMinDateAsync(@Body Date dateBody, ServiceCallback<Void> serviceCallback);

        @GET("/date/min")
        Date getMinDate() throws ServiceException;

        @GET("/date/min")
        void getMinDateAsync(ServiceCallback<Date> serviceCallback);

    }
    public Date getNull() throws ServiceException {
        try {
            return getNullDelegate(service.getNull(), null).getBody();
        } catch (RetrofitError error) {
            return getNullDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getNullAsync(final ServiceCallback<Date> serviceCallback) {
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

    private ServiceResponse<Date> getNullDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public Date getInvalidDate() throws ServiceException {
        try {
            return getInvalidDateDelegate(service.getInvalidDate(), null).getBody();
        } catch (RetrofitError error) {
            return getInvalidDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getInvalidDateAsync(final ServiceCallback<Date> serviceCallback) {
        service.getInvalidDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getInvalidDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Date> getInvalidDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public Date getOverflowDate() throws ServiceException {
        try {
            return getOverflowDateDelegate(service.getOverflowDate(), null).getBody();
        } catch (RetrofitError error) {
            return getOverflowDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getOverflowDateAsync(final ServiceCallback<Date> serviceCallback) {
        service.getOverflowDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getOverflowDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Date> getOverflowDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public Date getUnderflowDate() throws ServiceException {
        try {
            return getUnderflowDateDelegate(service.getUnderflowDate(), null).getBody();
        } catch (RetrofitError error) {
            return getUnderflowDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getUnderflowDateAsync(final ServiceCallback<Date> serviceCallback) {
        service.getUnderflowDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getUnderflowDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Date> getUnderflowDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putMaxDate(Date dateBody) throws ServiceException {
        try {
            return putMaxDateDelegate(service.putMaxDate(dateBody), null).getBody();
        } catch (RetrofitError error) {
            return putMaxDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putMaxDateAsync(Date dateBody, final ServiceCallback<Void> serviceCallback) {
        service.putMaxDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMaxDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMaxDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                  .register(200, Void.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public Date getMaxDate() throws ServiceException {
        try {
            return getMaxDateDelegate(service.getMaxDate(), null).getBody();
        } catch (RetrofitError error) {
            return getMaxDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getMaxDateAsync(final ServiceCallback<Date> serviceCallback) {
        service.getMaxDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMaxDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Date> getMaxDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public void putMinDate(Date dateBody) throws ServiceException {
        try {
            return putMinDateDelegate(service.putMinDate(dateBody), null).getBody();
        } catch (RetrofitError error) {
            return putMinDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void putMinDateAsync(Date dateBody, final ServiceCallback<Void> serviceCallback) {
        service.putMinDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(putMinDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Void> putMinDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                  .register(200, Void.class)
                  .registerError(Error)
                  .build(response, error);
    }

    public Date getMinDate() throws ServiceException {
        try {
            return getMinDateDelegate(service.getMinDate(), null).getBody();
        } catch (RetrofitError error) {
            return getMinDateDelegate(error.getResponse(), error).getBody();
        }
    }

    public void getMinDateAsync(final ServiceCallback<Date> serviceCallback) {
        service.getMinDateAsyncd(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(getMinDateDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Date> getMinDateDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Date>()
                  .register(200, Date.class)
                  .registerError(Error)
                  .build(response, error);
    }

}
