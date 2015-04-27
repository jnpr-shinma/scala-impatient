package assignable;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangType;

/**
 * Created by maxin on 15-1-20.
 */
public class B extends YangString{
    public B(String value) throws YangException {
        super(value);
    }
}