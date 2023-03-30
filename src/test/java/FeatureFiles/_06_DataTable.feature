Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Country
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | countries     |
      | citizenShip   |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User Sending the keys in Dialog
      | nameInput |  | Kyf34f12   |
      | codeInput |  | 34563434ty |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | isme1tU12223lk1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed



