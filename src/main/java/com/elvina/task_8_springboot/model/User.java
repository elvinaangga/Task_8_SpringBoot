package com.elvina.task_8_springboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
@Access(AccessType.FIELD)
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "first_name", nullable = false)
        @NotBlank(message = "First name is required")
        @Pattern(regexp = "^[A-Za-z]+$", message = "First name must contain only letters")
        private String firstName;

        @Column(name = "last_name", nullable = false)
        @NotBlank(message = "Last name is required")
        @Pattern(regexp = "^[A-Za-z]+$", message = "Last name must contain only letters")
        private String lastName;

        @Column(name = "email", nullable = false)
        private String email;

        // getters & setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getFirstName() {   // F besar
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {   // L besar
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
}

