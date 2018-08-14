package com.cg.organization;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cg.address.Address;

public class Organization {
private String name;
private Address address;
private double marketValue;
private String established;
private int employeeCount;
private Set<String> globalPresence;
private List<String> boardMembers;
private Map<String,String> projectManagers;
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
	result = prime * result + employeeCount;
	result = prime * result + ((established == null) ? 0 : established.hashCode());
	result = prime * result + ((globalPresence == null) ? 0 : globalPresence.hashCode());
	long temp;
	temp = Double.doubleToLongBits(marketValue);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((projectManagers == null) ? 0 : projectManagers.hashCode());
	return result;
}
public Organization(String name, Address address, int employeeCount, String established, double marketValue,
		List<String> boardMembers, Set<String> globalPresence, Map<String, String> projectManagers) {
	super();
	this.name = name;
	this.address = address;
	this.employeeCount = employeeCount;
	this.established = established;
	this.marketValue = marketValue;
	this.boardMembers = boardMembers;
	this.globalPresence = globalPresence;
	this.projectManagers = projectManagers;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Organization other = (Organization) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (boardMembers == null) {
		if (other.boardMembers != null)
			return false;
	} else if (!boardMembers.equals(other.boardMembers))
		return false;
	if (employeeCount != other.employeeCount)
		return false;
	if (established == null) {
		if (other.established != null)
			return false;
	} else if (!established.equals(other.established))
		return false;
	if (globalPresence == null) {
		if (other.globalPresence != null)
			return false;
	} else if (!globalPresence.equals(other.globalPresence))
		return false;
	if (Double.doubleToLongBits(marketValue) != Double.doubleToLongBits(other.marketValue))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (projectManagers == null) {
		if (other.projectManagers != null)
			return false;
	} else if (!projectManagers.equals(other.projectManagers))
		return false;
	return true;
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
 * @return the address
 */
public Address getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}
/**
 * @return the marketValue
 */
public double getMarketValue() {
	return marketValue;
}
/**
 * @param marketValue the marketValue to set
 */
public void setMarketValue(double marketValue) {
	this.marketValue = marketValue;
}
/**
 * @return the established
 */
public String getEstablished() {
	return established;
}
/**
 * @param established the established to set
 */
public void setEstablished(String established) {
	this.established = established;
}
/**
 * @return the employeeCount
 */
public int getEmployeeCount() {
	return employeeCount;
}
/**
 * @param employeeCount the employeeCount to set
 */
public void setEmployeeCount(int employeeCount) {
	this.employeeCount = employeeCount;
}
/**
 * @return the globalPresence
 */
public Set<String> getGlobalPresence() {
	return globalPresence;
}
/**
 * @param globalPresence the globalPresence to set
 */
public void setGlobalPresence(Set<String> globalPresence) {
	this.globalPresence = globalPresence;
}
/**
 * @return the boardMembers
 */
public List<String> getBoardMembers() {
	return boardMembers;
}
/**
 * @param boardMembers the boardMembers to set
 */
public void setBoardMembers(List<String> boardMembers) {
	this.boardMembers = boardMembers;
}
/**
 * @return the projectManagers
 */
public Map<String, String> getProjectManagers() {
	return projectManagers;
}
/**
 * @param projectManagers the projectManagers to set
 */
public void setProjectManagers(Map<String, String> projectManagers) {
	this.projectManagers = projectManagers;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
			+ established + ", employeeCount=" + employeeCount + ", globalPresence=" + globalPresence
			+ ", boardMembers=" + boardMembers + ", projectManagers=" + projectManagers + "]";
}


}
