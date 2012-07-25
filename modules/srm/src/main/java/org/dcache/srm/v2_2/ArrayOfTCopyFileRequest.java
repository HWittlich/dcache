/**
 * ArrayOfTCopyFileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package org.dcache.srm.v2_2;

public class ArrayOfTCopyFileRequest  implements java.io.Serializable {
    private org.dcache.srm.v2_2.TCopyFileRequest[] requestArray;

    public ArrayOfTCopyFileRequest() {
    }

    public ArrayOfTCopyFileRequest(
           org.dcache.srm.v2_2.TCopyFileRequest[] requestArray) {
           this.requestArray = requestArray;
    }


    /**
     * Gets the requestArray value for this ArrayOfTCopyFileRequest.
     * 
     * @return requestArray
     */
    public org.dcache.srm.v2_2.TCopyFileRequest[] getRequestArray() {
        return requestArray;
    }


    /**
     * Sets the requestArray value for this ArrayOfTCopyFileRequest.
     * 
     * @param requestArray
     */
    public void setRequestArray(org.dcache.srm.v2_2.TCopyFileRequest[] requestArray) {
        this.requestArray = requestArray;
    }

    public org.dcache.srm.v2_2.TCopyFileRequest getRequestArray(int i) {
        return this.requestArray[i];
    }

    public void setRequestArray(int i, org.dcache.srm.v2_2.TCopyFileRequest _value) {
        this.requestArray[i] = _value;
    }

    private java.lang.Object __equalsCalc;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfTCopyFileRequest)) {
            return false;
        }
        ArrayOfTCopyFileRequest other = (ArrayOfTCopyFileRequest) obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestArray==null && other.getRequestArray()==null) || 
             (this.requestArray!=null &&
              java.util.Arrays.equals(this.requestArray, other.getRequestArray())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfTCopyFileRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://srm.lbl.gov/StorageResourceManager", "ArrayOfTCopyFileRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://srm.lbl.gov/StorageResourceManager", "TCopyFileRequest"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
