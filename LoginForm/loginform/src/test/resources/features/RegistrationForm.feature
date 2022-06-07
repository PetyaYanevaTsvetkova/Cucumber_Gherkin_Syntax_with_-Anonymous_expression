# Created by Petya Yaneva-Tsvetkova

Feature: Registration Functionality
  As a customer I want to create registration

  Scenario: Register with all mandatory fields
    Given print home "Welcome to Registration home page"
    When  I fill the all mandatory fields for creating the registration
    Then a message appears "Successfully created registration"

  Scenario: Register with all mandatory fields and optional fields
    Given print home "Welcome to Registration home page"
    When  I fill the all mandatory and optional fields for creating the registration
    Then a message appears "Successfully created registration"

  Scenario: Register with missing mandatory fields
    Given print home "Welcome to Registration home page"
    When  I don't fill the all mandatory and optional fields for creating the registration
    Then a message appears "Failed registration"