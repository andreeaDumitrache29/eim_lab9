package ro.pub.cs.systems.eim.lab09.ngnsip.general;

public interface Constants {

    final public static String TAG = "[NgnSIP]";

    final public static boolean DEBUG = true;

    final public static String USERNAME = "andreea";
    final public static String IDENTITY_IMPI = "upb3";
    final public static String IDENTITY_PASSWORD = "7r8FT3Tbo8wZiRJi";
    final public static String DOMAIN = "upb3.onsip.com";
    final public static String NETWORK_PCSCF_HOST = "sip.onsip.com";
    final public static int NETWORK_PCSCF_PORT = 5060;
    final public static String NETWORK_REALM = "upb3.onsip.com";

    final public static boolean NETWORK_USE_3G = true;
    final public static int NETWORK_REGISTRATION_TIMEOUT = 3600;

    final public static String SIP_ADDRESS = "ro.pub.cs.systems.eim.lab09.ngnsip.SipAddress";

    final public static int ACCEPT_CALL_DELAY_TIME = 2000;
}
