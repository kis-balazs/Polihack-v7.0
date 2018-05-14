MainActivty.java
Intent intent = new Intent(LoginActivity.this, UserAreaActivity.class);
                                    intent.putExtra("theNameOfTheField", theFieldSent);
                                    LoginActivity.startActivity(intent);


MainActivity2.java
Intent intent = getIntent();
        final String getFieldSent = intent.getStringExtra("theNameOfTheField");


/**
* Notes : 'theFieldsSent' can be any type, just send it with the command
*         BUT : take care, the 'getFieldSent' type has to match the send field type
*
******************************************
* USE-CASE: send data between activities *
******************************************
******************************************
**/
        
