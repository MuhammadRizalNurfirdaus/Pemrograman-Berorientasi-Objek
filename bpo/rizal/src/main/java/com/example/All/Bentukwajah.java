package com.example.All;

class Bentukwajah {
    public String respons()
    {return ("Perhatikan reaksi wajah saya\n");}
}
class Senyum extends Bentukwajah{
    public String respons()
    {return("Senyum karena senang\n");}
}
class Tertawa extends Bentukwajah{
    public String respons()
    {return("Tewtawa karena gembira\n");}
}
class Marah extends Bentukwajah{
    public String respons()
    {return("Kemarahan disebabkan bertengkar\n");}
}
class Sedih extends Bentukwajah{
    public String respons()
    {return("Sedih disebabkan cemburu\n");}
}