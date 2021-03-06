// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package recaptcha.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class SiteverifyRequest_V1
{
	private final IMendixObject siteverifyRequest_V1MendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "reCAPTCHA.SiteverifyRequest_V1";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		privatekey("privatekey"),
		remoteip("remoteip"),
		challenge("challenge"),
		response("response");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public SiteverifyRequest_V1(IContext context)
	{
		this(context, Core.instantiate(context, "reCAPTCHA.SiteverifyRequest_V1"));
	}

	protected SiteverifyRequest_V1(IContext context, IMendixObject siteverifyRequest_V1MendixObject)
	{
		if (siteverifyRequest_V1MendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("reCAPTCHA.SiteverifyRequest_V1", siteverifyRequest_V1MendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a reCAPTCHA.SiteverifyRequest_V1");

		this.siteverifyRequest_V1MendixObject = siteverifyRequest_V1MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SiteverifyRequest_V1.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static recaptcha.proxies.SiteverifyRequest_V1 initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return recaptcha.proxies.SiteverifyRequest_V1.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static recaptcha.proxies.SiteverifyRequest_V1 initialize(IContext context, IMendixObject mendixObject)
	{
		return new recaptcha.proxies.SiteverifyRequest_V1(context, mendixObject);
	}

	public static recaptcha.proxies.SiteverifyRequest_V1 load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return recaptcha.proxies.SiteverifyRequest_V1.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of privatekey
	 */
	public final String getprivatekey()
	{
		return getprivatekey(getContext());
	}

	/**
	 * @param context
	 * @return value of privatekey
	 */
	public final String getprivatekey(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.privatekey.toString());
	}

	/**
	 * Set value of privatekey
	 * @param privatekey
	 */
	public final void setprivatekey(String privatekey)
	{
		setprivatekey(getContext(), privatekey);
	}

	/**
	 * Set value of privatekey
	 * @param context
	 * @param privatekey
	 */
	public final void setprivatekey(IContext context, String privatekey)
	{
		getMendixObject().setValue(context, MemberNames.privatekey.toString(), privatekey);
	}

	/**
	 * @return value of remoteip
	 */
	public final String getremoteip()
	{
		return getremoteip(getContext());
	}

	/**
	 * @param context
	 * @return value of remoteip
	 */
	public final String getremoteip(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.remoteip.toString());
	}

	/**
	 * Set value of remoteip
	 * @param remoteip
	 */
	public final void setremoteip(String remoteip)
	{
		setremoteip(getContext(), remoteip);
	}

	/**
	 * Set value of remoteip
	 * @param context
	 * @param remoteip
	 */
	public final void setremoteip(IContext context, String remoteip)
	{
		getMendixObject().setValue(context, MemberNames.remoteip.toString(), remoteip);
	}

	/**
	 * @return value of challenge
	 */
	public final String getchallenge()
	{
		return getchallenge(getContext());
	}

	/**
	 * @param context
	 * @return value of challenge
	 */
	public final String getchallenge(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.challenge.toString());
	}

	/**
	 * Set value of challenge
	 * @param challenge
	 */
	public final void setchallenge(String challenge)
	{
		setchallenge(getContext(), challenge);
	}

	/**
	 * Set value of challenge
	 * @param context
	 * @param challenge
	 */
	public final void setchallenge(IContext context, String challenge)
	{
		getMendixObject().setValue(context, MemberNames.challenge.toString(), challenge);
	}

	/**
	 * @return value of response
	 */
	public final String getresponse()
	{
		return getresponse(getContext());
	}

	/**
	 * @param context
	 * @return value of response
	 */
	public final String getresponse(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.response.toString());
	}

	/**
	 * Set value of response
	 * @param response
	 */
	public final void setresponse(String response)
	{
		setresponse(getContext(), response);
	}

	/**
	 * Set value of response
	 * @param context
	 * @param response
	 */
	public final void setresponse(IContext context, String response)
	{
		getMendixObject().setValue(context, MemberNames.response.toString(), response);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return siteverifyRequest_V1MendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final recaptcha.proxies.SiteverifyRequest_V1 that = (recaptcha.proxies.SiteverifyRequest_V1) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "reCAPTCHA.SiteverifyRequest_V1";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
