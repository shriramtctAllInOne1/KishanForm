package com.kishan.form.management.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @author ram The Class SvmBaseEntity. Base Entity class for all model classes.
 */
@MappedSuperclass
public class SvmBaseEntity {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;

    /** The version. */
    @Version
    private Integer version;

    /**
     * Gets the id.
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id
     *            the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the version.
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * @param version
     *            the new version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (!(obj instanceof SvmBaseEntity)) { return false; }
        SvmBaseEntity other = (SvmBaseEntity) obj;
        if (id == null) {
            if (other.id != null) { return false; }
        } else if (!id.equals(other.id)) { return false; }
        if (version == null) {
            if (other.version != null) { return false; }
        } else if (!version.equals(other.version)) { return false; }
        return true;
    }
}
