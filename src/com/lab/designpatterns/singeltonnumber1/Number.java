package com.lab.designpatterns.singeltonnumber1;

public class Number implements Convert {
    private static Number INSTANCE;

    public static Number instance() {
        if (INSTANCE == null) {
            INSTANCE = new Number();
        }
        return INSTANCE;
    }

    private Number() {
    }

    @Override
    public void convertToWords(String number) {
        char[] arrayNumber = number.toCharArray();

        int arrayLength = arrayNumber.length;

        if (arrayLength == 0) {
            System.out.println("The input is an empty string.");
            return;
        }
        /*
         * if (arrayLength > 4) { System.out.
         * println("The Length of the input number is more than 4 digits.");
         * return; }
         */

        String[] ones = new String[] { "Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine " };

        String[] teens = new String[] { "",
                                        "Ten ",
                                        "Eleven ",
                                        "Twelve ",
                                        "Thirteen ",
                                        "Fourteen ",
                                        "Fifteen ",
                                        "Sixteen ",
                                        "Seventeen ",
                                        "Eighteen ",
                                        "Nineteen " };

        String[] multiples_of_ten = new String[] { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety " };

        String[] hundred_thousand_million = new String[] { "Hundred ", "Thousand ", "Million ", "Billion " };

        // String[] hundred_million = new String[] { "Hundred", "Million" };

        if (arrayLength == 1) {
            System.out.println(ones[arrayNumber[0] - '0']);
            return;
        }
        /** MILLIONS TO HUNDRED MILLIONS **/
        if (arrayLength == 9) {
            // 1st 3
            if (arrayNumber[0] == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[0] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[1] - '0' == 1) {
                System.out.print(teens[arrayNumber[2] + 1 - '0']);
                System.out.print(hundred_thousand_million[2]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[1] - '0']);
                if (arrayNumber[2] - '0' == 0) {
                    System.out.print(hundred_thousand_million[2]);
                } else {
                    System.out.print(ones[arrayNumber[2] - '0']);
                    System.out.print(hundred_thousand_million[2]);
                }

            }

            // 2nd 3
            if (arrayNumber[3] == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[3] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[4] - '0' == 1) {
                System.out.print(teens[arrayNumber[5] + 1 - '0']);
                System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[4] - '0']);
                if (arrayNumber[5] - '0' == 0) {
                    System.out.print(hundred_thousand_million[1]);
                } else {
                    System.out.print(ones[arrayNumber[5] - '0']);
                    System.out.print(hundred_thousand_million[1]);
                }

            }
            // 3rd 3
            //
            if (arrayNumber[6] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[6] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[7] - '0' == 1) {
                System.out.print(teens[arrayNumber[8] + 1 - '0']);
                // System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[7] - '0']);
                // System.out.print(ones[arrayNumber[8] - '0']);

                if (arrayNumber[8] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[8] - '0']);

                }

            }

        }

        // 8 DIGITS
        if (arrayLength == 8) {
            // 1st 3
            if (arrayNumber[0] - '0' == 1) {
                System.out.print(teens[arrayNumber[1] + 1 - '0']);
                System.out.print(hundred_thousand_million[2]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[0] - '0']);
                if (arrayNumber[1] - '0' == 0) {
                    System.out.print(hundred_thousand_million[2]);
                } else {
                    System.out.print(ones[arrayNumber[1] - '0']);
                    System.out.print(hundred_thousand_million[2]);
                }

            }

            // 2nd 3
            if (arrayNumber[2] == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[2] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[3] - '0' == 1) {
                System.out.print(teens[arrayNumber[4] + 1 - '0']);
                System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[3] - '0']);
                if (arrayNumber[4] - '0' == 0) {
                    System.out.print(hundred_thousand_million[1]);
                } else {
                    System.out.print(ones[arrayNumber[4] - '0']);
                    System.out.print(hundred_thousand_million[1]);
                }

            }
            // 3rd 3
            //
            if (arrayNumber[5] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[5] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[6] - '0' == 1) {
                System.out.print(teens[arrayNumber[7] + 1 - '0']);
                // System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[6] - '0']);
                // System.out.print(ones[arrayNumber[7] - '0']);

                if (arrayNumber[7] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[7] - '0']);

                }

            }

        }

        // 7 DIGITS
        if (arrayLength == 7) {
            // 1st 3
            if (arrayNumber[0] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[0] - '0']);
                System.out.print(hundred_thousand_million[2]);
            }

            // 2nd 3
            if (arrayNumber[1] == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[1] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[2] - '0' == 1) {
                System.out.print(teens[arrayNumber[3] + 1 - '0']);
                System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[2] - '0']);
                if (arrayNumber[3] - '0' == 0) {
                    System.out.print(hundred_thousand_million[1]);
                } else {
                    System.out.print(ones[arrayNumber[3] - '0']);
                    System.out.print(hundred_thousand_million[1]);
                }

            }
            // 3rd 3
            //
            if (arrayNumber[4] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[4] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[5] - '0' == 1) {
                System.out.print(teens[arrayNumber[6] + 1 - '0']);
                // System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[5] - '0']);
                // System.out.print(ones[arrayNumber[6] - '0']);

                if (arrayNumber[6] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[6] - '0']);

                }

            }

        }

        /*** THOUSANDS TO HUNDRED THOUSANDS ***/
        if (arrayLength == 6) {

            // first 3
            if (arrayNumber[0] == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[0] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[1] - '0' == 1) {
                System.out.print(teens[arrayNumber[2] + 1 - '0']);
                System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[1] - '0']);
                if (arrayNumber[2] - '0' == 0) {
                    System.out.print(hundred_thousand_million[1]);
                } else {
                    System.out.print(ones[arrayNumber[2] - '0']);
                    System.out.print(hundred_thousand_million[1]);
                }

            }

            //
            if (arrayNumber[3] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[3] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[4] - '0' == 1) {
                System.out.print(teens[arrayNumber[5] + 1 - '0']);
                // System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[4] - '0']);
                // System.out.print(ones[arrayNumber[5] - '0']);

                if (arrayNumber[5] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[5] - '0']);

                }

            }

        }

        // 5
        if (arrayLength == 5) {

            // first 3

            if (arrayNumber[0] - '0' == 1) {
                System.out.print(teens[arrayNumber[1] + 1 - '0']);
                System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[0] - '0']);
                if (arrayNumber[1] - '0' == 0) {
                    System.out.print(hundred_thousand_million[1]);
                } else {
                    System.out.print(ones[arrayNumber[1] - '0']);
                    System.out.print(hundred_thousand_million[1]);
                }

            }

            //
            if (arrayNumber[2] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[2] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[3] - '0' == 1) {
                System.out.print(teens[arrayNumber[4] + 1 - '0']);
                // System.out.print(hundred_thousand_million[1]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[3] - '0']);
                // System.out.print(ones[arrayNumber[5] - '0']);

                if (arrayNumber[4] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[4] - '0']);

                }

            }

        }

        // 4

        if (arrayLength == 4) {

            // first 3

            if (arrayNumber[0] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[0] - '0']);
                System.out.print(hundred_thousand_million[1]);
            }

            //
            if (arrayNumber[1] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[1] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[2] - '0' == 1) {
                System.out.print(teens[arrayNumber[3] + 1 - '0']);
                // System.out.print(hundred_thousand_million[0]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[2] - '0']);
                // System.out.print(ones[arrayNumber[5] - '0']);

                if (arrayNumber[3] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[3] - '0']);

                }

            }

        }

        // 3
        if (arrayLength == 3) {

            //
            if (arrayNumber[0] - '0' == 0) {
                System.out.print("");
            } else {
                System.out.print(ones[arrayNumber[0] - '0']);
                System.out.print(hundred_thousand_million[0]);
            }

            if (arrayNumber[1] - '0' == 1) {
                System.out.print(teens[arrayNumber[2] + 1 - '0']);
                // System.out.print(hundred_thousand_million[0]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[1] - '0']);
                // System.out.print(ones[arrayNumber[5] - '0']);

                if (arrayNumber[2] - '0' == 0) {
                    System.out.print("");
                } else {
                    System.out.print(ones[arrayNumber[2] - '0']);

                }

            }

        }

        // 2
        if (arrayLength == 2) {
            if (arrayNumber[0] - '0' == 1) {
                System.out.print(teens[arrayNumber[1] + 1 - '0']);
                // System.out.print(hundred_thousand_million[2]);
            } else {
                System.out.print(multiples_of_ten[arrayNumber[0] - '0']);

                System.out.print(ones[arrayNumber[1] - '0']);
                //System.out.print(hundred_thousand_million[2]);

            }

        }

    }

}
