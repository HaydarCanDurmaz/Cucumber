Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | ismetU1lk1 |
      | codeInput | i3434      |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | ismetU1lk1 |

    Then Success message should be displayed


  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | ismyy1tU123lk1 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | ismyy1tU123lk1 |

    Then Success message should be displayed


  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | ipme1tFe44 |
      | codeInput       | h0934      |
      | integrationCode | 15454      |
      | priorityCode    | 15665      |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | ipme1tFe44 |

    Then Success message should be displayed












