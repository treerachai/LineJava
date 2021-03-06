/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum IdentityProvider implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  LINE(1),
  NAVER_KR(2),
  LINE_PHONE(3);

  private final int value;

  private IdentityProvider(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static IdentityProvider findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return LINE;
      case 2:
        return NAVER_KR;
      case 3:
        return LINE_PHONE;
      default:
        return null;
    }
  }
}
