package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GiroProduto implements SankhyaEntity<GiroProduto> {

   private BigDecimal codLocal;
   private BigDecimal codParcForn;
   private BigDecimal codProd;
   private BigDecimal codRel;
   private String codVol;
   private String codVolCompra;
   private String complDesc;
   private String controlado;
   private String controle;
   private String curvaMarg1;
   private String curvaMarg10;
   private String curvaMarg11;
   private String curvaMarg12;
   private String curvaMarg2;
   private String curvaMarg3;
   private String curvaMarg4;
   private String curvaMarg5;
   private String curvaMarg6;
   private String curvaMarg7;
   private String curvaMarg8;
   private String curvaMarg9;
   private String curvaPeso1;
   private String curvaPeso10;
   private String curvaPeso11;
   private String curvaPeso12;
   private String curvaPeso2;
   private String curvaPeso3;
   private String curvaPeso4;
   private String curvaPeso5;
   private String curvaPeso6;
   private String curvaPeso7;
   private String curvaPeso8;
   private String curvaPeso9;
   private String curvaQtd1;
   private String curvaQtd10;
   private String curvaQtd11;
   private String curvaQtd12;
   private String curvaQtd2;
   private String curvaQtd3;
   private String curvaQtd4;
   private String curvaQtd5;
   private String curvaQtd6;
   private String curvaQtd7;
   private String curvaQtd8;
   private String curvaQtd9;
   private String curvaTot1;
   private String curvaTot10;
   private String curvaTot11;
   private String curvaTot12;
   private String curvaTot2;
   private String curvaTot3;
   private String curvaTot4;
   private Timestamp ultCompra;
   private Timestamp ultVenda;
   private BigDecimal vlrCredIcms;
   private BigDecimal vlrGastoVar1;
   private BigDecimal vlrGastoVar6;
   private BigDecimal vlrGastoVar7;
   private BigDecimal vlrGastoVar8;
   private BigDecimal vlrGastoVar9;
   private BigDecimal vlrMargCont1;
   private BigDecimal vlrMargCont10;
   private BigDecimal vlrMargCont11;
   private BigDecimal vlrMargCont12;
   private BigDecimal vlrMargCont2;
   private BigDecimal vlrMargCont3;
   private BigDecimal vlrMargCont4;
   private BigDecimal vlrMargCont5;
   private BigDecimal vlrMargCont6;
   private BigDecimal vlrMargCont7;
   private BigDecimal vlrMargCont8;
   private BigDecimal vlrMargCont9;
   private BigDecimal vlrTabPreco;
   private BigDecimal vlrTot1;
   private BigDecimal vlrTot10;
   private BigDecimal vlrTot11;
   private BigDecimal vlrTot12;
   private BigDecimal vlrTot2;
   private BigDecimal vlrTot3;
   private BigDecimal vlrTot4;
   private BigDecimal vlrTot5;
   private BigDecimal vlrTot6;
   private BigDecimal vlrTot7;
   private BigDecimal vlrTot8;
   private BigDecimal vlrTot9;
   private BigDecimal vlrUnit1;
   private BigDecimal vlrUnit10;
   private BigDecimal vlrUnit11;
   private BigDecimal vlrUnit12;
   private BigDecimal vlrUnit2;
   private BigDecimal vlrUnit3;
   private BigDecimal vlrUnit4;
   private BigDecimal vlrUnit5;
   private BigDecimal vlrUnit6;
   private BigDecimal acumPeso4;
   private BigDecimal acumPeso5;
   private BigDecimal acumPeso6;
   private BigDecimal popularidade7;
   private BigDecimal popularidade8;
   private BigDecimal popularidade9;
   private BigDecimal acumMarg9;
   private BigDecimal acumPeso1;
   private BigDecimal acumPeso10;
   private BigDecimal estMax;
   private BigDecimal custoVenda12;
   private BigDecimal custoVenda2;
   private BigDecimal custoVenda3;
   private BigDecimal custoVenda4;
   private BigDecimal custoVenda5;
   private BigDecimal vlrGastoVar10;
   private BigDecimal vlrGastoVar11;
   private BigDecimal vlrGastoVar12;
   private BigDecimal vlrGastoVar2;
   private BigDecimal sugCompra;
   private BigDecimal sugCompraGir;
   private String termolabil;
   private BigDecimal custoVndTotal8;
   private BigDecimal custoVndTotal9;
   private BigDecimal descMax;
   private BigDecimal diasSemVenda;
   private BigDecimal durEst;
   private BigDecimal durEstPosCpa;
   private BigDecimal estCustGer;
   private String estMenMedVend;
   private BigDecimal estMin;
   private BigDecimal estMinGir;
   private BigDecimal estoque;
   private BigDecimal frequencia;
   private String idenCorrelato;
   private String idenCosme;
   private String idenOtc;
   private String idenPortaria;
   private BigDecimal leadTime;
   private String listaLpm;
   private BigDecimal lucro1;
   private BigDecimal lucro10;
   private BigDecimal lucro11;
   private BigDecimal lucro12;
   private BigDecimal lucro2;
   private BigDecimal lucro3;
   private BigDecimal lucro4;
   private BigDecimal lucro5;
   private BigDecimal lucro6;
   private BigDecimal lucro7;
   private BigDecimal lucro8;
   private BigDecimal lucro9;
   private String marca;
   private BigDecimal markup;
   private BigDecimal nuNota;
   private String oneroso;
   private BigDecimal ordemMedida;
   private BigDecimal partEstoque;
   private BigDecimal partGasVarFat1;
   private BigDecimal partGasVarFat10;
   private BigDecimal partGasVarFat11;
   private BigDecimal partGasVarFat12;
   private BigDecimal partGasVarFat2;
   private BigDecimal partGasVarFat3;
   private BigDecimal partGasVarFat4;
   private BigDecimal partGasVarFat5;
   private BigDecimal partGasVarFat6;
   private BigDecimal partGasVarFat7;
   private BigDecimal partGasVarFat8;
   private BigDecimal partGasVarFat9;
   private BigDecimal partGasVar1;
   private BigDecimal partGasVar10;
   private BigDecimal partGasVar11;
   private BigDecimal partGasVar12;
   private BigDecimal partGasVar2;
   private BigDecimal partGasVar3;
   private BigDecimal partGasVar4;
   private BigDecimal partGasVar5;
   private BigDecimal partGasVar6;
   private BigDecimal partGasVar7;
   private BigDecimal partGasVar8;
   private BigDecimal partGasVar9;
   private BigDecimal partLucro1;
   private BigDecimal partLucro10;
   private BigDecimal partLucro11;
   private BigDecimal partLucro12;
   private BigDecimal partLucro2;
   private BigDecimal partLucro3;
   private BigDecimal partLucro4;
   private BigDecimal partLucro5;
   private String prodFalta;
   private BigDecimal qtdMaxima;
   private BigDecimal qtdMedia;
   private BigDecimal partLucro6;
   private BigDecimal partLucro7;
   private BigDecimal partLucro8;
   private BigDecimal partLucro9;
   private String referencia;
   private String refForn;
   private String refMercMed;
   private BigDecimal statusMed;
   private BigDecimal sugCompCustGer;
   private String curvaTot6;
   private String curvaTot7;
   private String curvaTot8;
   private String curvaTot9;
   private BigDecimal custoGer;
   private BigDecimal custoRep;
   private BigDecimal custoVenda1;
   private BigDecimal partMargContFat5;
   private BigDecimal partMargContFat6;
   private BigDecimal partMargContFat7;
   private BigDecimal partMargContFat8;
   private BigDecimal partMargContFat9;
   private BigDecimal partMargCont1;
   private BigDecimal partMargCont10;
   private BigDecimal partMargCont11;
   private BigDecimal partMargCont12;
   private BigDecimal partMargCont2;
   private BigDecimal partMargCont3;
   private BigDecimal partMargCont4;
   private BigDecimal partMargCont5;
   private BigDecimal partMargCont6;
   private BigDecimal partMargCont7;
   private BigDecimal partMargCont8;
   private BigDecimal partMargCont9;
   private BigDecimal partPeso1;
   private BigDecimal acumMarg1;
   private BigDecimal acumMarg10;
   private BigDecimal qtdMinima;
   private BigDecimal qtdTotal;
   private BigDecimal qtdUltCompra;
   private BigDecimal partPeso10;
   private BigDecimal partPeso11;
   private BigDecimal partPeso12;
   private BigDecimal partPeso2;
   private BigDecimal partPeso3;
   private BigDecimal partPeso4;
   private BigDecimal partPeso5;
   private BigDecimal partPeso6;
   private BigDecimal partPeso7;
   private BigDecimal partPeso8;
   private BigDecimal partPeso9;
   private BigDecimal partQtde1;
   private BigDecimal partQtde10;
   private BigDecimal partQtde11;
   private BigDecimal partQtde12;
   private BigDecimal partQtde2;
   private BigDecimal partQtde3;
   private BigDecimal partQtde4;
   private BigDecimal partQtde5;
   private BigDecimal partQtde6;
   private BigDecimal partQtde7;
   private BigDecimal partQtde8;
   private BigDecimal partQtde9;
   private BigDecimal partTotPer1;
   private BigDecimal partTotPer10;
   private BigDecimal partTotPer11;
   private BigDecimal partTotPer12;
   private BigDecimal partTotPer2;
   private BigDecimal partTotPer3;
   private BigDecimal partTotPer4;
   private BigDecimal partTotPer5;
   private BigDecimal partTotPer6;
   private BigDecimal partTotPer7;
   private BigDecimal partTotPer8;
   private BigDecimal partTotPer9;
   private BigDecimal pedCpaPend;
   private BigDecimal pedVdaPend;
   private BigDecimal perLucro1;
   private BigDecimal perLucro10;
   private BigDecimal perLucro11;
   private BigDecimal perLucro12;
   private BigDecimal perLucro2;
   private BigDecimal perLucro3;
   private BigDecimal perLucro4;
   private BigDecimal perLucro5;
   private BigDecimal perLucro6;
   private BigDecimal perLucro7;
   private BigDecimal perLucro8;
   private BigDecimal perLucro9;
   private BigDecimal peso1;
   private BigDecimal peso10;
   private BigDecimal peso11;
   private BigDecimal peso12;
   private BigDecimal peso2;
   private BigDecimal peso3;
   private BigDecimal peso4;
   private BigDecimal peso5;
   private BigDecimal peso6;
   private BigDecimal peso7;
   private BigDecimal peso8;
   private BigDecimal peso9;
   private BigDecimal popTotal;
   private BigDecimal popularidade1;
   private BigDecimal popularidade10;
   private BigDecimal popularidade11;
   private BigDecimal popularidade12;
   private BigDecimal popularidade2;
   private BigDecimal popularidade3;
   private BigDecimal popularidade4;
   private BigDecimal popularidade5;
   private BigDecimal partMargContFat3;
   private BigDecimal partMargContFat4;
   private BigDecimal custoVenda6;
   private BigDecimal custoVenda7;
   private BigDecimal custoVenda8;
   private BigDecimal custoVenda9;
   private BigDecimal custoVndTotal1;
   private BigDecimal custoVndTotal10;
   private BigDecimal custoVndTotal11;
   private BigDecimal custoVndTotal12;
   private BigDecimal custoVndTotal2;
   private BigDecimal custoVndTotal3;
   private BigDecimal custoVndTotal4;
   private BigDecimal custoVndTotal5;
   private BigDecimal custoVndTotal6;
   private BigDecimal custoVndTotal7;
   private BigDecimal custoVenda10;
   private BigDecimal custoVenda11;
   private BigDecimal popularidade6;
   private BigDecimal vlrUnit7;
   private BigDecimal vlrUnit8;
   private BigDecimal vlrUnit9;
   private BigDecimal vlrVenda1;
   private BigDecimal vlrVenda10;
   private BigDecimal vlrVenda11;
   private BigDecimal vlrVenda12;
   private BigDecimal vlrVenda2;
   private BigDecimal vlrVenda3;
   private BigDecimal vlrVenda4;
   private BigDecimal vlrVenda5;
   private BigDecimal vlrVenda6;
   private BigDecimal vlrVenda7;
   private BigDecimal vlrVenda8;
   private BigDecimal vlrVenda9;
   private BigDecimal vlrVendiaUtil1;
   private BigDecimal vlrVendiaUtil10;
   private BigDecimal vlrVendiaUtil11;
   private BigDecimal vlrVendiaUtil12;
   private BigDecimal vlrVendiaUtil2;
   private BigDecimal vlrVendiaUtil3;
   private BigDecimal vlrVendiaUtil4;
   private BigDecimal vlrVendiaUtil5;
   private BigDecimal vlrVendiaUtil6;
   private BigDecimal vlrVendiaUtil7;
   private BigDecimal vlrVendiaUtil8;
   private BigDecimal vlrVendiaUtil9;
   private String curvaTot5;
   private BigDecimal partMargContFat1;
   private BigDecimal partMargContFat10;
   private BigDecimal partMargContFat11;
   private BigDecimal partMargContFat12;
   private BigDecimal partMargContFat2;
   private BigDecimal vlrGastoVar3;
   private BigDecimal vlrGastoVar4;
   private BigDecimal vlrGastoVar5;
   private BigDecimal acumPeso7;
   private BigDecimal acumPeso8;
   private BigDecimal acumPeso9;
   private BigDecimal acumQtd1;
   private BigDecimal acumQtd10;
   private BigDecimal acumQtd11;
   private BigDecimal acumQtd12;
   private BigDecimal acumQtd2;
   private BigDecimal acumQtd3;
   private BigDecimal acumQtd4;
   private BigDecimal acumQtd5;
   private BigDecimal acumQtd6;
   private BigDecimal acumQtd7;
   private BigDecimal acumQtd8;
   private BigDecimal acumQtd9;
   private BigDecimal acumTot1;
   private BigDecimal acumTot10;
   private BigDecimal acumTot11;
   private BigDecimal acumTot12;
   private BigDecimal acumTot2;
   private BigDecimal acumTot3;
   private BigDecimal acumTot4;
   private BigDecimal acumTot5;
   private BigDecimal acumTot6;
   private BigDecimal acumTot7;
   private BigDecimal acumTot8;
   private BigDecimal acumTot9;
   private BigDecimal aliqCred;
   private BigDecimal codEmp;
   private BigDecimal codGrupoProd;
   private BigDecimal multipCpa;
   private BigDecimal sugCompraGirAjustado;
   private BigDecimal sugCompraGirAjustadoMultCpa;
   private String temSugGiroAjustado;
   private String unPadrao;
   private BigDecimal sugCompraGirMultCpa;
   private BigDecimal acumMarg4;
   private BigDecimal acumMarg5;
   private BigDecimal acumMarg6;
   private BigDecimal acumMarg7;
   private BigDecimal acumMarg8;
   private BigDecimal acumMarg11;
   private BigDecimal acumMarg12;
   private BigDecimal acumPeso11;
   private BigDecimal acumPeso12;
   private BigDecimal acumPeso2;
   private BigDecimal acumPeso3;
   private BigDecimal sugCompraMultCpa;
   private String sugCpaGirAlterado;
   private BigDecimal percDescFornecedor;
   private BigDecimal numCotacao;
   private BigDecimal wmsBloqueado;
   private BigDecimal acumMarg2;
   private BigDecimal acumMarg3;
   private BigDecimal durEstPosCpaGir;
   private BigDecimal durEstSeg;
   private BigDecimal diasUteis;
   private Timestamp prevEntrega;
   private BigDecimal giroDiario;
   private Timestamp pontoPed;
   private BigDecimal vlrUltCompra;
   private String possuiFam;
   private BigDecimal diasRuptura;
   private BigDecimal diasRupturaEst1;
   private BigDecimal diasRupturaEst10;
   private BigDecimal diasRupturaEst11;
   private BigDecimal diasRupturaEst12;
   private BigDecimal diasRupturaEst2;
   private BigDecimal diasRupturaEst3;
   private BigDecimal diasRupturaEst4;
   private BigDecimal diasRupturaEst5;
   private BigDecimal diasRupturaEst6;
   private BigDecimal diasRupturaEst7;
   private BigDecimal diasRupturaEst8;
   private BigDecimal diasRupturaEst9;
   private BigDecimal numMps;

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        this.codParcForn = codParcForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodRel() {
        return codRel;
   }

   public void setCodRel(BigDecimal codRel) {
        this.codRel = codRel;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        this.codVolCompra = codVolCompra;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        this.complDesc = complDesc;
   }

   public String getControlado() {
        return controlado;
   }

   public void setControlado(String controlado) {
        this.controlado = controlado;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public String getCurvaMarg1() {
        return curvaMarg1;
   }

   public void setCurvaMarg1(String curvaMarg1) {
        this.curvaMarg1 = curvaMarg1;
   }

   public String getCurvaMarg10() {
        return curvaMarg10;
   }

   public void setCurvaMarg10(String curvaMarg10) {
        this.curvaMarg10 = curvaMarg10;
   }

   public String getCurvaMarg11() {
        return curvaMarg11;
   }

   public void setCurvaMarg11(String curvaMarg11) {
        this.curvaMarg11 = curvaMarg11;
   }

   public String getCurvaMarg12() {
        return curvaMarg12;
   }

   public void setCurvaMarg12(String curvaMarg12) {
        this.curvaMarg12 = curvaMarg12;
   }

   public String getCurvaMarg2() {
        return curvaMarg2;
   }

   public void setCurvaMarg2(String curvaMarg2) {
        this.curvaMarg2 = curvaMarg2;
   }

   public String getCurvaMarg3() {
        return curvaMarg3;
   }

   public void setCurvaMarg3(String curvaMarg3) {
        this.curvaMarg3 = curvaMarg3;
   }

   public String getCurvaMarg4() {
        return curvaMarg4;
   }

   public void setCurvaMarg4(String curvaMarg4) {
        this.curvaMarg4 = curvaMarg4;
   }

   public String getCurvaMarg5() {
        return curvaMarg5;
   }

   public void setCurvaMarg5(String curvaMarg5) {
        this.curvaMarg5 = curvaMarg5;
   }

   public String getCurvaMarg6() {
        return curvaMarg6;
   }

   public void setCurvaMarg6(String curvaMarg6) {
        this.curvaMarg6 = curvaMarg6;
   }

   public String getCurvaMarg7() {
        return curvaMarg7;
   }

   public void setCurvaMarg7(String curvaMarg7) {
        this.curvaMarg7 = curvaMarg7;
   }

   public String getCurvaMarg8() {
        return curvaMarg8;
   }

   public void setCurvaMarg8(String curvaMarg8) {
        this.curvaMarg8 = curvaMarg8;
   }

   public String getCurvaMarg9() {
        return curvaMarg9;
   }

   public void setCurvaMarg9(String curvaMarg9) {
        this.curvaMarg9 = curvaMarg9;
   }

   public String getCurvaPeso1() {
        return curvaPeso1;
   }

   public void setCurvaPeso1(String curvaPeso1) {
        this.curvaPeso1 = curvaPeso1;
   }

   public String getCurvaPeso10() {
        return curvaPeso10;
   }

   public void setCurvaPeso10(String curvaPeso10) {
        this.curvaPeso10 = curvaPeso10;
   }

   public String getCurvaPeso11() {
        return curvaPeso11;
   }

   public void setCurvaPeso11(String curvaPeso11) {
        this.curvaPeso11 = curvaPeso11;
   }

   public String getCurvaPeso12() {
        return curvaPeso12;
   }

   public void setCurvaPeso12(String curvaPeso12) {
        this.curvaPeso12 = curvaPeso12;
   }

   public String getCurvaPeso2() {
        return curvaPeso2;
   }

   public void setCurvaPeso2(String curvaPeso2) {
        this.curvaPeso2 = curvaPeso2;
   }

   public String getCurvaPeso3() {
        return curvaPeso3;
   }

   public void setCurvaPeso3(String curvaPeso3) {
        this.curvaPeso3 = curvaPeso3;
   }

   public String getCurvaPeso4() {
        return curvaPeso4;
   }

   public void setCurvaPeso4(String curvaPeso4) {
        this.curvaPeso4 = curvaPeso4;
   }

   public String getCurvaPeso5() {
        return curvaPeso5;
   }

   public void setCurvaPeso5(String curvaPeso5) {
        this.curvaPeso5 = curvaPeso5;
   }

   public String getCurvaPeso6() {
        return curvaPeso6;
   }

   public void setCurvaPeso6(String curvaPeso6) {
        this.curvaPeso6 = curvaPeso6;
   }

   public String getCurvaPeso7() {
        return curvaPeso7;
   }

   public void setCurvaPeso7(String curvaPeso7) {
        this.curvaPeso7 = curvaPeso7;
   }

   public String getCurvaPeso8() {
        return curvaPeso8;
   }

   public void setCurvaPeso8(String curvaPeso8) {
        this.curvaPeso8 = curvaPeso8;
   }

   public String getCurvaPeso9() {
        return curvaPeso9;
   }

   public void setCurvaPeso9(String curvaPeso9) {
        this.curvaPeso9 = curvaPeso9;
   }

   public String getCurvaQtd1() {
        return curvaQtd1;
   }

   public void setCurvaQtd1(String curvaQtd1) {
        this.curvaQtd1 = curvaQtd1;
   }

   public String getCurvaQtd10() {
        return curvaQtd10;
   }

   public void setCurvaQtd10(String curvaQtd10) {
        this.curvaQtd10 = curvaQtd10;
   }

   public String getCurvaQtd11() {
        return curvaQtd11;
   }

   public void setCurvaQtd11(String curvaQtd11) {
        this.curvaQtd11 = curvaQtd11;
   }

   public String getCurvaQtd12() {
        return curvaQtd12;
   }

   public void setCurvaQtd12(String curvaQtd12) {
        this.curvaQtd12 = curvaQtd12;
   }

   public String getCurvaQtd2() {
        return curvaQtd2;
   }

   public void setCurvaQtd2(String curvaQtd2) {
        this.curvaQtd2 = curvaQtd2;
   }

   public String getCurvaQtd3() {
        return curvaQtd3;
   }

   public void setCurvaQtd3(String curvaQtd3) {
        this.curvaQtd3 = curvaQtd3;
   }

   public String getCurvaQtd4() {
        return curvaQtd4;
   }

   public void setCurvaQtd4(String curvaQtd4) {
        this.curvaQtd4 = curvaQtd4;
   }

   public String getCurvaQtd5() {
        return curvaQtd5;
   }

   public void setCurvaQtd5(String curvaQtd5) {
        this.curvaQtd5 = curvaQtd5;
   }

   public String getCurvaQtd6() {
        return curvaQtd6;
   }

   public void setCurvaQtd6(String curvaQtd6) {
        this.curvaQtd6 = curvaQtd6;
   }

   public String getCurvaQtd7() {
        return curvaQtd7;
   }

   public void setCurvaQtd7(String curvaQtd7) {
        this.curvaQtd7 = curvaQtd7;
   }

   public String getCurvaQtd8() {
        return curvaQtd8;
   }

   public void setCurvaQtd8(String curvaQtd8) {
        this.curvaQtd8 = curvaQtd8;
   }

   public String getCurvaQtd9() {
        return curvaQtd9;
   }

   public void setCurvaQtd9(String curvaQtd9) {
        this.curvaQtd9 = curvaQtd9;
   }

   public String getCurvaTot1() {
        return curvaTot1;
   }

   public void setCurvaTot1(String curvaTot1) {
        this.curvaTot1 = curvaTot1;
   }

   public String getCurvaTot10() {
        return curvaTot10;
   }

   public void setCurvaTot10(String curvaTot10) {
        this.curvaTot10 = curvaTot10;
   }

   public String getCurvaTot11() {
        return curvaTot11;
   }

   public void setCurvaTot11(String curvaTot11) {
        this.curvaTot11 = curvaTot11;
   }

   public String getCurvaTot12() {
        return curvaTot12;
   }

   public void setCurvaTot12(String curvaTot12) {
        this.curvaTot12 = curvaTot12;
   }

   public String getCurvaTot2() {
        return curvaTot2;
   }

   public void setCurvaTot2(String curvaTot2) {
        this.curvaTot2 = curvaTot2;
   }

   public String getCurvaTot3() {
        return curvaTot3;
   }

   public void setCurvaTot3(String curvaTot3) {
        this.curvaTot3 = curvaTot3;
   }

   public String getCurvaTot4() {
        return curvaTot4;
   }

   public void setCurvaTot4(String curvaTot4) {
        this.curvaTot4 = curvaTot4;
   }

   public Timestamp getUltCompra() {
        return ultCompra;
   }

   public void setUltCompra(Timestamp ultCompra) {
        this.ultCompra = ultCompra;
   }

   public Timestamp getUltVenda() {
        return ultVenda;
   }

   public void setUltVenda(Timestamp ultVenda) {
        this.ultVenda = ultVenda;
   }

   public BigDecimal getVlrCredIcms() {
        return vlrCredIcms;
   }

   public void setVlrCredIcms(BigDecimal vlrCredIcms) {
        this.vlrCredIcms = vlrCredIcms;
   }

   public BigDecimal getVlrGastoVar1() {
        return vlrGastoVar1;
   }

   public void setVlrGastoVar1(BigDecimal vlrGastoVar1) {
        this.vlrGastoVar1 = vlrGastoVar1;
   }

   public BigDecimal getVlrGastoVar6() {
        return vlrGastoVar6;
   }

   public void setVlrGastoVar6(BigDecimal vlrGastoVar6) {
        this.vlrGastoVar6 = vlrGastoVar6;
   }

   public BigDecimal getVlrGastoVar7() {
        return vlrGastoVar7;
   }

   public void setVlrGastoVar7(BigDecimal vlrGastoVar7) {
        this.vlrGastoVar7 = vlrGastoVar7;
   }

   public BigDecimal getVlrGastoVar8() {
        return vlrGastoVar8;
   }

   public void setVlrGastoVar8(BigDecimal vlrGastoVar8) {
        this.vlrGastoVar8 = vlrGastoVar8;
   }

   public BigDecimal getVlrGastoVar9() {
        return vlrGastoVar9;
   }

   public void setVlrGastoVar9(BigDecimal vlrGastoVar9) {
        this.vlrGastoVar9 = vlrGastoVar9;
   }

   public BigDecimal getVlrMargCont1() {
        return vlrMargCont1;
   }

   public void setVlrMargCont1(BigDecimal vlrMargCont1) {
        this.vlrMargCont1 = vlrMargCont1;
   }

   public BigDecimal getVlrMargCont10() {
        return vlrMargCont10;
   }

   public void setVlrMargCont10(BigDecimal vlrMargCont10) {
        this.vlrMargCont10 = vlrMargCont10;
   }

   public BigDecimal getVlrMargCont11() {
        return vlrMargCont11;
   }

   public void setVlrMargCont11(BigDecimal vlrMargCont11) {
        this.vlrMargCont11 = vlrMargCont11;
   }

   public BigDecimal getVlrMargCont12() {
        return vlrMargCont12;
   }

   public void setVlrMargCont12(BigDecimal vlrMargCont12) {
        this.vlrMargCont12 = vlrMargCont12;
   }

   public BigDecimal getVlrMargCont2() {
        return vlrMargCont2;
   }

   public void setVlrMargCont2(BigDecimal vlrMargCont2) {
        this.vlrMargCont2 = vlrMargCont2;
   }

   public BigDecimal getVlrMargCont3() {
        return vlrMargCont3;
   }

   public void setVlrMargCont3(BigDecimal vlrMargCont3) {
        this.vlrMargCont3 = vlrMargCont3;
   }

   public BigDecimal getVlrMargCont4() {
        return vlrMargCont4;
   }

   public void setVlrMargCont4(BigDecimal vlrMargCont4) {
        this.vlrMargCont4 = vlrMargCont4;
   }

   public BigDecimal getVlrMargCont5() {
        return vlrMargCont5;
   }

   public void setVlrMargCont5(BigDecimal vlrMargCont5) {
        this.vlrMargCont5 = vlrMargCont5;
   }

   public BigDecimal getVlrMargCont6() {
        return vlrMargCont6;
   }

   public void setVlrMargCont6(BigDecimal vlrMargCont6) {
        this.vlrMargCont6 = vlrMargCont6;
   }

   public BigDecimal getVlrMargCont7() {
        return vlrMargCont7;
   }

   public void setVlrMargCont7(BigDecimal vlrMargCont7) {
        this.vlrMargCont7 = vlrMargCont7;
   }

   public BigDecimal getVlrMargCont8() {
        return vlrMargCont8;
   }

   public void setVlrMargCont8(BigDecimal vlrMargCont8) {
        this.vlrMargCont8 = vlrMargCont8;
   }

   public BigDecimal getVlrMargCont9() {
        return vlrMargCont9;
   }

   public void setVlrMargCont9(BigDecimal vlrMargCont9) {
        this.vlrMargCont9 = vlrMargCont9;
   }

   public BigDecimal getVlrTabPreco() {
        return vlrTabPreco;
   }

   public void setVlrTabPreco(BigDecimal vlrTabPreco) {
        this.vlrTabPreco = vlrTabPreco;
   }

   public BigDecimal getVlrTot1() {
        return vlrTot1;
   }

   public void setVlrTot1(BigDecimal vlrTot1) {
        this.vlrTot1 = vlrTot1;
   }

   public BigDecimal getVlrTot10() {
        return vlrTot10;
   }

   public void setVlrTot10(BigDecimal vlrTot10) {
        this.vlrTot10 = vlrTot10;
   }

   public BigDecimal getVlrTot11() {
        return vlrTot11;
   }

   public void setVlrTot11(BigDecimal vlrTot11) {
        this.vlrTot11 = vlrTot11;
   }

   public BigDecimal getVlrTot12() {
        return vlrTot12;
   }

   public void setVlrTot12(BigDecimal vlrTot12) {
        this.vlrTot12 = vlrTot12;
   }

   public BigDecimal getVlrTot2() {
        return vlrTot2;
   }

   public void setVlrTot2(BigDecimal vlrTot2) {
        this.vlrTot2 = vlrTot2;
   }

   public BigDecimal getVlrTot3() {
        return vlrTot3;
   }

   public void setVlrTot3(BigDecimal vlrTot3) {
        this.vlrTot3 = vlrTot3;
   }

   public BigDecimal getVlrTot4() {
        return vlrTot4;
   }

   public void setVlrTot4(BigDecimal vlrTot4) {
        this.vlrTot4 = vlrTot4;
   }

   public BigDecimal getVlrTot5() {
        return vlrTot5;
   }

   public void setVlrTot5(BigDecimal vlrTot5) {
        this.vlrTot5 = vlrTot5;
   }

   public BigDecimal getVlrTot6() {
        return vlrTot6;
   }

   public void setVlrTot6(BigDecimal vlrTot6) {
        this.vlrTot6 = vlrTot6;
   }

   public BigDecimal getVlrTot7() {
        return vlrTot7;
   }

   public void setVlrTot7(BigDecimal vlrTot7) {
        this.vlrTot7 = vlrTot7;
   }

   public BigDecimal getVlrTot8() {
        return vlrTot8;
   }

   public void setVlrTot8(BigDecimal vlrTot8) {
        this.vlrTot8 = vlrTot8;
   }

   public BigDecimal getVlrTot9() {
        return vlrTot9;
   }

   public void setVlrTot9(BigDecimal vlrTot9) {
        this.vlrTot9 = vlrTot9;
   }

   public BigDecimal getVlrUnit1() {
        return vlrUnit1;
   }

   public void setVlrUnit1(BigDecimal vlrUnit1) {
        this.vlrUnit1 = vlrUnit1;
   }

   public BigDecimal getVlrUnit10() {
        return vlrUnit10;
   }

   public void setVlrUnit10(BigDecimal vlrUnit10) {
        this.vlrUnit10 = vlrUnit10;
   }

   public BigDecimal getVlrUnit11() {
        return vlrUnit11;
   }

   public void setVlrUnit11(BigDecimal vlrUnit11) {
        this.vlrUnit11 = vlrUnit11;
   }

   public BigDecimal getVlrUnit12() {
        return vlrUnit12;
   }

   public void setVlrUnit12(BigDecimal vlrUnit12) {
        this.vlrUnit12 = vlrUnit12;
   }

   public BigDecimal getVlrUnit2() {
        return vlrUnit2;
   }

   public void setVlrUnit2(BigDecimal vlrUnit2) {
        this.vlrUnit2 = vlrUnit2;
   }

   public BigDecimal getVlrUnit3() {
        return vlrUnit3;
   }

   public void setVlrUnit3(BigDecimal vlrUnit3) {
        this.vlrUnit3 = vlrUnit3;
   }

   public BigDecimal getVlrUnit4() {
        return vlrUnit4;
   }

   public void setVlrUnit4(BigDecimal vlrUnit4) {
        this.vlrUnit4 = vlrUnit4;
   }

   public BigDecimal getVlrUnit5() {
        return vlrUnit5;
   }

   public void setVlrUnit5(BigDecimal vlrUnit5) {
        this.vlrUnit5 = vlrUnit5;
   }

   public BigDecimal getVlrUnit6() {
        return vlrUnit6;
   }

   public void setVlrUnit6(BigDecimal vlrUnit6) {
        this.vlrUnit6 = vlrUnit6;
   }

   public BigDecimal getAcumPeso4() {
        return acumPeso4;
   }

   public void setAcumPeso4(BigDecimal acumPeso4) {
        this.acumPeso4 = acumPeso4;
   }

   public BigDecimal getAcumPeso5() {
        return acumPeso5;
   }

   public void setAcumPeso5(BigDecimal acumPeso5) {
        this.acumPeso5 = acumPeso5;
   }

   public BigDecimal getAcumPeso6() {
        return acumPeso6;
   }

   public void setAcumPeso6(BigDecimal acumPeso6) {
        this.acumPeso6 = acumPeso6;
   }

   public BigDecimal getPopularidade7() {
        return popularidade7;
   }

   public void setPopularidade7(BigDecimal popularidade7) {
        this.popularidade7 = popularidade7;
   }

   public BigDecimal getPopularidade8() {
        return popularidade8;
   }

   public void setPopularidade8(BigDecimal popularidade8) {
        this.popularidade8 = popularidade8;
   }

   public BigDecimal getPopularidade9() {
        return popularidade9;
   }

   public void setPopularidade9(BigDecimal popularidade9) {
        this.popularidade9 = popularidade9;
   }

   public BigDecimal getAcumMarg9() {
        return acumMarg9;
   }

   public void setAcumMarg9(BigDecimal acumMarg9) {
        this.acumMarg9 = acumMarg9;
   }

   public BigDecimal getAcumPeso1() {
        return acumPeso1;
   }

   public void setAcumPeso1(BigDecimal acumPeso1) {
        this.acumPeso1 = acumPeso1;
   }

   public BigDecimal getAcumPeso10() {
        return acumPeso10;
   }

   public void setAcumPeso10(BigDecimal acumPeso10) {
        this.acumPeso10 = acumPeso10;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        this.estMax = estMax;
   }

   public BigDecimal getCustoVenda12() {
        return custoVenda12;
   }

   public void setCustoVenda12(BigDecimal custoVenda12) {
        this.custoVenda12 = custoVenda12;
   }

   public BigDecimal getCustoVenda2() {
        return custoVenda2;
   }

   public void setCustoVenda2(BigDecimal custoVenda2) {
        this.custoVenda2 = custoVenda2;
   }

   public BigDecimal getCustoVenda3() {
        return custoVenda3;
   }

   public void setCustoVenda3(BigDecimal custoVenda3) {
        this.custoVenda3 = custoVenda3;
   }

   public BigDecimal getCustoVenda4() {
        return custoVenda4;
   }

   public void setCustoVenda4(BigDecimal custoVenda4) {
        this.custoVenda4 = custoVenda4;
   }

   public BigDecimal getCustoVenda5() {
        return custoVenda5;
   }

   public void setCustoVenda5(BigDecimal custoVenda5) {
        this.custoVenda5 = custoVenda5;
   }

   public BigDecimal getVlrGastoVar10() {
        return vlrGastoVar10;
   }

   public void setVlrGastoVar10(BigDecimal vlrGastoVar10) {
        this.vlrGastoVar10 = vlrGastoVar10;
   }

   public BigDecimal getVlrGastoVar11() {
        return vlrGastoVar11;
   }

   public void setVlrGastoVar11(BigDecimal vlrGastoVar11) {
        this.vlrGastoVar11 = vlrGastoVar11;
   }

   public BigDecimal getVlrGastoVar12() {
        return vlrGastoVar12;
   }

   public void setVlrGastoVar12(BigDecimal vlrGastoVar12) {
        this.vlrGastoVar12 = vlrGastoVar12;
   }

   public BigDecimal getVlrGastoVar2() {
        return vlrGastoVar2;
   }

   public void setVlrGastoVar2(BigDecimal vlrGastoVar2) {
        this.vlrGastoVar2 = vlrGastoVar2;
   }

   public BigDecimal getSugCompra() {
        return sugCompra;
   }

   public void setSugCompra(BigDecimal sugCompra) {
        this.sugCompra = sugCompra;
   }

   public BigDecimal getSugCompraGir() {
        return sugCompraGir;
   }

   public void setSugCompraGir(BigDecimal sugCompraGir) {
        this.sugCompraGir = sugCompraGir;
   }

   public String getTermolabil() {
        return termolabil;
   }

   public void setTermolabil(String termolabil) {
        this.termolabil = termolabil;
   }

   public BigDecimal getCustoVndTotal8() {
        return custoVndTotal8;
   }

   public void setCustoVndTotal8(BigDecimal custoVndTotal8) {
        this.custoVndTotal8 = custoVndTotal8;
   }

   public BigDecimal getCustoVndTotal9() {
        return custoVndTotal9;
   }

   public void setCustoVndTotal9(BigDecimal custoVndTotal9) {
        this.custoVndTotal9 = custoVndTotal9;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        this.descMax = descMax;
   }

   public BigDecimal getDiasSemVenda() {
        return diasSemVenda;
   }

   public void setDiasSemVenda(BigDecimal diasSemVenda) {
        this.diasSemVenda = diasSemVenda;
   }

   public BigDecimal getDurEst() {
        return durEst;
   }

   public void setDurEst(BigDecimal durEst) {
        this.durEst = durEst;
   }

   public BigDecimal getDurEstPosCpa() {
        return durEstPosCpa;
   }

   public void setDurEstPosCpa(BigDecimal durEstPosCpa) {
        this.durEstPosCpa = durEstPosCpa;
   }

   public BigDecimal getEstCustGer() {
        return estCustGer;
   }

   public void setEstCustGer(BigDecimal estCustGer) {
        this.estCustGer = estCustGer;
   }

   public String getEstMenMedVend() {
        return estMenMedVend;
   }

   public void setEstMenMedVend(String estMenMedVend) {
        this.estMenMedVend = estMenMedVend;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        this.estMin = estMin;
   }

   public BigDecimal getEstMinGir() {
        return estMinGir;
   }

   public void setEstMinGir(BigDecimal estMinGir) {
        this.estMinGir = estMinGir;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public BigDecimal getFrequencia() {
        return frequencia;
   }

   public void setFrequencia(BigDecimal frequencia) {
        this.frequencia = frequencia;
   }

   public String getIdenCorrelato() {
        return idenCorrelato;
   }

   public void setIdenCorrelato(String idenCorrelato) {
        this.idenCorrelato = idenCorrelato;
   }

   public String getIdenCosme() {
        return idenCosme;
   }

   public void setIdenCosme(String idenCosme) {
        this.idenCosme = idenCosme;
   }

   public String getIdenOtc() {
        return idenOtc;
   }

   public void setIdenOtc(String idenOtc) {
        this.idenOtc = idenOtc;
   }

   public String getIdenPortaria() {
        return idenPortaria;
   }

   public void setIdenPortaria(String idenPortaria) {
        this.idenPortaria = idenPortaria;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public String getListaLpm() {
        return listaLpm;
   }

   public void setListaLpm(String listaLpm) {
        this.listaLpm = listaLpm;
   }

   public BigDecimal getLucro1() {
        return lucro1;
   }

   public void setLucro1(BigDecimal lucro1) {
        this.lucro1 = lucro1;
   }

   public BigDecimal getLucro10() {
        return lucro10;
   }

   public void setLucro10(BigDecimal lucro10) {
        this.lucro10 = lucro10;
   }

   public BigDecimal getLucro11() {
        return lucro11;
   }

   public void setLucro11(BigDecimal lucro11) {
        this.lucro11 = lucro11;
   }

   public BigDecimal getLucro12() {
        return lucro12;
   }

   public void setLucro12(BigDecimal lucro12) {
        this.lucro12 = lucro12;
   }

   public BigDecimal getLucro2() {
        return lucro2;
   }

   public void setLucro2(BigDecimal lucro2) {
        this.lucro2 = lucro2;
   }

   public BigDecimal getLucro3() {
        return lucro3;
   }

   public void setLucro3(BigDecimal lucro3) {
        this.lucro3 = lucro3;
   }

   public BigDecimal getLucro4() {
        return lucro4;
   }

   public void setLucro4(BigDecimal lucro4) {
        this.lucro4 = lucro4;
   }

   public BigDecimal getLucro5() {
        return lucro5;
   }

   public void setLucro5(BigDecimal lucro5) {
        this.lucro5 = lucro5;
   }

   public BigDecimal getLucro6() {
        return lucro6;
   }

   public void setLucro6(BigDecimal lucro6) {
        this.lucro6 = lucro6;
   }

   public BigDecimal getLucro7() {
        return lucro7;
   }

   public void setLucro7(BigDecimal lucro7) {
        this.lucro7 = lucro7;
   }

   public BigDecimal getLucro8() {
        return lucro8;
   }

   public void setLucro8(BigDecimal lucro8) {
        this.lucro8 = lucro8;
   }

   public BigDecimal getLucro9() {
        return lucro9;
   }

   public void setLucro9(BigDecimal lucro9) {
        this.lucro9 = lucro9;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   public BigDecimal getMarkup() {
        return markup;
   }

   public void setMarkup(BigDecimal markup) {
        this.markup = markup;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getOneroso() {
        return oneroso;
   }

   public void setOneroso(String oneroso) {
        this.oneroso = oneroso;
   }

   public BigDecimal getOrdemMedida() {
        return ordemMedida;
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        this.ordemMedida = ordemMedida;
   }

   public BigDecimal getPartEstoque() {
        return partEstoque;
   }

   public void setPartEstoque(BigDecimal partEstoque) {
        this.partEstoque = partEstoque;
   }

   public BigDecimal getPartGasVarFat1() {
        return partGasVarFat1;
   }

   public void setPartGasVarFat1(BigDecimal partGasVarFat1) {
        this.partGasVarFat1 = partGasVarFat1;
   }

   public BigDecimal getPartGasVarFat10() {
        return partGasVarFat10;
   }

   public void setPartGasVarFat10(BigDecimal partGasVarFat10) {
        this.partGasVarFat10 = partGasVarFat10;
   }

   public BigDecimal getPartGasVarFat11() {
        return partGasVarFat11;
   }

   public void setPartGasVarFat11(BigDecimal partGasVarFat11) {
        this.partGasVarFat11 = partGasVarFat11;
   }

   public BigDecimal getPartGasVarFat12() {
        return partGasVarFat12;
   }

   public void setPartGasVarFat12(BigDecimal partGasVarFat12) {
        this.partGasVarFat12 = partGasVarFat12;
   }

   public BigDecimal getPartGasVarFat2() {
        return partGasVarFat2;
   }

   public void setPartGasVarFat2(BigDecimal partGasVarFat2) {
        this.partGasVarFat2 = partGasVarFat2;
   }

   public BigDecimal getPartGasVarFat3() {
        return partGasVarFat3;
   }

   public void setPartGasVarFat3(BigDecimal partGasVarFat3) {
        this.partGasVarFat3 = partGasVarFat3;
   }

   public BigDecimal getPartGasVarFat4() {
        return partGasVarFat4;
   }

   public void setPartGasVarFat4(BigDecimal partGasVarFat4) {
        this.partGasVarFat4 = partGasVarFat4;
   }

   public BigDecimal getPartGasVarFat5() {
        return partGasVarFat5;
   }

   public void setPartGasVarFat5(BigDecimal partGasVarFat5) {
        this.partGasVarFat5 = partGasVarFat5;
   }

   public BigDecimal getPartGasVarFat6() {
        return partGasVarFat6;
   }

   public void setPartGasVarFat6(BigDecimal partGasVarFat6) {
        this.partGasVarFat6 = partGasVarFat6;
   }

   public BigDecimal getPartGasVarFat7() {
        return partGasVarFat7;
   }

   public void setPartGasVarFat7(BigDecimal partGasVarFat7) {
        this.partGasVarFat7 = partGasVarFat7;
   }

   public BigDecimal getPartGasVarFat8() {
        return partGasVarFat8;
   }

   public void setPartGasVarFat8(BigDecimal partGasVarFat8) {
        this.partGasVarFat8 = partGasVarFat8;
   }

   public BigDecimal getPartGasVarFat9() {
        return partGasVarFat9;
   }

   public void setPartGasVarFat9(BigDecimal partGasVarFat9) {
        this.partGasVarFat9 = partGasVarFat9;
   }

   public BigDecimal getPartGasVar1() {
        return partGasVar1;
   }

   public void setPartGasVar1(BigDecimal partGasVar1) {
        this.partGasVar1 = partGasVar1;
   }

   public BigDecimal getPartGasVar10() {
        return partGasVar10;
   }

   public void setPartGasVar10(BigDecimal partGasVar10) {
        this.partGasVar10 = partGasVar10;
   }

   public BigDecimal getPartGasVar11() {
        return partGasVar11;
   }

   public void setPartGasVar11(BigDecimal partGasVar11) {
        this.partGasVar11 = partGasVar11;
   }

   public BigDecimal getPartGasVar12() {
        return partGasVar12;
   }

   public void setPartGasVar12(BigDecimal partGasVar12) {
        this.partGasVar12 = partGasVar12;
   }

   public BigDecimal getPartGasVar2() {
        return partGasVar2;
   }

   public void setPartGasVar2(BigDecimal partGasVar2) {
        this.partGasVar2 = partGasVar2;
   }

   public BigDecimal getPartGasVar3() {
        return partGasVar3;
   }

   public void setPartGasVar3(BigDecimal partGasVar3) {
        this.partGasVar3 = partGasVar3;
   }

   public BigDecimal getPartGasVar4() {
        return partGasVar4;
   }

   public void setPartGasVar4(BigDecimal partGasVar4) {
        this.partGasVar4 = partGasVar4;
   }

   public BigDecimal getPartGasVar5() {
        return partGasVar5;
   }

   public void setPartGasVar5(BigDecimal partGasVar5) {
        this.partGasVar5 = partGasVar5;
   }

   public BigDecimal getPartGasVar6() {
        return partGasVar6;
   }

   public void setPartGasVar6(BigDecimal partGasVar6) {
        this.partGasVar6 = partGasVar6;
   }

   public BigDecimal getPartGasVar7() {
        return partGasVar7;
   }

   public void setPartGasVar7(BigDecimal partGasVar7) {
        this.partGasVar7 = partGasVar7;
   }

   public BigDecimal getPartGasVar8() {
        return partGasVar8;
   }

   public void setPartGasVar8(BigDecimal partGasVar8) {
        this.partGasVar8 = partGasVar8;
   }

   public BigDecimal getPartGasVar9() {
        return partGasVar9;
   }

   public void setPartGasVar9(BigDecimal partGasVar9) {
        this.partGasVar9 = partGasVar9;
   }

   public BigDecimal getPartLucro1() {
        return partLucro1;
   }

   public void setPartLucro1(BigDecimal partLucro1) {
        this.partLucro1 = partLucro1;
   }

   public BigDecimal getPartLucro10() {
        return partLucro10;
   }

   public void setPartLucro10(BigDecimal partLucro10) {
        this.partLucro10 = partLucro10;
   }

   public BigDecimal getPartLucro11() {
        return partLucro11;
   }

   public void setPartLucro11(BigDecimal partLucro11) {
        this.partLucro11 = partLucro11;
   }

   public BigDecimal getPartLucro12() {
        return partLucro12;
   }

   public void setPartLucro12(BigDecimal partLucro12) {
        this.partLucro12 = partLucro12;
   }

   public BigDecimal getPartLucro2() {
        return partLucro2;
   }

   public void setPartLucro2(BigDecimal partLucro2) {
        this.partLucro2 = partLucro2;
   }

   public BigDecimal getPartLucro3() {
        return partLucro3;
   }

   public void setPartLucro3(BigDecimal partLucro3) {
        this.partLucro3 = partLucro3;
   }

   public BigDecimal getPartLucro4() {
        return partLucro4;
   }

   public void setPartLucro4(BigDecimal partLucro4) {
        this.partLucro4 = partLucro4;
   }

   public BigDecimal getPartLucro5() {
        return partLucro5;
   }

   public void setPartLucro5(BigDecimal partLucro5) {
        this.partLucro5 = partLucro5;
   }

   public String getProdFalta() {
        return prodFalta;
   }

   public void setProdFalta(String prodFalta) {
        this.prodFalta = prodFalta;
   }

   public BigDecimal getQtdMaxima() {
        return qtdMaxima;
   }

   public void setQtdMaxima(BigDecimal qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
   }

   public BigDecimal getQtdMedia() {
        return qtdMedia;
   }

   public void setQtdMedia(BigDecimal qtdMedia) {
        this.qtdMedia = qtdMedia;
   }

   public BigDecimal getPartLucro6() {
        return partLucro6;
   }

   public void setPartLucro6(BigDecimal partLucro6) {
        this.partLucro6 = partLucro6;
   }

   public BigDecimal getPartLucro7() {
        return partLucro7;
   }

   public void setPartLucro7(BigDecimal partLucro7) {
        this.partLucro7 = partLucro7;
   }

   public BigDecimal getPartLucro8() {
        return partLucro8;
   }

   public void setPartLucro8(BigDecimal partLucro8) {
        this.partLucro8 = partLucro8;
   }

   public BigDecimal getPartLucro9() {
        return partLucro9;
   }

   public void setPartLucro9(BigDecimal partLucro9) {
        this.partLucro9 = partLucro9;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        this.refForn = refForn;
   }

   public String getRefMercMed() {
        return refMercMed;
   }

   public void setRefMercMed(String refMercMed) {
        this.refMercMed = refMercMed;
   }

   public BigDecimal getStatusMed() {
        return statusMed;
   }

   public void setStatusMed(BigDecimal statusMed) {
        this.statusMed = statusMed;
   }

   public BigDecimal getSugCompCustGer() {
        return sugCompCustGer;
   }

   public void setSugCompCustGer(BigDecimal sugCompCustGer) {
        this.sugCompCustGer = sugCompCustGer;
   }

   public String getCurvaTot6() {
        return curvaTot6;
   }

   public void setCurvaTot6(String curvaTot6) {
        this.curvaTot6 = curvaTot6;
   }

   public String getCurvaTot7() {
        return curvaTot7;
   }

   public void setCurvaTot7(String curvaTot7) {
        this.curvaTot7 = curvaTot7;
   }

   public String getCurvaTot8() {
        return curvaTot8;
   }

   public void setCurvaTot8(String curvaTot8) {
        this.curvaTot8 = curvaTot8;
   }

   public String getCurvaTot9() {
        return curvaTot9;
   }

   public void setCurvaTot9(String curvaTot9) {
        this.curvaTot9 = curvaTot9;
   }

   public BigDecimal getCustoGer() {
        return custoGer;
   }

   public void setCustoGer(BigDecimal custoGer) {
        this.custoGer = custoGer;
   }

   public BigDecimal getCustoRep() {
        return custoRep;
   }

   public void setCustoRep(BigDecimal custoRep) {
        this.custoRep = custoRep;
   }

   public BigDecimal getCustoVenda1() {
        return custoVenda1;
   }

   public void setCustoVenda1(BigDecimal custoVenda1) {
        this.custoVenda1 = custoVenda1;
   }

   public BigDecimal getPartMargContFat5() {
        return partMargContFat5;
   }

   public void setPartMargContFat5(BigDecimal partMargContFat5) {
        this.partMargContFat5 = partMargContFat5;
   }

   public BigDecimal getPartMargContFat6() {
        return partMargContFat6;
   }

   public void setPartMargContFat6(BigDecimal partMargContFat6) {
        this.partMargContFat6 = partMargContFat6;
   }

   public BigDecimal getPartMargContFat7() {
        return partMargContFat7;
   }

   public void setPartMargContFat7(BigDecimal partMargContFat7) {
        this.partMargContFat7 = partMargContFat7;
   }

   public BigDecimal getPartMargContFat8() {
        return partMargContFat8;
   }

   public void setPartMargContFat8(BigDecimal partMargContFat8) {
        this.partMargContFat8 = partMargContFat8;
   }

   public BigDecimal getPartMargContFat9() {
        return partMargContFat9;
   }

   public void setPartMargContFat9(BigDecimal partMargContFat9) {
        this.partMargContFat9 = partMargContFat9;
   }

   public BigDecimal getPartMargCont1() {
        return partMargCont1;
   }

   public void setPartMargCont1(BigDecimal partMargCont1) {
        this.partMargCont1 = partMargCont1;
   }

   public BigDecimal getPartMargCont10() {
        return partMargCont10;
   }

   public void setPartMargCont10(BigDecimal partMargCont10) {
        this.partMargCont10 = partMargCont10;
   }

   public BigDecimal getPartMargCont11() {
        return partMargCont11;
   }

   public void setPartMargCont11(BigDecimal partMargCont11) {
        this.partMargCont11 = partMargCont11;
   }

   public BigDecimal getPartMargCont12() {
        return partMargCont12;
   }

   public void setPartMargCont12(BigDecimal partMargCont12) {
        this.partMargCont12 = partMargCont12;
   }

   public BigDecimal getPartMargCont2() {
        return partMargCont2;
   }

   public void setPartMargCont2(BigDecimal partMargCont2) {
        this.partMargCont2 = partMargCont2;
   }

   public BigDecimal getPartMargCont3() {
        return partMargCont3;
   }

   public void setPartMargCont3(BigDecimal partMargCont3) {
        this.partMargCont3 = partMargCont3;
   }

   public BigDecimal getPartMargCont4() {
        return partMargCont4;
   }

   public void setPartMargCont4(BigDecimal partMargCont4) {
        this.partMargCont4 = partMargCont4;
   }

   public BigDecimal getPartMargCont5() {
        return partMargCont5;
   }

   public void setPartMargCont5(BigDecimal partMargCont5) {
        this.partMargCont5 = partMargCont5;
   }

   public BigDecimal getPartMargCont6() {
        return partMargCont6;
   }

   public void setPartMargCont6(BigDecimal partMargCont6) {
        this.partMargCont6 = partMargCont6;
   }

   public BigDecimal getPartMargCont7() {
        return partMargCont7;
   }

   public void setPartMargCont7(BigDecimal partMargCont7) {
        this.partMargCont7 = partMargCont7;
   }

   public BigDecimal getPartMargCont8() {
        return partMargCont8;
   }

   public void setPartMargCont8(BigDecimal partMargCont8) {
        this.partMargCont8 = partMargCont8;
   }

   public BigDecimal getPartMargCont9() {
        return partMargCont9;
   }

   public void setPartMargCont9(BigDecimal partMargCont9) {
        this.partMargCont9 = partMargCont9;
   }

   public BigDecimal getPartPeso1() {
        return partPeso1;
   }

   public void setPartPeso1(BigDecimal partPeso1) {
        this.partPeso1 = partPeso1;
   }

   public BigDecimal getAcumMarg1() {
        return acumMarg1;
   }

   public void setAcumMarg1(BigDecimal acumMarg1) {
        this.acumMarg1 = acumMarg1;
   }

   public BigDecimal getAcumMarg10() {
        return acumMarg10;
   }

   public void setAcumMarg10(BigDecimal acumMarg10) {
        this.acumMarg10 = acumMarg10;
   }

   public BigDecimal getQtdMinima() {
        return qtdMinima;
   }

   public void setQtdMinima(BigDecimal qtdMinima) {
        this.qtdMinima = qtdMinima;
   }

   public BigDecimal getQtdTotal() {
        return qtdTotal;
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        this.qtdTotal = qtdTotal;
   }

   public BigDecimal getQtdUltCompra() {
        return qtdUltCompra;
   }

   public void setQtdUltCompra(BigDecimal qtdUltCompra) {
        this.qtdUltCompra = qtdUltCompra;
   }

   public BigDecimal getPartPeso10() {
        return partPeso10;
   }

   public void setPartPeso10(BigDecimal partPeso10) {
        this.partPeso10 = partPeso10;
   }

   public BigDecimal getPartPeso11() {
        return partPeso11;
   }

   public void setPartPeso11(BigDecimal partPeso11) {
        this.partPeso11 = partPeso11;
   }

   public BigDecimal getPartPeso12() {
        return partPeso12;
   }

   public void setPartPeso12(BigDecimal partPeso12) {
        this.partPeso12 = partPeso12;
   }

   public BigDecimal getPartPeso2() {
        return partPeso2;
   }

   public void setPartPeso2(BigDecimal partPeso2) {
        this.partPeso2 = partPeso2;
   }

   public BigDecimal getPartPeso3() {
        return partPeso3;
   }

   public void setPartPeso3(BigDecimal partPeso3) {
        this.partPeso3 = partPeso3;
   }

   public BigDecimal getPartPeso4() {
        return partPeso4;
   }

   public void setPartPeso4(BigDecimal partPeso4) {
        this.partPeso4 = partPeso4;
   }

   public BigDecimal getPartPeso5() {
        return partPeso5;
   }

   public void setPartPeso5(BigDecimal partPeso5) {
        this.partPeso5 = partPeso5;
   }

   public BigDecimal getPartPeso6() {
        return partPeso6;
   }

   public void setPartPeso6(BigDecimal partPeso6) {
        this.partPeso6 = partPeso6;
   }

   public BigDecimal getPartPeso7() {
        return partPeso7;
   }

   public void setPartPeso7(BigDecimal partPeso7) {
        this.partPeso7 = partPeso7;
   }

   public BigDecimal getPartPeso8() {
        return partPeso8;
   }

   public void setPartPeso8(BigDecimal partPeso8) {
        this.partPeso8 = partPeso8;
   }

   public BigDecimal getPartPeso9() {
        return partPeso9;
   }

   public void setPartPeso9(BigDecimal partPeso9) {
        this.partPeso9 = partPeso9;
   }

   public BigDecimal getPartQtde1() {
        return partQtde1;
   }

   public void setPartQtde1(BigDecimal partQtde1) {
        this.partQtde1 = partQtde1;
   }

   public BigDecimal getPartQtde10() {
        return partQtde10;
   }

   public void setPartQtde10(BigDecimal partQtde10) {
        this.partQtde10 = partQtde10;
   }

   public BigDecimal getPartQtde11() {
        return partQtde11;
   }

   public void setPartQtde11(BigDecimal partQtde11) {
        this.partQtde11 = partQtde11;
   }

   public BigDecimal getPartQtde12() {
        return partQtde12;
   }

   public void setPartQtde12(BigDecimal partQtde12) {
        this.partQtde12 = partQtde12;
   }

   public BigDecimal getPartQtde2() {
        return partQtde2;
   }

   public void setPartQtde2(BigDecimal partQtde2) {
        this.partQtde2 = partQtde2;
   }

   public BigDecimal getPartQtde3() {
        return partQtde3;
   }

   public void setPartQtde3(BigDecimal partQtde3) {
        this.partQtde3 = partQtde3;
   }

   public BigDecimal getPartQtde4() {
        return partQtde4;
   }

   public void setPartQtde4(BigDecimal partQtde4) {
        this.partQtde4 = partQtde4;
   }

   public BigDecimal getPartQtde5() {
        return partQtde5;
   }

   public void setPartQtde5(BigDecimal partQtde5) {
        this.partQtde5 = partQtde5;
   }

   public BigDecimal getPartQtde6() {
        return partQtde6;
   }

   public void setPartQtde6(BigDecimal partQtde6) {
        this.partQtde6 = partQtde6;
   }

   public BigDecimal getPartQtde7() {
        return partQtde7;
   }

   public void setPartQtde7(BigDecimal partQtde7) {
        this.partQtde7 = partQtde7;
   }

   public BigDecimal getPartQtde8() {
        return partQtde8;
   }

   public void setPartQtde8(BigDecimal partQtde8) {
        this.partQtde8 = partQtde8;
   }

   public BigDecimal getPartQtde9() {
        return partQtde9;
   }

   public void setPartQtde9(BigDecimal partQtde9) {
        this.partQtde9 = partQtde9;
   }

   public BigDecimal getPartTotPer1() {
        return partTotPer1;
   }

   public void setPartTotPer1(BigDecimal partTotPer1) {
        this.partTotPer1 = partTotPer1;
   }

   public BigDecimal getPartTotPer10() {
        return partTotPer10;
   }

   public void setPartTotPer10(BigDecimal partTotPer10) {
        this.partTotPer10 = partTotPer10;
   }

   public BigDecimal getPartTotPer11() {
        return partTotPer11;
   }

   public void setPartTotPer11(BigDecimal partTotPer11) {
        this.partTotPer11 = partTotPer11;
   }

   public BigDecimal getPartTotPer12() {
        return partTotPer12;
   }

   public void setPartTotPer12(BigDecimal partTotPer12) {
        this.partTotPer12 = partTotPer12;
   }

   public BigDecimal getPartTotPer2() {
        return partTotPer2;
   }

   public void setPartTotPer2(BigDecimal partTotPer2) {
        this.partTotPer2 = partTotPer2;
   }

   public BigDecimal getPartTotPer3() {
        return partTotPer3;
   }

   public void setPartTotPer3(BigDecimal partTotPer3) {
        this.partTotPer3 = partTotPer3;
   }

   public BigDecimal getPartTotPer4() {
        return partTotPer4;
   }

   public void setPartTotPer4(BigDecimal partTotPer4) {
        this.partTotPer4 = partTotPer4;
   }

   public BigDecimal getPartTotPer5() {
        return partTotPer5;
   }

   public void setPartTotPer5(BigDecimal partTotPer5) {
        this.partTotPer5 = partTotPer5;
   }

   public BigDecimal getPartTotPer6() {
        return partTotPer6;
   }

   public void setPartTotPer6(BigDecimal partTotPer6) {
        this.partTotPer6 = partTotPer6;
   }

   public BigDecimal getPartTotPer7() {
        return partTotPer7;
   }

   public void setPartTotPer7(BigDecimal partTotPer7) {
        this.partTotPer7 = partTotPer7;
   }

   public BigDecimal getPartTotPer8() {
        return partTotPer8;
   }

   public void setPartTotPer8(BigDecimal partTotPer8) {
        this.partTotPer8 = partTotPer8;
   }

   public BigDecimal getPartTotPer9() {
        return partTotPer9;
   }

   public void setPartTotPer9(BigDecimal partTotPer9) {
        this.partTotPer9 = partTotPer9;
   }

   public BigDecimal getPedCpaPend() {
        return pedCpaPend;
   }

   public void setPedCpaPend(BigDecimal pedCpaPend) {
        this.pedCpaPend = pedCpaPend;
   }

   public BigDecimal getPedVdaPend() {
        return pedVdaPend;
   }

   public void setPedVdaPend(BigDecimal pedVdaPend) {
        this.pedVdaPend = pedVdaPend;
   }

   public BigDecimal getPerLucro1() {
        return perLucro1;
   }

   public void setPerLucro1(BigDecimal perLucro1) {
        this.perLucro1 = perLucro1;
   }

   public BigDecimal getPerLucro10() {
        return perLucro10;
   }

   public void setPerLucro10(BigDecimal perLucro10) {
        this.perLucro10 = perLucro10;
   }

   public BigDecimal getPerLucro11() {
        return perLucro11;
   }

   public void setPerLucro11(BigDecimal perLucro11) {
        this.perLucro11 = perLucro11;
   }

   public BigDecimal getPerLucro12() {
        return perLucro12;
   }

   public void setPerLucro12(BigDecimal perLucro12) {
        this.perLucro12 = perLucro12;
   }

   public BigDecimal getPerLucro2() {
        return perLucro2;
   }

   public void setPerLucro2(BigDecimal perLucro2) {
        this.perLucro2 = perLucro2;
   }

   public BigDecimal getPerLucro3() {
        return perLucro3;
   }

   public void setPerLucro3(BigDecimal perLucro3) {
        this.perLucro3 = perLucro3;
   }

   public BigDecimal getPerLucro4() {
        return perLucro4;
   }

   public void setPerLucro4(BigDecimal perLucro4) {
        this.perLucro4 = perLucro4;
   }

   public BigDecimal getPerLucro5() {
        return perLucro5;
   }

   public void setPerLucro5(BigDecimal perLucro5) {
        this.perLucro5 = perLucro5;
   }

   public BigDecimal getPerLucro6() {
        return perLucro6;
   }

   public void setPerLucro6(BigDecimal perLucro6) {
        this.perLucro6 = perLucro6;
   }

   public BigDecimal getPerLucro7() {
        return perLucro7;
   }

   public void setPerLucro7(BigDecimal perLucro7) {
        this.perLucro7 = perLucro7;
   }

   public BigDecimal getPerLucro8() {
        return perLucro8;
   }

   public void setPerLucro8(BigDecimal perLucro8) {
        this.perLucro8 = perLucro8;
   }

   public BigDecimal getPerLucro9() {
        return perLucro9;
   }

   public void setPerLucro9(BigDecimal perLucro9) {
        this.perLucro9 = perLucro9;
   }

   public BigDecimal getPeso1() {
        return peso1;
   }

   public void setPeso1(BigDecimal peso1) {
        this.peso1 = peso1;
   }

   public BigDecimal getPeso10() {
        return peso10;
   }

   public void setPeso10(BigDecimal peso10) {
        this.peso10 = peso10;
   }

   public BigDecimal getPeso11() {
        return peso11;
   }

   public void setPeso11(BigDecimal peso11) {
        this.peso11 = peso11;
   }

   public BigDecimal getPeso12() {
        return peso12;
   }

   public void setPeso12(BigDecimal peso12) {
        this.peso12 = peso12;
   }

   public BigDecimal getPeso2() {
        return peso2;
   }

   public void setPeso2(BigDecimal peso2) {
        this.peso2 = peso2;
   }

   public BigDecimal getPeso3() {
        return peso3;
   }

   public void setPeso3(BigDecimal peso3) {
        this.peso3 = peso3;
   }

   public BigDecimal getPeso4() {
        return peso4;
   }

   public void setPeso4(BigDecimal peso4) {
        this.peso4 = peso4;
   }

   public BigDecimal getPeso5() {
        return peso5;
   }

   public void setPeso5(BigDecimal peso5) {
        this.peso5 = peso5;
   }

   public BigDecimal getPeso6() {
        return peso6;
   }

   public void setPeso6(BigDecimal peso6) {
        this.peso6 = peso6;
   }

   public BigDecimal getPeso7() {
        return peso7;
   }

   public void setPeso7(BigDecimal peso7) {
        this.peso7 = peso7;
   }

   public BigDecimal getPeso8() {
        return peso8;
   }

   public void setPeso8(BigDecimal peso8) {
        this.peso8 = peso8;
   }

   public BigDecimal getPeso9() {
        return peso9;
   }

   public void setPeso9(BigDecimal peso9) {
        this.peso9 = peso9;
   }

   public BigDecimal getPopTotal() {
        return popTotal;
   }

   public void setPopTotal(BigDecimal popTotal) {
        this.popTotal = popTotal;
   }

   public BigDecimal getPopularidade1() {
        return popularidade1;
   }

   public void setPopularidade1(BigDecimal popularidade1) {
        this.popularidade1 = popularidade1;
   }

   public BigDecimal getPopularidade10() {
        return popularidade10;
   }

   public void setPopularidade10(BigDecimal popularidade10) {
        this.popularidade10 = popularidade10;
   }

   public BigDecimal getPopularidade11() {
        return popularidade11;
   }

   public void setPopularidade11(BigDecimal popularidade11) {
        this.popularidade11 = popularidade11;
   }

   public BigDecimal getPopularidade12() {
        return popularidade12;
   }

   public void setPopularidade12(BigDecimal popularidade12) {
        this.popularidade12 = popularidade12;
   }

   public BigDecimal getPopularidade2() {
        return popularidade2;
   }

   public void setPopularidade2(BigDecimal popularidade2) {
        this.popularidade2 = popularidade2;
   }

   public BigDecimal getPopularidade3() {
        return popularidade3;
   }

   public void setPopularidade3(BigDecimal popularidade3) {
        this.popularidade3 = popularidade3;
   }

   public BigDecimal getPopularidade4() {
        return popularidade4;
   }

   public void setPopularidade4(BigDecimal popularidade4) {
        this.popularidade4 = popularidade4;
   }

   public BigDecimal getPopularidade5() {
        return popularidade5;
   }

   public void setPopularidade5(BigDecimal popularidade5) {
        this.popularidade5 = popularidade5;
   }

   public BigDecimal getPartMargContFat3() {
        return partMargContFat3;
   }

   public void setPartMargContFat3(BigDecimal partMargContFat3) {
        this.partMargContFat3 = partMargContFat3;
   }

   public BigDecimal getPartMargContFat4() {
        return partMargContFat4;
   }

   public void setPartMargContFat4(BigDecimal partMargContFat4) {
        this.partMargContFat4 = partMargContFat4;
   }

   public BigDecimal getCustoVenda6() {
        return custoVenda6;
   }

   public void setCustoVenda6(BigDecimal custoVenda6) {
        this.custoVenda6 = custoVenda6;
   }

   public BigDecimal getCustoVenda7() {
        return custoVenda7;
   }

   public void setCustoVenda7(BigDecimal custoVenda7) {
        this.custoVenda7 = custoVenda7;
   }

   public BigDecimal getCustoVenda8() {
        return custoVenda8;
   }

   public void setCustoVenda8(BigDecimal custoVenda8) {
        this.custoVenda8 = custoVenda8;
   }

   public BigDecimal getCustoVenda9() {
        return custoVenda9;
   }

   public void setCustoVenda9(BigDecimal custoVenda9) {
        this.custoVenda9 = custoVenda9;
   }

   public BigDecimal getCustoVndTotal1() {
        return custoVndTotal1;
   }

   public void setCustoVndTotal1(BigDecimal custoVndTotal1) {
        this.custoVndTotal1 = custoVndTotal1;
   }

   public BigDecimal getCustoVndTotal10() {
        return custoVndTotal10;
   }

   public void setCustoVndTotal10(BigDecimal custoVndTotal10) {
        this.custoVndTotal10 = custoVndTotal10;
   }

   public BigDecimal getCustoVndTotal11() {
        return custoVndTotal11;
   }

   public void setCustoVndTotal11(BigDecimal custoVndTotal11) {
        this.custoVndTotal11 = custoVndTotal11;
   }

   public BigDecimal getCustoVndTotal12() {
        return custoVndTotal12;
   }

   public void setCustoVndTotal12(BigDecimal custoVndTotal12) {
        this.custoVndTotal12 = custoVndTotal12;
   }

   public BigDecimal getCustoVndTotal2() {
        return custoVndTotal2;
   }

   public void setCustoVndTotal2(BigDecimal custoVndTotal2) {
        this.custoVndTotal2 = custoVndTotal2;
   }

   public BigDecimal getCustoVndTotal3() {
        return custoVndTotal3;
   }

   public void setCustoVndTotal3(BigDecimal custoVndTotal3) {
        this.custoVndTotal3 = custoVndTotal3;
   }

   public BigDecimal getCustoVndTotal4() {
        return custoVndTotal4;
   }

   public void setCustoVndTotal4(BigDecimal custoVndTotal4) {
        this.custoVndTotal4 = custoVndTotal4;
   }

   public BigDecimal getCustoVndTotal5() {
        return custoVndTotal5;
   }

   public void setCustoVndTotal5(BigDecimal custoVndTotal5) {
        this.custoVndTotal5 = custoVndTotal5;
   }

   public BigDecimal getCustoVndTotal6() {
        return custoVndTotal6;
   }

   public void setCustoVndTotal6(BigDecimal custoVndTotal6) {
        this.custoVndTotal6 = custoVndTotal6;
   }

   public BigDecimal getCustoVndTotal7() {
        return custoVndTotal7;
   }

   public void setCustoVndTotal7(BigDecimal custoVndTotal7) {
        this.custoVndTotal7 = custoVndTotal7;
   }

   public BigDecimal getCustoVenda10() {
        return custoVenda10;
   }

   public void setCustoVenda10(BigDecimal custoVenda10) {
        this.custoVenda10 = custoVenda10;
   }

   public BigDecimal getCustoVenda11() {
        return custoVenda11;
   }

   public void setCustoVenda11(BigDecimal custoVenda11) {
        this.custoVenda11 = custoVenda11;
   }

   public BigDecimal getPopularidade6() {
        return popularidade6;
   }

   public void setPopularidade6(BigDecimal popularidade6) {
        this.popularidade6 = popularidade6;
   }

   public BigDecimal getVlrUnit7() {
        return vlrUnit7;
   }

   public void setVlrUnit7(BigDecimal vlrUnit7) {
        this.vlrUnit7 = vlrUnit7;
   }

   public BigDecimal getVlrUnit8() {
        return vlrUnit8;
   }

   public void setVlrUnit8(BigDecimal vlrUnit8) {
        this.vlrUnit8 = vlrUnit8;
   }

   public BigDecimal getVlrUnit9() {
        return vlrUnit9;
   }

   public void setVlrUnit9(BigDecimal vlrUnit9) {
        this.vlrUnit9 = vlrUnit9;
   }

   public BigDecimal getVlrVenda1() {
        return vlrVenda1;
   }

   public void setVlrVenda1(BigDecimal vlrVenda1) {
        this.vlrVenda1 = vlrVenda1;
   }

   public BigDecimal getVlrVenda10() {
        return vlrVenda10;
   }

   public void setVlrVenda10(BigDecimal vlrVenda10) {
        this.vlrVenda10 = vlrVenda10;
   }

   public BigDecimal getVlrVenda11() {
        return vlrVenda11;
   }

   public void setVlrVenda11(BigDecimal vlrVenda11) {
        this.vlrVenda11 = vlrVenda11;
   }

   public BigDecimal getVlrVenda12() {
        return vlrVenda12;
   }

   public void setVlrVenda12(BigDecimal vlrVenda12) {
        this.vlrVenda12 = vlrVenda12;
   }

   public BigDecimal getVlrVenda2() {
        return vlrVenda2;
   }

   public void setVlrVenda2(BigDecimal vlrVenda2) {
        this.vlrVenda2 = vlrVenda2;
   }

   public BigDecimal getVlrVenda3() {
        return vlrVenda3;
   }

   public void setVlrVenda3(BigDecimal vlrVenda3) {
        this.vlrVenda3 = vlrVenda3;
   }

   public BigDecimal getVlrVenda4() {
        return vlrVenda4;
   }

   public void setVlrVenda4(BigDecimal vlrVenda4) {
        this.vlrVenda4 = vlrVenda4;
   }

   public BigDecimal getVlrVenda5() {
        return vlrVenda5;
   }

   public void setVlrVenda5(BigDecimal vlrVenda5) {
        this.vlrVenda5 = vlrVenda5;
   }

   public BigDecimal getVlrVenda6() {
        return vlrVenda6;
   }

   public void setVlrVenda6(BigDecimal vlrVenda6) {
        this.vlrVenda6 = vlrVenda6;
   }

   public BigDecimal getVlrVenda7() {
        return vlrVenda7;
   }

   public void setVlrVenda7(BigDecimal vlrVenda7) {
        this.vlrVenda7 = vlrVenda7;
   }

   public BigDecimal getVlrVenda8() {
        return vlrVenda8;
   }

   public void setVlrVenda8(BigDecimal vlrVenda8) {
        this.vlrVenda8 = vlrVenda8;
   }

   public BigDecimal getVlrVenda9() {
        return vlrVenda9;
   }

   public void setVlrVenda9(BigDecimal vlrVenda9) {
        this.vlrVenda9 = vlrVenda9;
   }

   public BigDecimal getVlrVendiaUtil1() {
        return vlrVendiaUtil1;
   }

   public void setVlrVendiaUtil1(BigDecimal vlrVendiaUtil1) {
        this.vlrVendiaUtil1 = vlrVendiaUtil1;
   }

   public BigDecimal getVlrVendiaUtil10() {
        return vlrVendiaUtil10;
   }

   public void setVlrVendiaUtil10(BigDecimal vlrVendiaUtil10) {
        this.vlrVendiaUtil10 = vlrVendiaUtil10;
   }

   public BigDecimal getVlrVendiaUtil11() {
        return vlrVendiaUtil11;
   }

   public void setVlrVendiaUtil11(BigDecimal vlrVendiaUtil11) {
        this.vlrVendiaUtil11 = vlrVendiaUtil11;
   }

   public BigDecimal getVlrVendiaUtil12() {
        return vlrVendiaUtil12;
   }

   public void setVlrVendiaUtil12(BigDecimal vlrVendiaUtil12) {
        this.vlrVendiaUtil12 = vlrVendiaUtil12;
   }

   public BigDecimal getVlrVendiaUtil2() {
        return vlrVendiaUtil2;
   }

   public void setVlrVendiaUtil2(BigDecimal vlrVendiaUtil2) {
        this.vlrVendiaUtil2 = vlrVendiaUtil2;
   }

   public BigDecimal getVlrVendiaUtil3() {
        return vlrVendiaUtil3;
   }

   public void setVlrVendiaUtil3(BigDecimal vlrVendiaUtil3) {
        this.vlrVendiaUtil3 = vlrVendiaUtil3;
   }

   public BigDecimal getVlrVendiaUtil4() {
        return vlrVendiaUtil4;
   }

   public void setVlrVendiaUtil4(BigDecimal vlrVendiaUtil4) {
        this.vlrVendiaUtil4 = vlrVendiaUtil4;
   }

   public BigDecimal getVlrVendiaUtil5() {
        return vlrVendiaUtil5;
   }

   public void setVlrVendiaUtil5(BigDecimal vlrVendiaUtil5) {
        this.vlrVendiaUtil5 = vlrVendiaUtil5;
   }

   public BigDecimal getVlrVendiaUtil6() {
        return vlrVendiaUtil6;
   }

   public void setVlrVendiaUtil6(BigDecimal vlrVendiaUtil6) {
        this.vlrVendiaUtil6 = vlrVendiaUtil6;
   }

   public BigDecimal getVlrVendiaUtil7() {
        return vlrVendiaUtil7;
   }

   public void setVlrVendiaUtil7(BigDecimal vlrVendiaUtil7) {
        this.vlrVendiaUtil7 = vlrVendiaUtil7;
   }

   public BigDecimal getVlrVendiaUtil8() {
        return vlrVendiaUtil8;
   }

   public void setVlrVendiaUtil8(BigDecimal vlrVendiaUtil8) {
        this.vlrVendiaUtil8 = vlrVendiaUtil8;
   }

   public BigDecimal getVlrVendiaUtil9() {
        return vlrVendiaUtil9;
   }

   public void setVlrVendiaUtil9(BigDecimal vlrVendiaUtil9) {
        this.vlrVendiaUtil9 = vlrVendiaUtil9;
   }

   public String getCurvaTot5() {
        return curvaTot5;
   }

   public void setCurvaTot5(String curvaTot5) {
        this.curvaTot5 = curvaTot5;
   }

   public BigDecimal getPartMargContFat1() {
        return partMargContFat1;
   }

   public void setPartMargContFat1(BigDecimal partMargContFat1) {
        this.partMargContFat1 = partMargContFat1;
   }

   public BigDecimal getPartMargContFat10() {
        return partMargContFat10;
   }

   public void setPartMargContFat10(BigDecimal partMargContFat10) {
        this.partMargContFat10 = partMargContFat10;
   }

   public BigDecimal getPartMargContFat11() {
        return partMargContFat11;
   }

   public void setPartMargContFat11(BigDecimal partMargContFat11) {
        this.partMargContFat11 = partMargContFat11;
   }

   public BigDecimal getPartMargContFat12() {
        return partMargContFat12;
   }

   public void setPartMargContFat12(BigDecimal partMargContFat12) {
        this.partMargContFat12 = partMargContFat12;
   }

   public BigDecimal getPartMargContFat2() {
        return partMargContFat2;
   }

   public void setPartMargContFat2(BigDecimal partMargContFat2) {
        this.partMargContFat2 = partMargContFat2;
   }

   public BigDecimal getVlrGastoVar3() {
        return vlrGastoVar3;
   }

   public void setVlrGastoVar3(BigDecimal vlrGastoVar3) {
        this.vlrGastoVar3 = vlrGastoVar3;
   }

   public BigDecimal getVlrGastoVar4() {
        return vlrGastoVar4;
   }

   public void setVlrGastoVar4(BigDecimal vlrGastoVar4) {
        this.vlrGastoVar4 = vlrGastoVar4;
   }

   public BigDecimal getVlrGastoVar5() {
        return vlrGastoVar5;
   }

   public void setVlrGastoVar5(BigDecimal vlrGastoVar5) {
        this.vlrGastoVar5 = vlrGastoVar5;
   }

   public BigDecimal getAcumPeso7() {
        return acumPeso7;
   }

   public void setAcumPeso7(BigDecimal acumPeso7) {
        this.acumPeso7 = acumPeso7;
   }

   public BigDecimal getAcumPeso8() {
        return acumPeso8;
   }

   public void setAcumPeso8(BigDecimal acumPeso8) {
        this.acumPeso8 = acumPeso8;
   }

   public BigDecimal getAcumPeso9() {
        return acumPeso9;
   }

   public void setAcumPeso9(BigDecimal acumPeso9) {
        this.acumPeso9 = acumPeso9;
   }

   public BigDecimal getAcumQtd1() {
        return acumQtd1;
   }

   public void setAcumQtd1(BigDecimal acumQtd1) {
        this.acumQtd1 = acumQtd1;
   }

   public BigDecimal getAcumQtd10() {
        return acumQtd10;
   }

   public void setAcumQtd10(BigDecimal acumQtd10) {
        this.acumQtd10 = acumQtd10;
   }

   public BigDecimal getAcumQtd11() {
        return acumQtd11;
   }

   public void setAcumQtd11(BigDecimal acumQtd11) {
        this.acumQtd11 = acumQtd11;
   }

   public BigDecimal getAcumQtd12() {
        return acumQtd12;
   }

   public void setAcumQtd12(BigDecimal acumQtd12) {
        this.acumQtd12 = acumQtd12;
   }

   public BigDecimal getAcumQtd2() {
        return acumQtd2;
   }

   public void setAcumQtd2(BigDecimal acumQtd2) {
        this.acumQtd2 = acumQtd2;
   }

   public BigDecimal getAcumQtd3() {
        return acumQtd3;
   }

   public void setAcumQtd3(BigDecimal acumQtd3) {
        this.acumQtd3 = acumQtd3;
   }

   public BigDecimal getAcumQtd4() {
        return acumQtd4;
   }

   public void setAcumQtd4(BigDecimal acumQtd4) {
        this.acumQtd4 = acumQtd4;
   }

   public BigDecimal getAcumQtd5() {
        return acumQtd5;
   }

   public void setAcumQtd5(BigDecimal acumQtd5) {
        this.acumQtd5 = acumQtd5;
   }

   public BigDecimal getAcumQtd6() {
        return acumQtd6;
   }

   public void setAcumQtd6(BigDecimal acumQtd6) {
        this.acumQtd6 = acumQtd6;
   }

   public BigDecimal getAcumQtd7() {
        return acumQtd7;
   }

   public void setAcumQtd7(BigDecimal acumQtd7) {
        this.acumQtd7 = acumQtd7;
   }

   public BigDecimal getAcumQtd8() {
        return acumQtd8;
   }

   public void setAcumQtd8(BigDecimal acumQtd8) {
        this.acumQtd8 = acumQtd8;
   }

   public BigDecimal getAcumQtd9() {
        return acumQtd9;
   }

   public void setAcumQtd9(BigDecimal acumQtd9) {
        this.acumQtd9 = acumQtd9;
   }

   public BigDecimal getAcumTot1() {
        return acumTot1;
   }

   public void setAcumTot1(BigDecimal acumTot1) {
        this.acumTot1 = acumTot1;
   }

   public BigDecimal getAcumTot10() {
        return acumTot10;
   }

   public void setAcumTot10(BigDecimal acumTot10) {
        this.acumTot10 = acumTot10;
   }

   public BigDecimal getAcumTot11() {
        return acumTot11;
   }

   public void setAcumTot11(BigDecimal acumTot11) {
        this.acumTot11 = acumTot11;
   }

   public BigDecimal getAcumTot12() {
        return acumTot12;
   }

   public void setAcumTot12(BigDecimal acumTot12) {
        this.acumTot12 = acumTot12;
   }

   public BigDecimal getAcumTot2() {
        return acumTot2;
   }

   public void setAcumTot2(BigDecimal acumTot2) {
        this.acumTot2 = acumTot2;
   }

   public BigDecimal getAcumTot3() {
        return acumTot3;
   }

   public void setAcumTot3(BigDecimal acumTot3) {
        this.acumTot3 = acumTot3;
   }

   public BigDecimal getAcumTot4() {
        return acumTot4;
   }

   public void setAcumTot4(BigDecimal acumTot4) {
        this.acumTot4 = acumTot4;
   }

   public BigDecimal getAcumTot5() {
        return acumTot5;
   }

   public void setAcumTot5(BigDecimal acumTot5) {
        this.acumTot5 = acumTot5;
   }

   public BigDecimal getAcumTot6() {
        return acumTot6;
   }

   public void setAcumTot6(BigDecimal acumTot6) {
        this.acumTot6 = acumTot6;
   }

   public BigDecimal getAcumTot7() {
        return acumTot7;
   }

   public void setAcumTot7(BigDecimal acumTot7) {
        this.acumTot7 = acumTot7;
   }

   public BigDecimal getAcumTot8() {
        return acumTot8;
   }

   public void setAcumTot8(BigDecimal acumTot8) {
        this.acumTot8 = acumTot8;
   }

   public BigDecimal getAcumTot9() {
        return acumTot9;
   }

   public void setAcumTot9(BigDecimal acumTot9) {
        this.acumTot9 = acumTot9;
   }

   public BigDecimal getAliqCred() {
        return aliqCred;
   }

   public void setAliqCred(BigDecimal aliqCred) {
        this.aliqCred = aliqCred;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getMultipCpa() {
        return multipCpa;
   }

   public void setMultipCpa(BigDecimal multipCpa) {
        this.multipCpa = multipCpa;
   }

   public BigDecimal getSugCompraGirAjustado() {
        return sugCompraGirAjustado;
   }

   public void setSugCompraGirAjustado(BigDecimal sugCompraGirAjustado) {
        this.sugCompraGirAjustado = sugCompraGirAjustado;
   }

   public BigDecimal getSugCompraGirAjustadoMultCpa() {
        return sugCompraGirAjustadoMultCpa;
   }

   public void setSugCompraGirAjustadoMultCpa(BigDecimal sugCompraGirAjustadoMultCpa) {
        this.sugCompraGirAjustadoMultCpa = sugCompraGirAjustadoMultCpa;
   }

   public String getTemSugGiroAjustado() {
        return temSugGiroAjustado;
   }

   public void setTemSugGiroAjustado(String temSugGiroAjustado) {
        this.temSugGiroAjustado = temSugGiroAjustado;
   }

   public String getUnPadrao() {
        return unPadrao;
   }

   public void setUnPadrao(String unPadrao) {
        this.unPadrao = unPadrao;
   }

   public BigDecimal getSugCompraGirMultCpa() {
        return sugCompraGirMultCpa;
   }

   public void setSugCompraGirMultCpa(BigDecimal sugCompraGirMultCpa) {
        this.sugCompraGirMultCpa = sugCompraGirMultCpa;
   }

   public BigDecimal getAcumMarg4() {
        return acumMarg4;
   }

   public void setAcumMarg4(BigDecimal acumMarg4) {
        this.acumMarg4 = acumMarg4;
   }

   public BigDecimal getAcumMarg5() {
        return acumMarg5;
   }

   public void setAcumMarg5(BigDecimal acumMarg5) {
        this.acumMarg5 = acumMarg5;
   }

   public BigDecimal getAcumMarg6() {
        return acumMarg6;
   }

   public void setAcumMarg6(BigDecimal acumMarg6) {
        this.acumMarg6 = acumMarg6;
   }

   public BigDecimal getAcumMarg7() {
        return acumMarg7;
   }

   public void setAcumMarg7(BigDecimal acumMarg7) {
        this.acumMarg7 = acumMarg7;
   }

   public BigDecimal getAcumMarg8() {
        return acumMarg8;
   }

   public void setAcumMarg8(BigDecimal acumMarg8) {
        this.acumMarg8 = acumMarg8;
   }

   public BigDecimal getAcumMarg11() {
        return acumMarg11;
   }

   public void setAcumMarg11(BigDecimal acumMarg11) {
        this.acumMarg11 = acumMarg11;
   }

   public BigDecimal getAcumMarg12() {
        return acumMarg12;
   }

   public void setAcumMarg12(BigDecimal acumMarg12) {
        this.acumMarg12 = acumMarg12;
   }

   public BigDecimal getAcumPeso11() {
        return acumPeso11;
   }

   public void setAcumPeso11(BigDecimal acumPeso11) {
        this.acumPeso11 = acumPeso11;
   }

   public BigDecimal getAcumPeso12() {
        return acumPeso12;
   }

   public void setAcumPeso12(BigDecimal acumPeso12) {
        this.acumPeso12 = acumPeso12;
   }

   public BigDecimal getAcumPeso2() {
        return acumPeso2;
   }

   public void setAcumPeso2(BigDecimal acumPeso2) {
        this.acumPeso2 = acumPeso2;
   }

   public BigDecimal getAcumPeso3() {
        return acumPeso3;
   }

   public void setAcumPeso3(BigDecimal acumPeso3) {
        this.acumPeso3 = acumPeso3;
   }

   public BigDecimal getSugCompraMultCpa() {
        return sugCompraMultCpa;
   }

   public void setSugCompraMultCpa(BigDecimal sugCompraMultCpa) {
        this.sugCompraMultCpa = sugCompraMultCpa;
   }

   public String getSugCpaGirAlterado() {
        return sugCpaGirAlterado;
   }

   public void setSugCpaGirAlterado(String sugCpaGirAlterado) {
        this.sugCpaGirAlterado = sugCpaGirAlterado;
   }

   public BigDecimal getPercDescFornecedor() {
        return percDescFornecedor;
   }

   public void setPercDescFornecedor(BigDecimal percDescFornecedor) {
        this.percDescFornecedor = percDescFornecedor;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        this.numCotacao = numCotacao;
   }

   public BigDecimal getWmsBloqueado() {
        return wmsBloqueado;
   }

   public void setWmsBloqueado(BigDecimal wmsBloqueado) {
        this.wmsBloqueado = wmsBloqueado;
   }

   public BigDecimal getAcumMarg2() {
        return acumMarg2;
   }

   public void setAcumMarg2(BigDecimal acumMarg2) {
        this.acumMarg2 = acumMarg2;
   }

   public BigDecimal getAcumMarg3() {
        return acumMarg3;
   }

   public void setAcumMarg3(BigDecimal acumMarg3) {
        this.acumMarg3 = acumMarg3;
   }

   public BigDecimal getDurEstPosCpaGir() {
        return durEstPosCpaGir;
   }

   public void setDurEstPosCpaGir(BigDecimal durEstPosCpaGir) {
        this.durEstPosCpaGir = durEstPosCpaGir;
   }

   public BigDecimal getDurEstSeg() {
        return durEstSeg;
   }

   public void setDurEstSeg(BigDecimal durEstSeg) {
        this.durEstSeg = durEstSeg;
   }

   public BigDecimal getDiasUteis() {
        return diasUteis;
   }

   public void setDiasUteis(BigDecimal diasUteis) {
        this.diasUteis = diasUteis;
   }

   public Timestamp getPrevEntrega() {
        return prevEntrega;
   }

   public void setPrevEntrega(Timestamp prevEntrega) {
        this.prevEntrega = prevEntrega;
   }

   public BigDecimal getGiroDiario() {
        return giroDiario;
   }

   public void setGiroDiario(BigDecimal giroDiario) {
        this.giroDiario = giroDiario;
   }

   public Timestamp getPontoPed() {
        return pontoPed;
   }

   public void setPontoPed(Timestamp pontoPed) {
        this.pontoPed = pontoPed;
   }

   public BigDecimal getVlrUltCompra() {
        return vlrUltCompra;
   }

   public void setVlrUltCompra(BigDecimal vlrUltCompra) {
        this.vlrUltCompra = vlrUltCompra;
   }

   public String getPossuiFam() {
        return possuiFam;
   }

   public void setPossuiFam(String possuiFam) {
        this.possuiFam = possuiFam;
   }

   public BigDecimal getDiasRuptura() {
        return diasRuptura;
   }

   public void setDiasRuptura(BigDecimal diasRuptura) {
        this.diasRuptura = diasRuptura;
   }

   public BigDecimal getDiasRupturaEst1() {
        return diasRupturaEst1;
   }

   public void setDiasRupturaEst1(BigDecimal diasRupturaEst1) {
        this.diasRupturaEst1 = diasRupturaEst1;
   }

   public BigDecimal getDiasRupturaEst10() {
        return diasRupturaEst10;
   }

   public void setDiasRupturaEst10(BigDecimal diasRupturaEst10) {
        this.diasRupturaEst10 = diasRupturaEst10;
   }

   public BigDecimal getDiasRupturaEst11() {
        return diasRupturaEst11;
   }

   public void setDiasRupturaEst11(BigDecimal diasRupturaEst11) {
        this.diasRupturaEst11 = diasRupturaEst11;
   }

   public BigDecimal getDiasRupturaEst12() {
        return diasRupturaEst12;
   }

   public void setDiasRupturaEst12(BigDecimal diasRupturaEst12) {
        this.diasRupturaEst12 = diasRupturaEst12;
   }

   public BigDecimal getDiasRupturaEst2() {
        return diasRupturaEst2;
   }

   public void setDiasRupturaEst2(BigDecimal diasRupturaEst2) {
        this.diasRupturaEst2 = diasRupturaEst2;
   }

   public BigDecimal getDiasRupturaEst3() {
        return diasRupturaEst3;
   }

   public void setDiasRupturaEst3(BigDecimal diasRupturaEst3) {
        this.diasRupturaEst3 = diasRupturaEst3;
   }

   public BigDecimal getDiasRupturaEst4() {
        return diasRupturaEst4;
   }

   public void setDiasRupturaEst4(BigDecimal diasRupturaEst4) {
        this.diasRupturaEst4 = diasRupturaEst4;
   }

   public BigDecimal getDiasRupturaEst5() {
        return diasRupturaEst5;
   }

   public void setDiasRupturaEst5(BigDecimal diasRupturaEst5) {
        this.diasRupturaEst5 = diasRupturaEst5;
   }

   public BigDecimal getDiasRupturaEst6() {
        return diasRupturaEst6;
   }

   public void setDiasRupturaEst6(BigDecimal diasRupturaEst6) {
        this.diasRupturaEst6 = diasRupturaEst6;
   }

   public BigDecimal getDiasRupturaEst7() {
        return diasRupturaEst7;
   }

   public void setDiasRupturaEst7(BigDecimal diasRupturaEst7) {
        this.diasRupturaEst7 = diasRupturaEst7;
   }

   public BigDecimal getDiasRupturaEst8() {
        return diasRupturaEst8;
   }

   public void setDiasRupturaEst8(BigDecimal diasRupturaEst8) {
        this.diasRupturaEst8 = diasRupturaEst8;
   }

   public BigDecimal getDiasRupturaEst9() {
        return diasRupturaEst9;
   }

   public void setDiasRupturaEst9(BigDecimal diasRupturaEst9) {
        this.diasRupturaEst9 = diasRupturaEst9;
   }

   public BigDecimal getNumMps() {
        return numMps;
   }

   public void setNumMps(BigDecimal numMps) {
        this.numMps = numMps;
   }

   @Override
   public String getEntityName() {
        return "GiroProduto";
   }

   @Override
   public GiroProduto fromVO(DynamicVO vo) {
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codRel = vo.asBigDecimal("CODREL");
        this.codVol = vo.asString("CODVOL");
        this.codVolCompra = vo.asString("CODVOLCOMPRA");
        this.complDesc = vo.asString("COMPLDESC");
        this.controlado = vo.asString("CONTROLADO");
        this.controle = vo.asString("CONTROLE");
        this.curvaMarg1 = vo.asString("CURVAMARG1");
        this.curvaMarg10 = vo.asString("CURVAMARG10");
        this.curvaMarg11 = vo.asString("CURVAMARG11");
        this.curvaMarg12 = vo.asString("CURVAMARG12");
        this.curvaMarg2 = vo.asString("CURVAMARG2");
        this.curvaMarg3 = vo.asString("CURVAMARG3");
        this.curvaMarg4 = vo.asString("CURVAMARG4");
        this.curvaMarg5 = vo.asString("CURVAMARG5");
        this.curvaMarg6 = vo.asString("CURVAMARG6");
        this.curvaMarg7 = vo.asString("CURVAMARG7");
        this.curvaMarg8 = vo.asString("CURVAMARG8");
        this.curvaMarg9 = vo.asString("CURVAMARG9");
        this.curvaPeso1 = vo.asString("CURVAPESO1");
        this.curvaPeso10 = vo.asString("CURVAPESO10");
        this.curvaPeso11 = vo.asString("CURVAPESO11");
        this.curvaPeso12 = vo.asString("CURVAPESO12");
        this.curvaPeso2 = vo.asString("CURVAPESO2");
        this.curvaPeso3 = vo.asString("CURVAPESO3");
        this.curvaPeso4 = vo.asString("CURVAPESO4");
        this.curvaPeso5 = vo.asString("CURVAPESO5");
        this.curvaPeso6 = vo.asString("CURVAPESO6");
        this.curvaPeso7 = vo.asString("CURVAPESO7");
        this.curvaPeso8 = vo.asString("CURVAPESO8");
        this.curvaPeso9 = vo.asString("CURVAPESO9");
        this.curvaQtd1 = vo.asString("CURVAQTD1");
        this.curvaQtd10 = vo.asString("CURVAQTD10");
        this.curvaQtd11 = vo.asString("CURVAQTD11");
        this.curvaQtd12 = vo.asString("CURVAQTD12");
        this.curvaQtd2 = vo.asString("CURVAQTD2");
        this.curvaQtd3 = vo.asString("CURVAQTD3");
        this.curvaQtd4 = vo.asString("CURVAQTD4");
        this.curvaQtd5 = vo.asString("CURVAQTD5");
        this.curvaQtd6 = vo.asString("CURVAQTD6");
        this.curvaQtd7 = vo.asString("CURVAQTD7");
        this.curvaQtd8 = vo.asString("CURVAQTD8");
        this.curvaQtd9 = vo.asString("CURVAQTD9");
        this.curvaTot1 = vo.asString("CURVATOT1");
        this.curvaTot10 = vo.asString("CURVATOT10");
        this.curvaTot11 = vo.asString("CURVATOT11");
        this.curvaTot12 = vo.asString("CURVATOT12");
        this.curvaTot2 = vo.asString("CURVATOT2");
        this.curvaTot3 = vo.asString("CURVATOT3");
        this.curvaTot4 = vo.asString("CURVATOT4");
        this.ultCompra = vo.asTimestamp("ULTCOMPRA");
        this.ultVenda = vo.asTimestamp("ULTVENDA");
        this.vlrCredIcms = vo.asBigDecimal("VLRCREDICMS");
        this.vlrGastoVar1 = vo.asBigDecimal("VLRGASTOVAR1");
        this.vlrGastoVar6 = vo.asBigDecimal("VLRGASTOVAR6");
        this.vlrGastoVar7 = vo.asBigDecimal("VLRGASTOVAR7");
        this.vlrGastoVar8 = vo.asBigDecimal("VLRGASTOVAR8");
        this.vlrGastoVar9 = vo.asBigDecimal("VLRGASTOVAR9");
        this.vlrMargCont1 = vo.asBigDecimal("VLRMARGCONT1");
        this.vlrMargCont10 = vo.asBigDecimal("VLRMARGCONT10");
        this.vlrMargCont11 = vo.asBigDecimal("VLRMARGCONT11");
        this.vlrMargCont12 = vo.asBigDecimal("VLRMARGCONT12");
        this.vlrMargCont2 = vo.asBigDecimal("VLRMARGCONT2");
        this.vlrMargCont3 = vo.asBigDecimal("VLRMARGCONT3");
        this.vlrMargCont4 = vo.asBigDecimal("VLRMARGCONT4");
        this.vlrMargCont5 = vo.asBigDecimal("VLRMARGCONT5");
        this.vlrMargCont6 = vo.asBigDecimal("VLRMARGCONT6");
        this.vlrMargCont7 = vo.asBigDecimal("VLRMARGCONT7");
        this.vlrMargCont8 = vo.asBigDecimal("VLRMARGCONT8");
        this.vlrMargCont9 = vo.asBigDecimal("VLRMARGCONT9");
        this.vlrTabPreco = vo.asBigDecimal("VLRTABPRECO");
        this.vlrTot1 = vo.asBigDecimal("VLRTOT1");
        this.vlrTot10 = vo.asBigDecimal("VLRTOT10");
        this.vlrTot11 = vo.asBigDecimal("VLRTOT11");
        this.vlrTot12 = vo.asBigDecimal("VLRTOT12");
        this.vlrTot2 = vo.asBigDecimal("VLRTOT2");
        this.vlrTot3 = vo.asBigDecimal("VLRTOT3");
        this.vlrTot4 = vo.asBigDecimal("VLRTOT4");
        this.vlrTot5 = vo.asBigDecimal("VLRTOT5");
        this.vlrTot6 = vo.asBigDecimal("VLRTOT6");
        this.vlrTot7 = vo.asBigDecimal("VLRTOT7");
        this.vlrTot8 = vo.asBigDecimal("VLRTOT8");
        this.vlrTot9 = vo.asBigDecimal("VLRTOT9");
        this.vlrUnit1 = vo.asBigDecimal("VLRUNIT1");
        this.vlrUnit10 = vo.asBigDecimal("VLRUNIT10");
        this.vlrUnit11 = vo.asBigDecimal("VLRUNIT11");
        this.vlrUnit12 = vo.asBigDecimal("VLRUNIT12");
        this.vlrUnit2 = vo.asBigDecimal("VLRUNIT2");
        this.vlrUnit3 = vo.asBigDecimal("VLRUNIT3");
        this.vlrUnit4 = vo.asBigDecimal("VLRUNIT4");
        this.vlrUnit5 = vo.asBigDecimal("VLRUNIT5");
        this.vlrUnit6 = vo.asBigDecimal("VLRUNIT6");
        this.acumPeso4 = vo.asBigDecimal("ACUMPESO4");
        this.acumPeso5 = vo.asBigDecimal("ACUMPESO5");
        this.acumPeso6 = vo.asBigDecimal("ACUMPESO6");
        this.popularidade7 = vo.asBigDecimal("POPULARIDADE7");
        this.popularidade8 = vo.asBigDecimal("POPULARIDADE8");
        this.popularidade9 = vo.asBigDecimal("POPULARIDADE9");
        this.acumMarg9 = vo.asBigDecimal("ACUMMARG9");
        this.acumPeso1 = vo.asBigDecimal("ACUMPESO1");
        this.acumPeso10 = vo.asBigDecimal("ACUMPESO10");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.custoVenda12 = vo.asBigDecimal("CUSTOVENDA12");
        this.custoVenda2 = vo.asBigDecimal("CUSTOVENDA2");
        this.custoVenda3 = vo.asBigDecimal("CUSTOVENDA3");
        this.custoVenda4 = vo.asBigDecimal("CUSTOVENDA4");
        this.custoVenda5 = vo.asBigDecimal("CUSTOVENDA5");
        this.vlrGastoVar10 = vo.asBigDecimal("VLRGASTOVAR10");
        this.vlrGastoVar11 = vo.asBigDecimal("VLRGASTOVAR11");
        this.vlrGastoVar12 = vo.asBigDecimal("VLRGASTOVAR12");
        this.vlrGastoVar2 = vo.asBigDecimal("VLRGASTOVAR2");
        this.sugCompra = vo.asBigDecimal("SUGCOMPRA");
        this.sugCompraGir = vo.asBigDecimal("SUGCOMPRAGIR");
        this.termolabil = vo.asString("TERMOLABIL");
        this.custoVndTotal8 = vo.asBigDecimal("CUSTOVNDTOTAL8");
        this.custoVndTotal9 = vo.asBigDecimal("CUSTOVNDTOTAL9");
        this.descMax = vo.asBigDecimal("DESCMAX");
        this.diasSemVenda = vo.asBigDecimal("DIASSEMVENDA");
        this.durEst = vo.asBigDecimal("DUREST");
        this.durEstPosCpa = vo.asBigDecimal("DURESTPOSCPA");
        this.estCustGer = vo.asBigDecimal("ESTCUSTGER");
        this.estMenMedVend = vo.asString("ESTMENMEDVEND");
        this.estMin = vo.asBigDecimal("ESTMIN");
        this.estMinGir = vo.asBigDecimal("ESTMINGIR");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.frequencia = vo.asBigDecimal("FREQUENCIA");
        this.idenCorrelato = vo.asString("IDENCORRELATO");
        this.idenCosme = vo.asString("IDENCOSME");
        this.idenOtc = vo.asString("IDENOTC");
        this.idenPortaria = vo.asString("IDENPORTARIA");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.listaLpm = vo.asString("LISTALPM");
        this.lucro1 = vo.asBigDecimal("LUCRO1");
        this.lucro10 = vo.asBigDecimal("LUCRO10");
        this.lucro11 = vo.asBigDecimal("LUCRO11");
        this.lucro12 = vo.asBigDecimal("LUCRO12");
        this.lucro2 = vo.asBigDecimal("LUCRO2");
        this.lucro3 = vo.asBigDecimal("LUCRO3");
        this.lucro4 = vo.asBigDecimal("LUCRO4");
        this.lucro5 = vo.asBigDecimal("LUCRO5");
        this.lucro6 = vo.asBigDecimal("LUCRO6");
        this.lucro7 = vo.asBigDecimal("LUCRO7");
        this.lucro8 = vo.asBigDecimal("LUCRO8");
        this.lucro9 = vo.asBigDecimal("LUCRO9");
        this.marca = vo.asString("MARCA");
        this.markup = vo.asBigDecimal("MARKUP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.oneroso = vo.asString("ONEROSO");
        this.ordemMedida = vo.asBigDecimal("ORDEMMEDIDA");
        this.partEstoque = vo.asBigDecimal("PARTESTOQUE");
        this.partGasVarFat1 = vo.asBigDecimal("PARTGASVARFAT1");
        this.partGasVarFat10 = vo.asBigDecimal("PARTGASVARFAT10");
        this.partGasVarFat11 = vo.asBigDecimal("PARTGASVARFAT11");
        this.partGasVarFat12 = vo.asBigDecimal("PARTGASVARFAT12");
        this.partGasVarFat2 = vo.asBigDecimal("PARTGASVARFAT2");
        this.partGasVarFat3 = vo.asBigDecimal("PARTGASVARFAT3");
        this.partGasVarFat4 = vo.asBigDecimal("PARTGASVARFAT4");
        this.partGasVarFat5 = vo.asBigDecimal("PARTGASVARFAT5");
        this.partGasVarFat6 = vo.asBigDecimal("PARTGASVARFAT6");
        this.partGasVarFat7 = vo.asBigDecimal("PARTGASVARFAT7");
        this.partGasVarFat8 = vo.asBigDecimal("PARTGASVARFAT8");
        this.partGasVarFat9 = vo.asBigDecimal("PARTGASVARFAT9");
        this.partGasVar1 = vo.asBigDecimal("PARTGASVAR1");
        this.partGasVar10 = vo.asBigDecimal("PARTGASVAR10");
        this.partGasVar11 = vo.asBigDecimal("PARTGASVAR11");
        this.partGasVar12 = vo.asBigDecimal("PARTGASVAR12");
        this.partGasVar2 = vo.asBigDecimal("PARTGASVAR2");
        this.partGasVar3 = vo.asBigDecimal("PARTGASVAR3");
        this.partGasVar4 = vo.asBigDecimal("PARTGASVAR4");
        this.partGasVar5 = vo.asBigDecimal("PARTGASVAR5");
        this.partGasVar6 = vo.asBigDecimal("PARTGASVAR6");
        this.partGasVar7 = vo.asBigDecimal("PARTGASVAR7");
        this.partGasVar8 = vo.asBigDecimal("PARTGASVAR8");
        this.partGasVar9 = vo.asBigDecimal("PARTGASVAR9");
        this.partLucro1 = vo.asBigDecimal("PARTLUCRO1");
        this.partLucro10 = vo.asBigDecimal("PARTLUCRO10");
        this.partLucro11 = vo.asBigDecimal("PARTLUCRO11");
        this.partLucro12 = vo.asBigDecimal("PARTLUCRO12");
        this.partLucro2 = vo.asBigDecimal("PARTLUCRO2");
        this.partLucro3 = vo.asBigDecimal("PARTLUCRO3");
        this.partLucro4 = vo.asBigDecimal("PARTLUCRO4");
        this.partLucro5 = vo.asBigDecimal("PARTLUCRO5");
        this.prodFalta = vo.asString("PRODFALTA");
        this.qtdMaxima = vo.asBigDecimal("QTDMAXIMA");
        this.qtdMedia = vo.asBigDecimal("QTDMEDIA");
        this.partLucro6 = vo.asBigDecimal("PARTLUCRO6");
        this.partLucro7 = vo.asBigDecimal("PARTLUCRO7");
        this.partLucro8 = vo.asBigDecimal("PARTLUCRO8");
        this.partLucro9 = vo.asBigDecimal("PARTLUCRO9");
        this.referencia = vo.asString("REFERENCIA");
        this.refForn = vo.asString("REFFORN");
        this.refMercMed = vo.asString("REFMERCMED");
        this.statusMed = vo.asBigDecimal("STATUSMED");
        this.sugCompCustGer = vo.asBigDecimal("SUGCOMPCUSTGER");
        this.curvaTot6 = vo.asString("CURVATOT6");
        this.curvaTot7 = vo.asString("CURVATOT7");
        this.curvaTot8 = vo.asString("CURVATOT8");
        this.curvaTot9 = vo.asString("CURVATOT9");
        this.custoGer = vo.asBigDecimal("CUSTOGER");
        this.custoRep = vo.asBigDecimal("CUSTOREP");
        this.custoVenda1 = vo.asBigDecimal("CUSTOVENDA1");
        this.partMargContFat5 = vo.asBigDecimal("PARTMARGCONTFAT5");
        this.partMargContFat6 = vo.asBigDecimal("PARTMARGCONTFAT6");
        this.partMargContFat7 = vo.asBigDecimal("PARTMARGCONTFAT7");
        this.partMargContFat8 = vo.asBigDecimal("PARTMARGCONTFAT8");
        this.partMargContFat9 = vo.asBigDecimal("PARTMARGCONTFAT9");
        this.partMargCont1 = vo.asBigDecimal("PARTMARGCONT1");
        this.partMargCont10 = vo.asBigDecimal("PARTMARGCONT10");
        this.partMargCont11 = vo.asBigDecimal("PARTMARGCONT11");
        this.partMargCont12 = vo.asBigDecimal("PARTMARGCONT12");
        this.partMargCont2 = vo.asBigDecimal("PARTMARGCONT2");
        this.partMargCont3 = vo.asBigDecimal("PARTMARGCONT3");
        this.partMargCont4 = vo.asBigDecimal("PARTMARGCONT4");
        this.partMargCont5 = vo.asBigDecimal("PARTMARGCONT5");
        this.partMargCont6 = vo.asBigDecimal("PARTMARGCONT6");
        this.partMargCont7 = vo.asBigDecimal("PARTMARGCONT7");
        this.partMargCont8 = vo.asBigDecimal("PARTMARGCONT8");
        this.partMargCont9 = vo.asBigDecimal("PARTMARGCONT9");
        this.partPeso1 = vo.asBigDecimal("PARTPESO1");
        this.acumMarg1 = vo.asBigDecimal("ACUMMARG1");
        this.acumMarg10 = vo.asBigDecimal("ACUMMARG10");
        this.qtdMinima = vo.asBigDecimal("QTDMINIMA");
        this.qtdTotal = vo.asBigDecimal("QTDTOTAL");
        this.qtdUltCompra = vo.asBigDecimal("QTDULTCOMPRA");
        this.partPeso10 = vo.asBigDecimal("PARTPESO10");
        this.partPeso11 = vo.asBigDecimal("PARTPESO11");
        this.partPeso12 = vo.asBigDecimal("PARTPESO12");
        this.partPeso2 = vo.asBigDecimal("PARTPESO2");
        this.partPeso3 = vo.asBigDecimal("PARTPESO3");
        this.partPeso4 = vo.asBigDecimal("PARTPESO4");
        this.partPeso5 = vo.asBigDecimal("PARTPESO5");
        this.partPeso6 = vo.asBigDecimal("PARTPESO6");
        this.partPeso7 = vo.asBigDecimal("PARTPESO7");
        this.partPeso8 = vo.asBigDecimal("PARTPESO8");
        this.partPeso9 = vo.asBigDecimal("PARTPESO9");
        this.partQtde1 = vo.asBigDecimal("PARTQTDE1");
        this.partQtde10 = vo.asBigDecimal("PARTQTDE10");
        this.partQtde11 = vo.asBigDecimal("PARTQTDE11");
        this.partQtde12 = vo.asBigDecimal("PARTQTDE12");
        this.partQtde2 = vo.asBigDecimal("PARTQTDE2");
        this.partQtde3 = vo.asBigDecimal("PARTQTDE3");
        this.partQtde4 = vo.asBigDecimal("PARTQTDE4");
        this.partQtde5 = vo.asBigDecimal("PARTQTDE5");
        this.partQtde6 = vo.asBigDecimal("PARTQTDE6");
        this.partQtde7 = vo.asBigDecimal("PARTQTDE7");
        this.partQtde8 = vo.asBigDecimal("PARTQTDE8");
        this.partQtde9 = vo.asBigDecimal("PARTQTDE9");
        this.partTotPer1 = vo.asBigDecimal("PARTTOTPER1");
        this.partTotPer10 = vo.asBigDecimal("PARTTOTPER10");
        this.partTotPer11 = vo.asBigDecimal("PARTTOTPER11");
        this.partTotPer12 = vo.asBigDecimal("PARTTOTPER12");
        this.partTotPer2 = vo.asBigDecimal("PARTTOTPER2");
        this.partTotPer3 = vo.asBigDecimal("PARTTOTPER3");
        this.partTotPer4 = vo.asBigDecimal("PARTTOTPER4");
        this.partTotPer5 = vo.asBigDecimal("PARTTOTPER5");
        this.partTotPer6 = vo.asBigDecimal("PARTTOTPER6");
        this.partTotPer7 = vo.asBigDecimal("PARTTOTPER7");
        this.partTotPer8 = vo.asBigDecimal("PARTTOTPER8");
        this.partTotPer9 = vo.asBigDecimal("PARTTOTPER9");
        this.pedCpaPend = vo.asBigDecimal("PEDCPAPEND");
        this.pedVdaPend = vo.asBigDecimal("PEDVDAPEND");
        this.perLucro1 = vo.asBigDecimal("PERLUCRO1");
        this.perLucro10 = vo.asBigDecimal("PERLUCRO10");
        this.perLucro11 = vo.asBigDecimal("PERLUCRO11");
        this.perLucro12 = vo.asBigDecimal("PERLUCRO12");
        this.perLucro2 = vo.asBigDecimal("PERLUCRO2");
        this.perLucro3 = vo.asBigDecimal("PERLUCRO3");
        this.perLucro4 = vo.asBigDecimal("PERLUCRO4");
        this.perLucro5 = vo.asBigDecimal("PERLUCRO5");
        this.perLucro6 = vo.asBigDecimal("PERLUCRO6");
        this.perLucro7 = vo.asBigDecimal("PERLUCRO7");
        this.perLucro8 = vo.asBigDecimal("PERLUCRO8");
        this.perLucro9 = vo.asBigDecimal("PERLUCRO9");
        this.peso1 = vo.asBigDecimal("PESO1");
        this.peso10 = vo.asBigDecimal("PESO10");
        this.peso11 = vo.asBigDecimal("PESO11");
        this.peso12 = vo.asBigDecimal("PESO12");
        this.peso2 = vo.asBigDecimal("PESO2");
        this.peso3 = vo.asBigDecimal("PESO3");
        this.peso4 = vo.asBigDecimal("PESO4");
        this.peso5 = vo.asBigDecimal("PESO5");
        this.peso6 = vo.asBigDecimal("PESO6");
        this.peso7 = vo.asBigDecimal("PESO7");
        this.peso8 = vo.asBigDecimal("PESO8");
        this.peso9 = vo.asBigDecimal("PESO9");
        this.popTotal = vo.asBigDecimal("POPTOTAL");
        this.popularidade1 = vo.asBigDecimal("POPULARIDADE1");
        this.popularidade10 = vo.asBigDecimal("POPULARIDADE10");
        this.popularidade11 = vo.asBigDecimal("POPULARIDADE11");
        this.popularidade12 = vo.asBigDecimal("POPULARIDADE12");
        this.popularidade2 = vo.asBigDecimal("POPULARIDADE2");
        this.popularidade3 = vo.asBigDecimal("POPULARIDADE3");
        this.popularidade4 = vo.asBigDecimal("POPULARIDADE4");
        this.popularidade5 = vo.asBigDecimal("POPULARIDADE5");
        this.partMargContFat3 = vo.asBigDecimal("PARTMARGCONTFAT3");
        this.partMargContFat4 = vo.asBigDecimal("PARTMARGCONTFAT4");
        this.custoVenda6 = vo.asBigDecimal("CUSTOVENDA6");
        this.custoVenda7 = vo.asBigDecimal("CUSTOVENDA7");
        this.custoVenda8 = vo.asBigDecimal("CUSTOVENDA8");
        this.custoVenda9 = vo.asBigDecimal("CUSTOVENDA9");
        this.custoVndTotal1 = vo.asBigDecimal("CUSTOVNDTOTAL1");
        this.custoVndTotal10 = vo.asBigDecimal("CUSTOVNDTOTAL10");
        this.custoVndTotal11 = vo.asBigDecimal("CUSTOVNDTOTAL11");
        this.custoVndTotal12 = vo.asBigDecimal("CUSTOVNDTOTAL12");
        this.custoVndTotal2 = vo.asBigDecimal("CUSTOVNDTOTAL2");
        this.custoVndTotal3 = vo.asBigDecimal("CUSTOVNDTOTAL3");
        this.custoVndTotal4 = vo.asBigDecimal("CUSTOVNDTOTAL4");
        this.custoVndTotal5 = vo.asBigDecimal("CUSTOVNDTOTAL5");
        this.custoVndTotal6 = vo.asBigDecimal("CUSTOVNDTOTAL6");
        this.custoVndTotal7 = vo.asBigDecimal("CUSTOVNDTOTAL7");
        this.custoVenda10 = vo.asBigDecimal("CUSTOVENDA10");
        this.custoVenda11 = vo.asBigDecimal("CUSTOVENDA11");
        this.popularidade6 = vo.asBigDecimal("POPULARIDADE6");
        this.vlrUnit7 = vo.asBigDecimal("VLRUNIT7");
        this.vlrUnit8 = vo.asBigDecimal("VLRUNIT8");
        this.vlrUnit9 = vo.asBigDecimal("VLRUNIT9");
        this.vlrVenda1 = vo.asBigDecimal("VLRVENDA1");
        this.vlrVenda10 = vo.asBigDecimal("VLRVENDA10");
        this.vlrVenda11 = vo.asBigDecimal("VLRVENDA11");
        this.vlrVenda12 = vo.asBigDecimal("VLRVENDA12");
        this.vlrVenda2 = vo.asBigDecimal("VLRVENDA2");
        this.vlrVenda3 = vo.asBigDecimal("VLRVENDA3");
        this.vlrVenda4 = vo.asBigDecimal("VLRVENDA4");
        this.vlrVenda5 = vo.asBigDecimal("VLRVENDA5");
        this.vlrVenda6 = vo.asBigDecimal("VLRVENDA6");
        this.vlrVenda7 = vo.asBigDecimal("VLRVENDA7");
        this.vlrVenda8 = vo.asBigDecimal("VLRVENDA8");
        this.vlrVenda9 = vo.asBigDecimal("VLRVENDA9");
        this.vlrVendiaUtil1 = vo.asBigDecimal("VLRVENDIAUTIL1");
        this.vlrVendiaUtil10 = vo.asBigDecimal("VLRVENDIAUTIL10");
        this.vlrVendiaUtil11 = vo.asBigDecimal("VLRVENDIAUTIL11");
        this.vlrVendiaUtil12 = vo.asBigDecimal("VLRVENDIAUTIL12");
        this.vlrVendiaUtil2 = vo.asBigDecimal("VLRVENDIAUTIL2");
        this.vlrVendiaUtil3 = vo.asBigDecimal("VLRVENDIAUTIL3");
        this.vlrVendiaUtil4 = vo.asBigDecimal("VLRVENDIAUTIL4");
        this.vlrVendiaUtil5 = vo.asBigDecimal("VLRVENDIAUTIL5");
        this.vlrVendiaUtil6 = vo.asBigDecimal("VLRVENDIAUTIL6");
        this.vlrVendiaUtil7 = vo.asBigDecimal("VLRVENDIAUTIL7");
        this.vlrVendiaUtil8 = vo.asBigDecimal("VLRVENDIAUTIL8");
        this.vlrVendiaUtil9 = vo.asBigDecimal("VLRVENDIAUTIL9");
        this.curvaTot5 = vo.asString("CURVATOT5");
        this.partMargContFat1 = vo.asBigDecimal("PARTMARGCONTFAT1");
        this.partMargContFat10 = vo.asBigDecimal("PARTMARGCONTFAT10");
        this.partMargContFat11 = vo.asBigDecimal("PARTMARGCONTFAT11");
        this.partMargContFat12 = vo.asBigDecimal("PARTMARGCONTFAT12");
        this.partMargContFat2 = vo.asBigDecimal("PARTMARGCONTFAT2");
        this.vlrGastoVar3 = vo.asBigDecimal("VLRGASTOVAR3");
        this.vlrGastoVar4 = vo.asBigDecimal("VLRGASTOVAR4");
        this.vlrGastoVar5 = vo.asBigDecimal("VLRGASTOVAR5");
        this.acumPeso7 = vo.asBigDecimal("ACUMPESO7");
        this.acumPeso8 = vo.asBigDecimal("ACUMPESO8");
        this.acumPeso9 = vo.asBigDecimal("ACUMPESO9");
        this.acumQtd1 = vo.asBigDecimal("ACUMQTD1");
        this.acumQtd10 = vo.asBigDecimal("ACUMQTD10");
        this.acumQtd11 = vo.asBigDecimal("ACUMQTD11");
        this.acumQtd12 = vo.asBigDecimal("ACUMQTD12");
        this.acumQtd2 = vo.asBigDecimal("ACUMQTD2");
        this.acumQtd3 = vo.asBigDecimal("ACUMQTD3");
        this.acumQtd4 = vo.asBigDecimal("ACUMQTD4");
        this.acumQtd5 = vo.asBigDecimal("ACUMQTD5");
        this.acumQtd6 = vo.asBigDecimal("ACUMQTD6");
        this.acumQtd7 = vo.asBigDecimal("ACUMQTD7");
        this.acumQtd8 = vo.asBigDecimal("ACUMQTD8");
        this.acumQtd9 = vo.asBigDecimal("ACUMQTD9");
        this.acumTot1 = vo.asBigDecimal("ACUMTOT1");
        this.acumTot10 = vo.asBigDecimal("ACUMTOT10");
        this.acumTot11 = vo.asBigDecimal("ACUMTOT11");
        this.acumTot12 = vo.asBigDecimal("ACUMTOT12");
        this.acumTot2 = vo.asBigDecimal("ACUMTOT2");
        this.acumTot3 = vo.asBigDecimal("ACUMTOT3");
        this.acumTot4 = vo.asBigDecimal("ACUMTOT4");
        this.acumTot5 = vo.asBigDecimal("ACUMTOT5");
        this.acumTot6 = vo.asBigDecimal("ACUMTOT6");
        this.acumTot7 = vo.asBigDecimal("ACUMTOT7");
        this.acumTot8 = vo.asBigDecimal("ACUMTOT8");
        this.acumTot9 = vo.asBigDecimal("ACUMTOT9");
        this.aliqCred = vo.asBigDecimal("ALIQCRED");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.multipCpa = vo.asBigDecimal("MULTIPCPA");
        this.sugCompraGirAjustado = vo.asBigDecimal("SUGCOMPRAGIRAJUSTADO");
        this.sugCompraGirAjustadoMultCpa = vo.asBigDecimal("SUGCOMPRAGIRAJUSTADOMULTCPA");
        this.temSugGiroAjustado = vo.asString("TEMSUGGIROAJUSTADO");
        this.unPadrao = vo.asString("UNPADRAO");
        this.sugCompraGirMultCpa = vo.asBigDecimal("SUGCOMPRAGIRMULTCPA");
        this.acumMarg4 = vo.asBigDecimal("ACUMMARG4");
        this.acumMarg5 = vo.asBigDecimal("ACUMMARG5");
        this.acumMarg6 = vo.asBigDecimal("ACUMMARG6");
        this.acumMarg7 = vo.asBigDecimal("ACUMMARG7");
        this.acumMarg8 = vo.asBigDecimal("ACUMMARG8");
        this.acumMarg11 = vo.asBigDecimal("ACUMMARG11");
        this.acumMarg12 = vo.asBigDecimal("ACUMMARG12");
        this.acumPeso11 = vo.asBigDecimal("ACUMPESO11");
        this.acumPeso12 = vo.asBigDecimal("ACUMPESO12");
        this.acumPeso2 = vo.asBigDecimal("ACUMPESO2");
        this.acumPeso3 = vo.asBigDecimal("ACUMPESO3");
        this.sugCompraMultCpa = vo.asBigDecimal("SUGCOMPRAMULTCPA");
        this.sugCpaGirAlterado = vo.asString("SUGCPAGIRALTERADO");
        this.percDescFornecedor = vo.asBigDecimal("PERCDESCFORNECEDOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.wmsBloqueado = vo.asBigDecimal("WMSBLOQUEADO");
        this.acumMarg2 = vo.asBigDecimal("ACUMMARG2");
        this.acumMarg3 = vo.asBigDecimal("ACUMMARG3");
        this.durEstPosCpaGir = vo.asBigDecimal("DURESTPOSCPAGIR");
        this.durEstSeg = vo.asBigDecimal("DURESTSEG");
        this.diasUteis = vo.asBigDecimal("DIASUTEIS");
        this.prevEntrega = vo.asTimestamp("PREVENTREGA");
        this.giroDiario = vo.asBigDecimal("GIRODIARIO");
        this.pontoPed = vo.asTimestamp("PONTOPED");
        this.vlrUltCompra = vo.asBigDecimal("VLRULTCOMPRA");
        this.possuiFam = vo.asString("POSSUIFAM");
        this.diasRuptura = vo.asBigDecimal("DIASRUPTURA");
        this.diasRupturaEst1 = vo.asBigDecimal("DIASRUPTURAEST1");
        this.diasRupturaEst10 = vo.asBigDecimal("DIASRUPTURAEST10");
        this.diasRupturaEst11 = vo.asBigDecimal("DIASRUPTURAEST11");
        this.diasRupturaEst12 = vo.asBigDecimal("DIASRUPTURAEST12");
        this.diasRupturaEst2 = vo.asBigDecimal("DIASRUPTURAEST2");
        this.diasRupturaEst3 = vo.asBigDecimal("DIASRUPTURAEST3");
        this.diasRupturaEst4 = vo.asBigDecimal("DIASRUPTURAEST4");
        this.diasRupturaEst5 = vo.asBigDecimal("DIASRUPTURAEST5");
        this.diasRupturaEst6 = vo.asBigDecimal("DIASRUPTURAEST6");
        this.diasRupturaEst7 = vo.asBigDecimal("DIASRUPTURAEST7");
        this.diasRupturaEst8 = vo.asBigDecimal("DIASRUPTURAEST8");
        this.diasRupturaEst9 = vo.asBigDecimal("DIASRUPTURAEST9");
        this.numMps = vo.asBigDecimal("NUMMPS");
        return this;
   }
}
