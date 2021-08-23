package com.browser.browserapp.dto;

public class BrowserDTO {
	private String name;
	private String version;
	private String sizeInMb;



	public void BrowserDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSizeInMb() {
		return sizeInMb;
	}



	public void setSizeInMb(String string) {
		this.sizeInMb = string;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sizeInMb == null) ? 0 : sizeInMb.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BrowserDTO other = (BrowserDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sizeInMb == null) {
			if (other.sizeInMb != null)
				return false;
		} else if (!sizeInMb.equals(other.sizeInMb))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BrowserDTO [name=" + name + ", version=" + version + ", sizeInMb=" + sizeInMb + "]";
	}

	}


