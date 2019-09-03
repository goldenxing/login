package com.shaoxing.entity;

public class SysPermission {
	private Integer id;

    private String available;

    private String name;

    private Integer parentId;

    private String parentIds;

    private String permission;

    private String resourceType;

    private String url;
    public SysPermission(Integer id, String available, String name, Integer parentId, String parentIds, String permission, String resourceType, String url) {
        this.id = id;
        this.available = available;
        this.name = name;
        this.parentId = parentId;
        this.parentIds = parentIds;
        this.permission = permission;
        this.resourceType = resourceType;
        this.url = url;
    }
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the available
	 */
	public String getAvailable() {
		return available;
	}
	/**
	 * @param available the available to setfdfsdf
	 */
	public void setAvailable(String available) {
		this.available = available;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the parentId
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return the parentIds
	 */
	public String getParentIds() {
		return parentIds;
	}
	/**
	 * @param parentIds the parentIds to set
	 */
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}
	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}
	/**
	 * @return the resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}
	/**
	 * @param resourceType the resourceType to set
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
    
}
