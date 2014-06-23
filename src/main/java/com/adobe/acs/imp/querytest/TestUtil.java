package com.adobe.acs.imp.querytest;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleReference;
import org.osgi.framework.ServiceReference;

public class TestUtil {

    public static Object getOSGIService(Class<?> clazz) {
        BundleContext bundleContext = BundleReference.class.cast(TestUtil.class.getClassLoader()).getBundle().getBundleContext();
        ServiceReference serviceReference = bundleContext.getServiceReference(clazz.getName());
        return bundleContext.getService(serviceReference);
}
}
