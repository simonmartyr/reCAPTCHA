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
public class SiteverifyResponse
{
	private final IMendixObject siteverifyResponseMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "reCAPTCHA.SiteverifyResponse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		success("success");

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

	public SiteverifyResponse(IContext context)
	{
		this(context, Core.instantiate(context, "reCAPTCHA.SiteverifyResponse"));
	}

	protected SiteverifyResponse(IContext context, IMendixObject siteverifyResponseMendixObject)
	{
		if (siteverifyResponseMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("reCAPTCHA.SiteverifyResponse", siteverifyResponseMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a reCAPTCHA.SiteverifyResponse");

		this.siteverifyResponseMendixObject = siteverifyResponseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SiteverifyResponse.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static recaptcha.proxies.SiteverifyResponse initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return recaptcha.proxies.SiteverifyResponse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static recaptcha.proxies.SiteverifyResponse initialize(IContext context, IMendixObject mendixObject)
	{
		return new recaptcha.proxies.SiteverifyResponse(context, mendixObject);
	}

	public static recaptcha.proxies.SiteverifyResponse load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return recaptcha.proxies.SiteverifyResponse.initialize(context, mendixObject);
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
	 * @return value of success
	 */
	public final Boolean getsuccess()
	{
		return getsuccess(getContext());
	}

	/**
	 * @param context
	 * @return value of success
	 */
	public final Boolean getsuccess(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.success.toString());
	}

	/**
	 * Set value of success
	 * @param success
	 */
	public final void setsuccess(Boolean success)
	{
		setsuccess(getContext(), success);
	}

	/**
	 * Set value of success
	 * @param context
	 * @param success
	 */
	public final void setsuccess(IContext context, Boolean success)
	{
		getMendixObject().setValue(context, MemberNames.success.toString(), success);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return siteverifyResponseMendixObject;
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
			final recaptcha.proxies.SiteverifyResponse that = (recaptcha.proxies.SiteverifyResponse) obj;
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
		return "reCAPTCHA.SiteverifyResponse";
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
