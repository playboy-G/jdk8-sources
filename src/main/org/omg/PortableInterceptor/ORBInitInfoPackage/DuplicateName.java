package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
* org/omg/PortableInterceptor/ORBInitInfoPackage/DuplicateName.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u281/880/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, December 9, 2020 1:55:54 PM UTC
*/

public final class DuplicateName extends org.omg.CORBA.UserException
{

  /** 
       * The name for which there was already an interceptor registered.
       */
  public String name = null;

  public DuplicateName ()
  {
    super(DuplicateNameHelper.id());
  } // ctor

  public DuplicateName (String _name)
  {
    super(DuplicateNameHelper.id());
    name = _name;
  } // ctor


  public DuplicateName (String $reason, String _name)
  {
    super(DuplicateNameHelper.id() + "  " + $reason);
    name = _name;
  } // ctor

} // class DuplicateName
