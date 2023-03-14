class Sitios_naturales: LugaresTuristicos {
    var tiposFauna: Int = 0
    var patrimonioHumanidad: Boolean

    constructor(n:String, p:Int,v:Int, t: Int, pat:Boolean) : super(n,p,v) {
        tiposFauna = t
        patrimonioHumanidad = pat
    }

    override fun toString(): String {
        return "Sitios_naturales(tiposFauna=$tiposFauna, patrimonioHumanidad=$patrimonioHumanidad)"
    }


}



