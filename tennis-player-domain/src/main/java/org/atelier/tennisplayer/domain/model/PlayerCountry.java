package org.atelier.tennisplayer.domain.model;

import java.util.Objects;

public class PlayerCountry {
    private final String picture;
    private final String code;

    private PlayerCountry(Builder builder) {
        picture = builder.picture;
        code = builder.code;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getPicture() {
        return picture;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerCountry playerCountry)) return false;
        return Objects.equals(picture, playerCountry.picture) && Objects.equals(code, playerCountry.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picture, code);
    }

    @Override
    public String toString() {
        return "Country{" +
                "picture='" + picture + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public static final class Builder {
        private String picture;
        private String code;

        private Builder() {}

        public Builder withPicture(String picture) {
            this.picture = picture;
            return this;
        }

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public PlayerCountry build() {
            return new PlayerCountry(this);
        }
    }
}