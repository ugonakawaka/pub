import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class TestMain {

	public static void main(String[] args) throws GSSException {
		// TAV Format 1

//		TAV Format 1
//
//		The TAV format 1 contains the following information:
//
//		    Version number
//		    Indicator of whether the optional Token Unique Reference is included in the signature calculation
//		    Digital signature algorithm identifier
//		    Digital signature calculated over:
//		        Full PAN of the card being digitized
//		        Expiration Date
//		        Token Unique Reference Included indicator value
//		        Token Unique Reference value (Optional)

		byte[] bs = new byte[] { 0x06, 0x08, 0x2a, (byte) 0x86, 0x48, (byte) 0xce, 0x3d, 0x03, 0x01, 0x07 };
		var o = new Oid(bs);
		System.out.println(o.toString());
	}
}
