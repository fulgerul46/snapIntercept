package local.interceptmod.modules;

interface Obfuscator {
    // Snapchat version
    int VersionCode = 1809;
    String ExpectedVersion = "10.42.0.0";
    // Snap event - everything here is in the file of SnapEventKlass
    String SnapEventKlass = "aovg"; // find the file with "-FirstFrame" in it
    String SnapEventGetCacheKey = "k"; // return k() + "-FirstFrame";
    String SnapEventIsVideo = "aZ_"; // in the (aF_()) in the if statement above: return ajap.SNAP_VIDEO_RECEIVED ,search for SNAP_VIDEO_RECEIVED;
    String SnapEventUsername = "aH"; //  this.aH = str2;
    String SnapEventTimestamp = "y"; // this.y = j2;
    String SnapEventIsZipped= "aI"; // "isZipped", this.aI
    // Media cache - everything here is in the file of MediaCacheEntryKlass
    String MediaCacheEntryKlass = "aozv"; // find the file with ("mCache", this.a).a("mKey", this.b) in it
    String MediaCacheEntryConstructorFirstParam = "com.snapchat.android.framework.persistence.cache.Cache"; //  public ahzc(aknc aknc, String str) { this(aknc, str, null, false);}
    // Encryption
    String CbcEncryptionAlgorithmKlass = "com.snapchat.android.framework.crypto.CbcEncryptionAlgorithm";
    String CbcEncryptionAlgorithmDecrypt = "b";
    String EncryptionAlgorithmInterface = "com.snapchat.android.framework.crypto.EncryptionAlgorithm";
    // Root detection
    String RootDetectorKlass = "aqnq"; // "/sbin/su", "/system/bin/su"
    String RootDetectorFirst = "b";
    String RootDetectorSecond = "c";
    String RootDetectorThird = "d";
    String RootDetectorForth = "e";
}

