package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GiroProduto extends AbstractSankhyaEntity<GiroProduto> {
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
   private BigDecimal accumMarg9;
   private BigDecimal accumPeso1;
   private BigDecimal accumPeso10;
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
   private String termoLabil;
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
   private BigDecimal pedCpApend;
   private BigDecimal pedVdApend;
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
   private BigDecimal accumMarg_2;
   private BigDecimal accumMarg_3;
   private BigDecimal durEstPosCpAgir;
   private BigDecimal durEstSeg;
   private BigDecimal diasUteis;
   private Timestamp prevEntrega;
   private BigDecimal giroDiario;
   private Timestamp pontoPed;
   private BigDecimal vlrUltCompra;
   private String possuiFam;
   private BigDecimal diasRuptura;
   private BigDecimal diasRupturaEst_1;
   private BigDecimal diasRupturaEst_10;
   private BigDecimal diasRupturaEst_11;
   private BigDecimal diasRupturaEst_12;
   private BigDecimal diasRupturaEst_2;
   private BigDecimal diasRupturaEst_3;
   private BigDecimal diasRupturaEst_4;
   private BigDecimal diasRupturaEst_5;
   private BigDecimal diasRupturaEst_6;
   private BigDecimal diasRupturaEst_7;
   private BigDecimal diasRupturaEst_8;
   private BigDecimal diasRupturaEst_9;
   private BigDecimal numMps;

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
        this.codParcForn = codParcForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodRel() {
        return codRel;
   }

   public void setCodRel(BigDecimal codRel) {
        markAsChanged("CODREL", codRel);
        this.codRel = codRel;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
        this.codVolCompra = codVolCompra;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public String getControlado() {
        return controlado;
   }

   public void setControlado(String controlado) {
        markAsChanged("CONTROLADO", controlado);
        this.controlado = controlado;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public String getCurvaMarg1() {
        return curvaMarg1;
   }

   public void setCurvaMarg1(String curvaMarg1) {
        markAsChanged("CURVAMARG_1", curvaMarg1);
        this.curvaMarg1 = curvaMarg1;
   }

   public String getCurvaMarg10() {
        return curvaMarg10;
   }

   public void setCurvaMarg10(String curvaMarg10) {
        markAsChanged("CURVAMARG_10", curvaMarg10);
        this.curvaMarg10 = curvaMarg10;
   }

   public String getCurvaMarg11() {
        return curvaMarg11;
   }

   public void setCurvaMarg11(String curvaMarg11) {
        markAsChanged("CURVAMARG_11", curvaMarg11);
        this.curvaMarg11 = curvaMarg11;
   }

   public String getCurvaMarg12() {
        return curvaMarg12;
   }

   public void setCurvaMarg12(String curvaMarg12) {
        markAsChanged("CURVAMARG_12", curvaMarg12);
        this.curvaMarg12 = curvaMarg12;
   }

   public String getCurvaMarg2() {
        return curvaMarg2;
   }

   public void setCurvaMarg2(String curvaMarg2) {
        markAsChanged("CURVAMARG_2", curvaMarg2);
        this.curvaMarg2 = curvaMarg2;
   }

   public String getCurvaMarg3() {
        return curvaMarg3;
   }

   public void setCurvaMarg3(String curvaMarg3) {
        markAsChanged("CURVAMARG_3", curvaMarg3);
        this.curvaMarg3 = curvaMarg3;
   }

   public String getCurvaMarg4() {
        return curvaMarg4;
   }

   public void setCurvaMarg4(String curvaMarg4) {
        markAsChanged("CURVAMARG_4", curvaMarg4);
        this.curvaMarg4 = curvaMarg4;
   }

   public String getCurvaMarg5() {
        return curvaMarg5;
   }

   public void setCurvaMarg5(String curvaMarg5) {
        markAsChanged("CURVAMARG_5", curvaMarg5);
        this.curvaMarg5 = curvaMarg5;
   }

   public String getCurvaMarg6() {
        return curvaMarg6;
   }

   public void setCurvaMarg6(String curvaMarg6) {
        markAsChanged("CURVAMARG_6", curvaMarg6);
        this.curvaMarg6 = curvaMarg6;
   }

   public String getCurvaMarg7() {
        return curvaMarg7;
   }

   public void setCurvaMarg7(String curvaMarg7) {
        markAsChanged("CURVAMARG_7", curvaMarg7);
        this.curvaMarg7 = curvaMarg7;
   }

   public String getCurvaMarg8() {
        return curvaMarg8;
   }

   public void setCurvaMarg8(String curvaMarg8) {
        markAsChanged("CURVAMARG_8", curvaMarg8);
        this.curvaMarg8 = curvaMarg8;
   }

   public String getCurvaMarg9() {
        return curvaMarg9;
   }

   public void setCurvaMarg9(String curvaMarg9) {
        markAsChanged("CURVAMARG_9", curvaMarg9);
        this.curvaMarg9 = curvaMarg9;
   }

   public String getCurvaPeso1() {
        return curvaPeso1;
   }

   public void setCurvaPeso1(String curvaPeso1) {
        markAsChanged("CURVAPESO_1", curvaPeso1);
        this.curvaPeso1 = curvaPeso1;
   }

   public String getCurvaPeso10() {
        return curvaPeso10;
   }

   public void setCurvaPeso10(String curvaPeso10) {
        markAsChanged("CURVAPESO_10", curvaPeso10);
        this.curvaPeso10 = curvaPeso10;
   }

   public String getCurvaPeso11() {
        return curvaPeso11;
   }

   public void setCurvaPeso11(String curvaPeso11) {
        markAsChanged("CURVAPESO_11", curvaPeso11);
        this.curvaPeso11 = curvaPeso11;
   }

   public String getCurvaPeso12() {
        return curvaPeso12;
   }

   public void setCurvaPeso12(String curvaPeso12) {
        markAsChanged("CURVAPESO_12", curvaPeso12);
        this.curvaPeso12 = curvaPeso12;
   }

   public String getCurvaPeso2() {
        return curvaPeso2;
   }

   public void setCurvaPeso2(String curvaPeso2) {
        markAsChanged("CURVAPESO_2", curvaPeso2);
        this.curvaPeso2 = curvaPeso2;
   }

   public String getCurvaPeso3() {
        return curvaPeso3;
   }

   public void setCurvaPeso3(String curvaPeso3) {
        markAsChanged("CURVAPESO_3", curvaPeso3);
        this.curvaPeso3 = curvaPeso3;
   }

   public String getCurvaPeso4() {
        return curvaPeso4;
   }

   public void setCurvaPeso4(String curvaPeso4) {
        markAsChanged("CURVAPESO_4", curvaPeso4);
        this.curvaPeso4 = curvaPeso4;
   }

   public String getCurvaPeso5() {
        return curvaPeso5;
   }

   public void setCurvaPeso5(String curvaPeso5) {
        markAsChanged("CURVAPESO_5", curvaPeso5);
        this.curvaPeso5 = curvaPeso5;
   }

   public String getCurvaPeso6() {
        return curvaPeso6;
   }

   public void setCurvaPeso6(String curvaPeso6) {
        markAsChanged("CURVAPESO_6", curvaPeso6);
        this.curvaPeso6 = curvaPeso6;
   }

   public String getCurvaPeso7() {
        return curvaPeso7;
   }

   public void setCurvaPeso7(String curvaPeso7) {
        markAsChanged("CURVAPESO_7", curvaPeso7);
        this.curvaPeso7 = curvaPeso7;
   }

   public String getCurvaPeso8() {
        return curvaPeso8;
   }

   public void setCurvaPeso8(String curvaPeso8) {
        markAsChanged("CURVAPESO_8", curvaPeso8);
        this.curvaPeso8 = curvaPeso8;
   }

   public String getCurvaPeso9() {
        return curvaPeso9;
   }

   public void setCurvaPeso9(String curvaPeso9) {
        markAsChanged("CURVAPESO_9", curvaPeso9);
        this.curvaPeso9 = curvaPeso9;
   }

   public String getCurvaQtd1() {
        return curvaQtd1;
   }

   public void setCurvaQtd1(String curvaQtd1) {
        markAsChanged("CURVAQTD_1", curvaQtd1);
        this.curvaQtd1 = curvaQtd1;
   }

   public String getCurvaQtd10() {
        return curvaQtd10;
   }

   public void setCurvaQtd10(String curvaQtd10) {
        markAsChanged("CURVAQTD_10", curvaQtd10);
        this.curvaQtd10 = curvaQtd10;
   }

   public String getCurvaQtd11() {
        return curvaQtd11;
   }

   public void setCurvaQtd11(String curvaQtd11) {
        markAsChanged("CURVAQTD_11", curvaQtd11);
        this.curvaQtd11 = curvaQtd11;
   }

   public String getCurvaQtd12() {
        return curvaQtd12;
   }

   public void setCurvaQtd12(String curvaQtd12) {
        markAsChanged("CURVAQTD_12", curvaQtd12);
        this.curvaQtd12 = curvaQtd12;
   }

   public String getCurvaQtd2() {
        return curvaQtd2;
   }

   public void setCurvaQtd2(String curvaQtd2) {
        markAsChanged("CURVAQTD_2", curvaQtd2);
        this.curvaQtd2 = curvaQtd2;
   }

   public String getCurvaQtd3() {
        return curvaQtd3;
   }

   public void setCurvaQtd3(String curvaQtd3) {
        markAsChanged("CURVAQTD_3", curvaQtd3);
        this.curvaQtd3 = curvaQtd3;
   }

   public String getCurvaQtd4() {
        return curvaQtd4;
   }

   public void setCurvaQtd4(String curvaQtd4) {
        markAsChanged("CURVAQTD_4", curvaQtd4);
        this.curvaQtd4 = curvaQtd4;
   }

   public String getCurvaQtd5() {
        return curvaQtd5;
   }

   public void setCurvaQtd5(String curvaQtd5) {
        markAsChanged("CURVAQTD_5", curvaQtd5);
        this.curvaQtd5 = curvaQtd5;
   }

   public String getCurvaQtd6() {
        return curvaQtd6;
   }

   public void setCurvaQtd6(String curvaQtd6) {
        markAsChanged("CURVAQTD_6", curvaQtd6);
        this.curvaQtd6 = curvaQtd6;
   }

   public String getCurvaQtd7() {
        return curvaQtd7;
   }

   public void setCurvaQtd7(String curvaQtd7) {
        markAsChanged("CURVAQTD_7", curvaQtd7);
        this.curvaQtd7 = curvaQtd7;
   }

   public String getCurvaQtd8() {
        return curvaQtd8;
   }

   public void setCurvaQtd8(String curvaQtd8) {
        markAsChanged("CURVAQTD_8", curvaQtd8);
        this.curvaQtd8 = curvaQtd8;
   }

   public String getCurvaQtd9() {
        return curvaQtd9;
   }

   public void setCurvaQtd9(String curvaQtd9) {
        markAsChanged("CURVAQTD_9", curvaQtd9);
        this.curvaQtd9 = curvaQtd9;
   }

   public String getCurvaTot1() {
        return curvaTot1;
   }

   public void setCurvaTot1(String curvaTot1) {
        markAsChanged("CURVATOT_1", curvaTot1);
        this.curvaTot1 = curvaTot1;
   }

   public String getCurvaTot10() {
        return curvaTot10;
   }

   public void setCurvaTot10(String curvaTot10) {
        markAsChanged("CURVATOT_10", curvaTot10);
        this.curvaTot10 = curvaTot10;
   }

   public String getCurvaTot11() {
        return curvaTot11;
   }

   public void setCurvaTot11(String curvaTot11) {
        markAsChanged("CURVATOT_11", curvaTot11);
        this.curvaTot11 = curvaTot11;
   }

   public String getCurvaTot12() {
        return curvaTot12;
   }

   public void setCurvaTot12(String curvaTot12) {
        markAsChanged("CURVATOT_12", curvaTot12);
        this.curvaTot12 = curvaTot12;
   }

   public String getCurvaTot2() {
        return curvaTot2;
   }

   public void setCurvaTot2(String curvaTot2) {
        markAsChanged("CURVATOT_2", curvaTot2);
        this.curvaTot2 = curvaTot2;
   }

   public String getCurvaTot3() {
        return curvaTot3;
   }

   public void setCurvaTot3(String curvaTot3) {
        markAsChanged("CURVATOT_3", curvaTot3);
        this.curvaTot3 = curvaTot3;
   }

   public String getCurvaTot4() {
        return curvaTot4;
   }

   public void setCurvaTot4(String curvaTot4) {
        markAsChanged("CURVATOT_4", curvaTot4);
        this.curvaTot4 = curvaTot4;
   }

   public Timestamp getUltCompra() {
        return ultCompra;
   }

   public void setUltCompra(Timestamp ultCompra) {
        markAsChanged("ULTCOMPRA", ultCompra);
        this.ultCompra = ultCompra;
   }

   public Timestamp getUltVenda() {
        return ultVenda;
   }

   public void setUltVenda(Timestamp ultVenda) {
        markAsChanged("ULTVENDA", ultVenda);
        this.ultVenda = ultVenda;
   }

   public BigDecimal getVlrCredIcms() {
        return vlrCredIcms;
   }

   public void setVlrCredIcms(BigDecimal vlrCredIcms) {
        markAsChanged("VLRCREDICMS", vlrCredIcms);
        this.vlrCredIcms = vlrCredIcms;
   }

   public BigDecimal getVlrGastoVar1() {
        return vlrGastoVar1;
   }

   public void setVlrGastoVar1(BigDecimal vlrGastoVar1) {
        markAsChanged("VLRGASTOVAR_1", vlrGastoVar1);
        this.vlrGastoVar1 = vlrGastoVar1;
   }

   public BigDecimal getVlrGastoVar6() {
        return vlrGastoVar6;
   }

   public void setVlrGastoVar6(BigDecimal vlrGastoVar6) {
        markAsChanged("VLRGASTOVAR_6", vlrGastoVar6);
        this.vlrGastoVar6 = vlrGastoVar6;
   }

   public BigDecimal getVlrGastoVar7() {
        return vlrGastoVar7;
   }

   public void setVlrGastoVar7(BigDecimal vlrGastoVar7) {
        markAsChanged("VLRGASTOVAR_7", vlrGastoVar7);
        this.vlrGastoVar7 = vlrGastoVar7;
   }

   public BigDecimal getVlrGastoVar8() {
        return vlrGastoVar8;
   }

   public void setVlrGastoVar8(BigDecimal vlrGastoVar8) {
        markAsChanged("VLRGASTOVAR_8", vlrGastoVar8);
        this.vlrGastoVar8 = vlrGastoVar8;
   }

   public BigDecimal getVlrGastoVar9() {
        return vlrGastoVar9;
   }

   public void setVlrGastoVar9(BigDecimal vlrGastoVar9) {
        markAsChanged("VLRGASTOVAR_9", vlrGastoVar9);
        this.vlrGastoVar9 = vlrGastoVar9;
   }

   public BigDecimal getVlrMargCont1() {
        return vlrMargCont1;
   }

   public void setVlrMargCont1(BigDecimal vlrMargCont1) {
        markAsChanged("VLRMARGCONT_1", vlrMargCont1);
        this.vlrMargCont1 = vlrMargCont1;
   }

   public BigDecimal getVlrMargCont10() {
        return vlrMargCont10;
   }

   public void setVlrMargCont10(BigDecimal vlrMargCont10) {
        markAsChanged("VLRMARGCONT_10", vlrMargCont10);
        this.vlrMargCont10 = vlrMargCont10;
   }

   public BigDecimal getVlrMargCont11() {
        return vlrMargCont11;
   }

   public void setVlrMargCont11(BigDecimal vlrMargCont11) {
        markAsChanged("VLRMARGCONT_11", vlrMargCont11);
        this.vlrMargCont11 = vlrMargCont11;
   }

   public BigDecimal getVlrMargCont12() {
        return vlrMargCont12;
   }

   public void setVlrMargCont12(BigDecimal vlrMargCont12) {
        markAsChanged("VLRMARGCONT_12", vlrMargCont12);
        this.vlrMargCont12 = vlrMargCont12;
   }

   public BigDecimal getVlrMargCont2() {
        return vlrMargCont2;
   }

   public void setVlrMargCont2(BigDecimal vlrMargCont2) {
        markAsChanged("VLRMARGCONT_2", vlrMargCont2);
        this.vlrMargCont2 = vlrMargCont2;
   }

   public BigDecimal getVlrMargCont3() {
        return vlrMargCont3;
   }

   public void setVlrMargCont3(BigDecimal vlrMargCont3) {
        markAsChanged("VLRMARGCONT_3", vlrMargCont3);
        this.vlrMargCont3 = vlrMargCont3;
   }

   public BigDecimal getVlrMargCont4() {
        return vlrMargCont4;
   }

   public void setVlrMargCont4(BigDecimal vlrMargCont4) {
        markAsChanged("VLRMARGCONT_4", vlrMargCont4);
        this.vlrMargCont4 = vlrMargCont4;
   }

   public BigDecimal getVlrMargCont5() {
        return vlrMargCont5;
   }

   public void setVlrMargCont5(BigDecimal vlrMargCont5) {
        markAsChanged("VLRMARGCONT_5", vlrMargCont5);
        this.vlrMargCont5 = vlrMargCont5;
   }

   public BigDecimal getVlrMargCont6() {
        return vlrMargCont6;
   }

   public void setVlrMargCont6(BigDecimal vlrMargCont6) {
        markAsChanged("VLRMARGCONT_6", vlrMargCont6);
        this.vlrMargCont6 = vlrMargCont6;
   }

   public BigDecimal getVlrMargCont7() {
        return vlrMargCont7;
   }

   public void setVlrMargCont7(BigDecimal vlrMargCont7) {
        markAsChanged("VLRMARGCONT_7", vlrMargCont7);
        this.vlrMargCont7 = vlrMargCont7;
   }

   public BigDecimal getVlrMargCont8() {
        return vlrMargCont8;
   }

   public void setVlrMargCont8(BigDecimal vlrMargCont8) {
        markAsChanged("VLRMARGCONT_8", vlrMargCont8);
        this.vlrMargCont8 = vlrMargCont8;
   }

   public BigDecimal getVlrMargCont9() {
        return vlrMargCont9;
   }

   public void setVlrMargCont9(BigDecimal vlrMargCont9) {
        markAsChanged("VLRMARGCONT_9", vlrMargCont9);
        this.vlrMargCont9 = vlrMargCont9;
   }

   public BigDecimal getVlrTabPreco() {
        return vlrTabPreco;
   }

   public void setVlrTabPreco(BigDecimal vlrTabPreco) {
        markAsChanged("VLRTABPRECO", vlrTabPreco);
        this.vlrTabPreco = vlrTabPreco;
   }

   public BigDecimal getVlrTot1() {
        return vlrTot1;
   }

   public void setVlrTot1(BigDecimal vlrTot1) {
        markAsChanged("VLRTOT_1", vlrTot1);
        this.vlrTot1 = vlrTot1;
   }

   public BigDecimal getVlrTot10() {
        return vlrTot10;
   }

   public void setVlrTot10(BigDecimal vlrTot10) {
        markAsChanged("VLRTOT_10", vlrTot10);
        this.vlrTot10 = vlrTot10;
   }

   public BigDecimal getVlrTot11() {
        return vlrTot11;
   }

   public void setVlrTot11(BigDecimal vlrTot11) {
        markAsChanged("VLRTOT_11", vlrTot11);
        this.vlrTot11 = vlrTot11;
   }

   public BigDecimal getVlrTot12() {
        return vlrTot12;
   }

   public void setVlrTot12(BigDecimal vlrTot12) {
        markAsChanged("VLRTOT_12", vlrTot12);
        this.vlrTot12 = vlrTot12;
   }

   public BigDecimal getVlrTot2() {
        return vlrTot2;
   }

   public void setVlrTot2(BigDecimal vlrTot2) {
        markAsChanged("VLRTOT_2", vlrTot2);
        this.vlrTot2 = vlrTot2;
   }

   public BigDecimal getVlrTot3() {
        return vlrTot3;
   }

   public void setVlrTot3(BigDecimal vlrTot3) {
        markAsChanged("VLRTOT_3", vlrTot3);
        this.vlrTot3 = vlrTot3;
   }

   public BigDecimal getVlrTot4() {
        return vlrTot4;
   }

   public void setVlrTot4(BigDecimal vlrTot4) {
        markAsChanged("VLRTOT_4", vlrTot4);
        this.vlrTot4 = vlrTot4;
   }

   public BigDecimal getVlrTot5() {
        return vlrTot5;
   }

   public void setVlrTot5(BigDecimal vlrTot5) {
        markAsChanged("VLRTOT_5", vlrTot5);
        this.vlrTot5 = vlrTot5;
   }

   public BigDecimal getVlrTot6() {
        return vlrTot6;
   }

   public void setVlrTot6(BigDecimal vlrTot6) {
        markAsChanged("VLRTOT_6", vlrTot6);
        this.vlrTot6 = vlrTot6;
   }

   public BigDecimal getVlrTot7() {
        return vlrTot7;
   }

   public void setVlrTot7(BigDecimal vlrTot7) {
        markAsChanged("VLRTOT_7", vlrTot7);
        this.vlrTot7 = vlrTot7;
   }

   public BigDecimal getVlrTot8() {
        return vlrTot8;
   }

   public void setVlrTot8(BigDecimal vlrTot8) {
        markAsChanged("VLRTOT_8", vlrTot8);
        this.vlrTot8 = vlrTot8;
   }

   public BigDecimal getVlrTot9() {
        return vlrTot9;
   }

   public void setVlrTot9(BigDecimal vlrTot9) {
        markAsChanged("VLRTOT_9", vlrTot9);
        this.vlrTot9 = vlrTot9;
   }

   public BigDecimal getVlrUnit1() {
        return vlrUnit1;
   }

   public void setVlrUnit1(BigDecimal vlrUnit1) {
        markAsChanged("VLRUNIT_1", vlrUnit1);
        this.vlrUnit1 = vlrUnit1;
   }

   public BigDecimal getVlrUnit10() {
        return vlrUnit10;
   }

   public void setVlrUnit10(BigDecimal vlrUnit10) {
        markAsChanged("VLRUNIT_10", vlrUnit10);
        this.vlrUnit10 = vlrUnit10;
   }

   public BigDecimal getVlrUnit11() {
        return vlrUnit11;
   }

   public void setVlrUnit11(BigDecimal vlrUnit11) {
        markAsChanged("VLRUNIT_11", vlrUnit11);
        this.vlrUnit11 = vlrUnit11;
   }

   public BigDecimal getVlrUnit12() {
        return vlrUnit12;
   }

   public void setVlrUnit12(BigDecimal vlrUnit12) {
        markAsChanged("VLRUNIT_12", vlrUnit12);
        this.vlrUnit12 = vlrUnit12;
   }

   public BigDecimal getVlrUnit2() {
        return vlrUnit2;
   }

   public void setVlrUnit2(BigDecimal vlrUnit2) {
        markAsChanged("VLRUNIT_2", vlrUnit2);
        this.vlrUnit2 = vlrUnit2;
   }

   public BigDecimal getVlrUnit3() {
        return vlrUnit3;
   }

   public void setVlrUnit3(BigDecimal vlrUnit3) {
        markAsChanged("VLRUNIT_3", vlrUnit3);
        this.vlrUnit3 = vlrUnit3;
   }

   public BigDecimal getVlrUnit4() {
        return vlrUnit4;
   }

   public void setVlrUnit4(BigDecimal vlrUnit4) {
        markAsChanged("VLRUNIT_4", vlrUnit4);
        this.vlrUnit4 = vlrUnit4;
   }

   public BigDecimal getVlrUnit5() {
        return vlrUnit5;
   }

   public void setVlrUnit5(BigDecimal vlrUnit5) {
        markAsChanged("VLRUNIT_5", vlrUnit5);
        this.vlrUnit5 = vlrUnit5;
   }

   public BigDecimal getVlrUnit6() {
        return vlrUnit6;
   }

   public void setVlrUnit6(BigDecimal vlrUnit6) {
        markAsChanged("VLRUNIT_6", vlrUnit6);
        this.vlrUnit6 = vlrUnit6;
   }

   public BigDecimal getAcumPeso4() {
        return acumPeso4;
   }

   public void setAcumPeso4(BigDecimal acumPeso4) {
        markAsChanged("ACUMPESO_4", acumPeso4);
        this.acumPeso4 = acumPeso4;
   }

   public BigDecimal getAcumPeso5() {
        return acumPeso5;
   }

   public void setAcumPeso5(BigDecimal acumPeso5) {
        markAsChanged("ACUMPESO_5", acumPeso5);
        this.acumPeso5 = acumPeso5;
   }

   public BigDecimal getAcumPeso6() {
        return acumPeso6;
   }

   public void setAcumPeso6(BigDecimal acumPeso6) {
        markAsChanged("ACUMPESO_6", acumPeso6);
        this.acumPeso6 = acumPeso6;
   }

   public BigDecimal getPopularidade7() {
        return popularidade7;
   }

   public void setPopularidade7(BigDecimal popularidade7) {
        markAsChanged("POPULARIDADE_7", popularidade7);
        this.popularidade7 = popularidade7;
   }

   public BigDecimal getPopularidade8() {
        return popularidade8;
   }

   public void setPopularidade8(BigDecimal popularidade8) {
        markAsChanged("POPULARIDADE_8", popularidade8);
        this.popularidade8 = popularidade8;
   }

   public BigDecimal getPopularidade9() {
        return popularidade9;
   }

   public void setPopularidade9(BigDecimal popularidade9) {
        markAsChanged("POPULARIDADE_9", popularidade9);
        this.popularidade9 = popularidade9;
   }

   public BigDecimal getAccumMarg9() {
        return accumMarg9;
   }

   public void setAccumMarg9(BigDecimal accumMarg9) {
        markAsChanged("ACUMMARG_9", accumMarg9);
        this.accumMarg9 = accumMarg9;
   }

   public BigDecimal getAccumPeso1() {
        return accumPeso1;
   }

   public void setAccumPeso1(BigDecimal accumPeso1) {
        markAsChanged("ACUMPESO_1", accumPeso1);
        this.accumPeso1 = accumPeso1;
   }

   public BigDecimal getAccumPeso10() {
        return accumPeso10;
   }

   public void setAccumPeso10(BigDecimal accumPeso10) {
        markAsChanged("ACUMPESO_10", accumPeso10);
        this.accumPeso10 = accumPeso10;
   }

   public BigDecimal getEstMax() {
        return estMax;
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
        this.estMax = estMax;
   }

   public BigDecimal getCustoVenda12() {
        return custoVenda12;
   }

   public void setCustoVenda12(BigDecimal custoVenda12) {
        markAsChanged("CUSTOVENDA_12", custoVenda12);
        this.custoVenda12 = custoVenda12;
   }

   public BigDecimal getCustoVenda2() {
        return custoVenda2;
   }

   public void setCustoVenda2(BigDecimal custoVenda2) {
        markAsChanged("CUSTOVENDA_2", custoVenda2);
        this.custoVenda2 = custoVenda2;
   }

   public BigDecimal getCustoVenda3() {
        return custoVenda3;
   }

   public void setCustoVenda3(BigDecimal custoVenda3) {
        markAsChanged("CUSTOVENDA_3", custoVenda3);
        this.custoVenda3 = custoVenda3;
   }

   public BigDecimal getCustoVenda4() {
        return custoVenda4;
   }

   public void setCustoVenda4(BigDecimal custoVenda4) {
        markAsChanged("CUSTOVENDA_4", custoVenda4);
        this.custoVenda4 = custoVenda4;
   }

   public BigDecimal getCustoVenda5() {
        return custoVenda5;
   }

   public void setCustoVenda5(BigDecimal custoVenda5) {
        markAsChanged("CUSTOVENDA_5", custoVenda5);
        this.custoVenda5 = custoVenda5;
   }

   public BigDecimal getVlrGastoVar10() {
        return vlrGastoVar10;
   }

   public void setVlrGastoVar10(BigDecimal vlrGastoVar10) {
        markAsChanged("VLRGASTOVAR_10", vlrGastoVar10);
        this.vlrGastoVar10 = vlrGastoVar10;
   }

   public BigDecimal getVlrGastoVar11() {
        return vlrGastoVar11;
   }

   public void setVlrGastoVar11(BigDecimal vlrGastoVar11) {
        markAsChanged("VLRGASTOVAR_11", vlrGastoVar11);
        this.vlrGastoVar11 = vlrGastoVar11;
   }

   public BigDecimal getVlrGastoVar12() {
        return vlrGastoVar12;
   }

   public void setVlrGastoVar12(BigDecimal vlrGastoVar12) {
        markAsChanged("VLRGASTOVAR_12", vlrGastoVar12);
        this.vlrGastoVar12 = vlrGastoVar12;
   }

   public BigDecimal getVlrGastoVar2() {
        return vlrGastoVar2;
   }

   public void setVlrGastoVar2(BigDecimal vlrGastoVar2) {
        markAsChanged("VLRGASTOVAR_2", vlrGastoVar2);
        this.vlrGastoVar2 = vlrGastoVar2;
   }

   public BigDecimal getSugCompra() {
        return sugCompra;
   }

   public void setSugCompra(BigDecimal sugCompra) {
        markAsChanged("SUGCOMPRA", sugCompra);
        this.sugCompra = sugCompra;
   }

   public BigDecimal getSugCompraGir() {
        return sugCompraGir;
   }

   public void setSugCompraGir(BigDecimal sugCompraGir) {
        markAsChanged("SUGCOMPRAGIR", sugCompraGir);
        this.sugCompraGir = sugCompraGir;
   }

   public String getTermoLabil() {
        return termoLabil;
   }

   public void setTermoLabil(String termoLabil) {
        markAsChanged("TERMOLABIL", termoLabil);
        this.termoLabil = termoLabil;
   }

   public BigDecimal getCustoVndTotal8() {
        return custoVndTotal8;
   }

   public void setCustoVndTotal8(BigDecimal custoVndTotal8) {
        markAsChanged("CUSTOVNDTOTAL_8", custoVndTotal8);
        this.custoVndTotal8 = custoVndTotal8;
   }

   public BigDecimal getCustoVndTotal9() {
        return custoVndTotal9;
   }

   public void setCustoVndTotal9(BigDecimal custoVndTotal9) {
        markAsChanged("CUSTOVNDTOTAL_9", custoVndTotal9);
        this.custoVndTotal9 = custoVndTotal9;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
        this.descMax = descMax;
   }

   public BigDecimal getDiasSemVenda() {
        return diasSemVenda;
   }

   public void setDiasSemVenda(BigDecimal diasSemVenda) {
        markAsChanged("DIASSEMVENDA", diasSemVenda);
        this.diasSemVenda = diasSemVenda;
   }

   public BigDecimal getDurEst() {
        return durEst;
   }

   public void setDurEst(BigDecimal durEst) {
        markAsChanged("DUREST", durEst);
        this.durEst = durEst;
   }

   public BigDecimal getDurEstPosCpa() {
        return durEstPosCpa;
   }

   public void setDurEstPosCpa(BigDecimal durEstPosCpa) {
        markAsChanged("DURESTPOSCPA", durEstPosCpa);
        this.durEstPosCpa = durEstPosCpa;
   }

   public BigDecimal getEstCustGer() {
        return estCustGer;
   }

   public void setEstCustGer(BigDecimal estCustGer) {
        markAsChanged("ESTCUSTGER", estCustGer);
        this.estCustGer = estCustGer;
   }

   public String getEstMenMedVend() {
        return estMenMedVend;
   }

   public void setEstMenMedVend(String estMenMedVend) {
        markAsChanged("ESTMENMEDVEND", estMenMedVend);
        this.estMenMedVend = estMenMedVend;
   }

   public BigDecimal getEstMin() {
        return estMin;
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
        this.estMin = estMin;
   }

   public BigDecimal getEstMinGir() {
        return estMinGir;
   }

   public void setEstMinGir(BigDecimal estMinGir) {
        markAsChanged("ESTMINGIR", estMinGir);
        this.estMinGir = estMinGir;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public BigDecimal getFrequencia() {
        return frequencia;
   }

   public void setFrequencia(BigDecimal frequencia) {
        markAsChanged("FREQUENCIA", frequencia);
        this.frequencia = frequencia;
   }

   public String getIdenCorrelato() {
        return idenCorrelato;
   }

   public void setIdenCorrelato(String idenCorrelato) {
        markAsChanged("IDENCORRELATO", idenCorrelato);
        this.idenCorrelato = idenCorrelato;
   }

   public String getIdenCosme() {
        return idenCosme;
   }

   public void setIdenCosme(String idenCosme) {
        markAsChanged("IDENCOSME", idenCosme);
        this.idenCosme = idenCosme;
   }

   public String getIdenOtc() {
        return idenOtc;
   }

   public void setIdenOtc(String idenOtc) {
        markAsChanged("IDENOTC", idenOtc);
        this.idenOtc = idenOtc;
   }

   public String getIdenPortaria() {
        return idenPortaria;
   }

   public void setIdenPortaria(String idenPortaria) {
        markAsChanged("IDENPORTARIA", idenPortaria);
        this.idenPortaria = idenPortaria;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
        this.leadTime = leadTime;
   }

   public String getListaLpm() {
        return listaLpm;
   }

   public void setListaLpm(String listaLpm) {
        markAsChanged("LISTALPM", listaLpm);
        this.listaLpm = listaLpm;
   }

   public BigDecimal getLucro1() {
        return lucro1;
   }

   public void setLucro1(BigDecimal lucro1) {
        markAsChanged("LUCRO_1", lucro1);
        this.lucro1 = lucro1;
   }

   public BigDecimal getLucro10() {
        return lucro10;
   }

   public void setLucro10(BigDecimal lucro10) {
        markAsChanged("LUCRO_10", lucro10);
        this.lucro10 = lucro10;
   }

   public BigDecimal getLucro11() {
        return lucro11;
   }

   public void setLucro11(BigDecimal lucro11) {
        markAsChanged("LUCRO_11", lucro11);
        this.lucro11 = lucro11;
   }

   public BigDecimal getLucro12() {
        return lucro12;
   }

   public void setLucro12(BigDecimal lucro12) {
        markAsChanged("LUCRO_12", lucro12);
        this.lucro12 = lucro12;
   }

   public BigDecimal getLucro2() {
        return lucro2;
   }

   public void setLucro2(BigDecimal lucro2) {
        markAsChanged("LUCRO_2", lucro2);
        this.lucro2 = lucro2;
   }

   public BigDecimal getLucro3() {
        return lucro3;
   }

   public void setLucro3(BigDecimal lucro3) {
        markAsChanged("LUCRO_3", lucro3);
        this.lucro3 = lucro3;
   }

   public BigDecimal getLucro4() {
        return lucro4;
   }

   public void setLucro4(BigDecimal lucro4) {
        markAsChanged("LUCRO_4", lucro4);
        this.lucro4 = lucro4;
   }

   public BigDecimal getLucro5() {
        return lucro5;
   }

   public void setLucro5(BigDecimal lucro5) {
        markAsChanged("LUCRO_5", lucro5);
        this.lucro5 = lucro5;
   }

   public BigDecimal getLucro6() {
        return lucro6;
   }

   public void setLucro6(BigDecimal lucro6) {
        markAsChanged("LUCRO_6", lucro6);
        this.lucro6 = lucro6;
   }

   public BigDecimal getLucro7() {
        return lucro7;
   }

   public void setLucro7(BigDecimal lucro7) {
        markAsChanged("LUCRO_7", lucro7);
        this.lucro7 = lucro7;
   }

   public BigDecimal getLucro8() {
        return lucro8;
   }

   public void setLucro8(BigDecimal lucro8) {
        markAsChanged("LUCRO_8", lucro8);
        this.lucro8 = lucro8;
   }

   public BigDecimal getLucro9() {
        return lucro9;
   }

   public void setLucro9(BigDecimal lucro9) {
        markAsChanged("LUCRO_9", lucro9);
        this.lucro9 = lucro9;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public BigDecimal getMarkup() {
        return markup;
   }

   public void setMarkup(BigDecimal markup) {
        markAsChanged("MARKUP", markup);
        this.markup = markup;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getOneroso() {
        return oneroso;
   }

   public void setOneroso(String oneroso) {
        markAsChanged("ONEROSO", oneroso);
        this.oneroso = oneroso;
   }

   public BigDecimal getOrdemMedida() {
        return ordemMedida;
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        markAsChanged("ORDEMMEDIDA", ordemMedida);
        this.ordemMedida = ordemMedida;
   }

   public BigDecimal getPartEstoque() {
        return partEstoque;
   }

   public void setPartEstoque(BigDecimal partEstoque) {
        markAsChanged("PARTESTOQUE", partEstoque);
        this.partEstoque = partEstoque;
   }

   public BigDecimal getPartGasVarFat1() {
        return partGasVarFat1;
   }

   public void setPartGasVarFat1(BigDecimal partGasVarFat1) {
        markAsChanged("PARTGASVARFAT_1", partGasVarFat1);
        this.partGasVarFat1 = partGasVarFat1;
   }

   public BigDecimal getPartGasVarFat10() {
        return partGasVarFat10;
   }

   public void setPartGasVarFat10(BigDecimal partGasVarFat10) {
        markAsChanged("PARTGASVARFAT_10", partGasVarFat10);
        this.partGasVarFat10 = partGasVarFat10;
   }

   public BigDecimal getPartGasVarFat11() {
        return partGasVarFat11;
   }

   public void setPartGasVarFat11(BigDecimal partGasVarFat11) {
        markAsChanged("PARTGASVARFAT_11", partGasVarFat11);
        this.partGasVarFat11 = partGasVarFat11;
   }

   public BigDecimal getPartGasVarFat12() {
        return partGasVarFat12;
   }

   public void setPartGasVarFat12(BigDecimal partGasVarFat12) {
        markAsChanged("PARTGASVARFAT_12", partGasVarFat12);
        this.partGasVarFat12 = partGasVarFat12;
   }

   public BigDecimal getPartGasVarFat2() {
        return partGasVarFat2;
   }

   public void setPartGasVarFat2(BigDecimal partGasVarFat2) {
        markAsChanged("PARTGASVARFAT_2", partGasVarFat2);
        this.partGasVarFat2 = partGasVarFat2;
   }

   public BigDecimal getPartGasVarFat3() {
        return partGasVarFat3;
   }

   public void setPartGasVarFat3(BigDecimal partGasVarFat3) {
        markAsChanged("PARTGASVARFAT_3", partGasVarFat3);
        this.partGasVarFat3 = partGasVarFat3;
   }

   public BigDecimal getPartGasVarFat4() {
        return partGasVarFat4;
   }

   public void setPartGasVarFat4(BigDecimal partGasVarFat4) {
        markAsChanged("PARTGASVARFAT_4", partGasVarFat4);
        this.partGasVarFat4 = partGasVarFat4;
   }

   public BigDecimal getPartGasVarFat5() {
        return partGasVarFat5;
   }

   public void setPartGasVarFat5(BigDecimal partGasVarFat5) {
        markAsChanged("PARTGASVARFAT_5", partGasVarFat5);
        this.partGasVarFat5 = partGasVarFat5;
   }

   public BigDecimal getPartGasVarFat6() {
        return partGasVarFat6;
   }

   public void setPartGasVarFat6(BigDecimal partGasVarFat6) {
        markAsChanged("PARTGASVARFAT_6", partGasVarFat6);
        this.partGasVarFat6 = partGasVarFat6;
   }

   public BigDecimal getPartGasVarFat7() {
        return partGasVarFat7;
   }

   public void setPartGasVarFat7(BigDecimal partGasVarFat7) {
        markAsChanged("PARTGASVARFAT_7", partGasVarFat7);
        this.partGasVarFat7 = partGasVarFat7;
   }

   public BigDecimal getPartGasVarFat8() {
        return partGasVarFat8;
   }

   public void setPartGasVarFat8(BigDecimal partGasVarFat8) {
        markAsChanged("PARTGASVARFAT_8", partGasVarFat8);
        this.partGasVarFat8 = partGasVarFat8;
   }

   public BigDecimal getPartGasVarFat9() {
        return partGasVarFat9;
   }

   public void setPartGasVarFat9(BigDecimal partGasVarFat9) {
        markAsChanged("PARTGASVARFAT_9", partGasVarFat9);
        this.partGasVarFat9 = partGasVarFat9;
   }

   public BigDecimal getPartGasVar1() {
        return partGasVar1;
   }

   public void setPartGasVar1(BigDecimal partGasVar1) {
        markAsChanged("PARTGASVAR_1", partGasVar1);
        this.partGasVar1 = partGasVar1;
   }

   public BigDecimal getPartGasVar10() {
        return partGasVar10;
   }

   public void setPartGasVar10(BigDecimal partGasVar10) {
        markAsChanged("PARTGASVAR_10", partGasVar10);
        this.partGasVar10 = partGasVar10;
   }

   public BigDecimal getPartGasVar11() {
        return partGasVar11;
   }

   public void setPartGasVar11(BigDecimal partGasVar11) {
        markAsChanged("PARTGASVAR_11", partGasVar11);
        this.partGasVar11 = partGasVar11;
   }

   public BigDecimal getPartGasVar12() {
        return partGasVar12;
   }

   public void setPartGasVar12(BigDecimal partGasVar12) {
        markAsChanged("PARTGASVAR_12", partGasVar12);
        this.partGasVar12 = partGasVar12;
   }

   public BigDecimal getPartGasVar2() {
        return partGasVar2;
   }

   public void setPartGasVar2(BigDecimal partGasVar2) {
        markAsChanged("PARTGASVAR_2", partGasVar2);
        this.partGasVar2 = partGasVar2;
   }

   public BigDecimal getPartGasVar3() {
        return partGasVar3;
   }

   public void setPartGasVar3(BigDecimal partGasVar3) {
        markAsChanged("PARTGASVAR_3", partGasVar3);
        this.partGasVar3 = partGasVar3;
   }

   public BigDecimal getPartGasVar4() {
        return partGasVar4;
   }

   public void setPartGasVar4(BigDecimal partGasVar4) {
        markAsChanged("PARTGASVAR_4", partGasVar4);
        this.partGasVar4 = partGasVar4;
   }

   public BigDecimal getPartGasVar5() {
        return partGasVar5;
   }

   public void setPartGasVar5(BigDecimal partGasVar5) {
        markAsChanged("PARTGASVAR_5", partGasVar5);
        this.partGasVar5 = partGasVar5;
   }

   public BigDecimal getPartGasVar6() {
        return partGasVar6;
   }

   public void setPartGasVar6(BigDecimal partGasVar6) {
        markAsChanged("PARTGASVAR_6", partGasVar6);
        this.partGasVar6 = partGasVar6;
   }

   public BigDecimal getPartGasVar7() {
        return partGasVar7;
   }

   public void setPartGasVar7(BigDecimal partGasVar7) {
        markAsChanged("PARTGASVAR_7", partGasVar7);
        this.partGasVar7 = partGasVar7;
   }

   public BigDecimal getPartGasVar8() {
        return partGasVar8;
   }

   public void setPartGasVar8(BigDecimal partGasVar8) {
        markAsChanged("PARTGASVAR_8", partGasVar8);
        this.partGasVar8 = partGasVar8;
   }

   public BigDecimal getPartGasVar9() {
        return partGasVar9;
   }

   public void setPartGasVar9(BigDecimal partGasVar9) {
        markAsChanged("PARTGASVAR_9", partGasVar9);
        this.partGasVar9 = partGasVar9;
   }

   public BigDecimal getPartLucro1() {
        return partLucro1;
   }

   public void setPartLucro1(BigDecimal partLucro1) {
        markAsChanged("PARTLUCRO_1", partLucro1);
        this.partLucro1 = partLucro1;
   }

   public BigDecimal getPartLucro10() {
        return partLucro10;
   }

   public void setPartLucro10(BigDecimal partLucro10) {
        markAsChanged("PARTLUCRO_10", partLucro10);
        this.partLucro10 = partLucro10;
   }

   public BigDecimal getPartLucro11() {
        return partLucro11;
   }

   public void setPartLucro11(BigDecimal partLucro11) {
        markAsChanged("PARTLUCRO_11", partLucro11);
        this.partLucro11 = partLucro11;
   }

   public BigDecimal getPartLucro12() {
        return partLucro12;
   }

   public void setPartLucro12(BigDecimal partLucro12) {
        markAsChanged("PARTLUCRO_12", partLucro12);
        this.partLucro12 = partLucro12;
   }

   public BigDecimal getPartLucro2() {
        return partLucro2;
   }

   public void setPartLucro2(BigDecimal partLucro2) {
        markAsChanged("PARTLUCRO_2", partLucro2);
        this.partLucro2 = partLucro2;
   }

   public BigDecimal getPartLucro3() {
        return partLucro3;
   }

   public void setPartLucro3(BigDecimal partLucro3) {
        markAsChanged("PARTLUCRO_3", partLucro3);
        this.partLucro3 = partLucro3;
   }

   public BigDecimal getPartLucro4() {
        return partLucro4;
   }

   public void setPartLucro4(BigDecimal partLucro4) {
        markAsChanged("PARTLUCRO_4", partLucro4);
        this.partLucro4 = partLucro4;
   }

   public BigDecimal getPartLucro5() {
        return partLucro5;
   }

   public void setPartLucro5(BigDecimal partLucro5) {
        markAsChanged("PARTLUCRO_5", partLucro5);
        this.partLucro5 = partLucro5;
   }

   public String getProdFalta() {
        return prodFalta;
   }

   public void setProdFalta(String prodFalta) {
        markAsChanged("PRODFALTA", prodFalta);
        this.prodFalta = prodFalta;
   }

   public BigDecimal getQtdMaxima() {
        return qtdMaxima;
   }

   public void setQtdMaxima(BigDecimal qtdMaxima) {
        markAsChanged("QTDMAXIMA", qtdMaxima);
        this.qtdMaxima = qtdMaxima;
   }

   public BigDecimal getQtdMedia() {
        return qtdMedia;
   }

   public void setQtdMedia(BigDecimal qtdMedia) {
        markAsChanged("QTDMEDIA", qtdMedia);
        this.qtdMedia = qtdMedia;
   }

   public BigDecimal getPartLucro6() {
        return partLucro6;
   }

   public void setPartLucro6(BigDecimal partLucro6) {
        markAsChanged("PARTLUCRO_6", partLucro6);
        this.partLucro6 = partLucro6;
   }

   public BigDecimal getPartLucro7() {
        return partLucro7;
   }

   public void setPartLucro7(BigDecimal partLucro7) {
        markAsChanged("PARTLUCRO_7", partLucro7);
        this.partLucro7 = partLucro7;
   }

   public BigDecimal getPartLucro8() {
        return partLucro8;
   }

   public void setPartLucro8(BigDecimal partLucro8) {
        markAsChanged("PARTLUCRO_8", partLucro8);
        this.partLucro8 = partLucro8;
   }

   public BigDecimal getPartLucro9() {
        return partLucro9;
   }

   public void setPartLucro9(BigDecimal partLucro9) {
        markAsChanged("PARTLUCRO_9", partLucro9);
        this.partLucro9 = partLucro9;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
        this.refForn = refForn;
   }

   public String getRefMercMed() {
        return refMercMed;
   }

   public void setRefMercMed(String refMercMed) {
        markAsChanged("REFMERCMED", refMercMed);
        this.refMercMed = refMercMed;
   }

   public BigDecimal getStatusMed() {
        return statusMed;
   }

   public void setStatusMed(BigDecimal statusMed) {
        markAsChanged("STATUSMED", statusMed);
        this.statusMed = statusMed;
   }

   public BigDecimal getSugCompCustGer() {
        return sugCompCustGer;
   }

   public void setSugCompCustGer(BigDecimal sugCompCustGer) {
        markAsChanged("SUGCOMPCUSTGER", sugCompCustGer);
        this.sugCompCustGer = sugCompCustGer;
   }

   public String getCurvaTot6() {
        return curvaTot6;
   }

   public void setCurvaTot6(String curvaTot6) {
        markAsChanged("CURVATOT_6", curvaTot6);
        this.curvaTot6 = curvaTot6;
   }

   public String getCurvaTot7() {
        return curvaTot7;
   }

   public void setCurvaTot7(String curvaTot7) {
        markAsChanged("CURVATOT_7", curvaTot7);
        this.curvaTot7 = curvaTot7;
   }

   public String getCurvaTot8() {
        return curvaTot8;
   }

   public void setCurvaTot8(String curvaTot8) {
        markAsChanged("CURVATOT_8", curvaTot8);
        this.curvaTot8 = curvaTot8;
   }

   public String getCurvaTot9() {
        return curvaTot9;
   }

   public void setCurvaTot9(String curvaTot9) {
        markAsChanged("CURVATOT_9", curvaTot9);
        this.curvaTot9 = curvaTot9;
   }

   public BigDecimal getCustoGer() {
        return custoGer;
   }

   public void setCustoGer(BigDecimal custoGer) {
        markAsChanged("CUSTOGER", custoGer);
        this.custoGer = custoGer;
   }

   public BigDecimal getCustoRep() {
        return custoRep;
   }

   public void setCustoRep(BigDecimal custoRep) {
        markAsChanged("CUSTOREP", custoRep);
        this.custoRep = custoRep;
   }

   public BigDecimal getCustoVenda1() {
        return custoVenda1;
   }

   public void setCustoVenda1(BigDecimal custoVenda1) {
        markAsChanged("CUSTOVENDA_1", custoVenda1);
        this.custoVenda1 = custoVenda1;
   }

   public BigDecimal getPartMargContFat5() {
        return partMargContFat5;
   }

   public void setPartMargContFat5(BigDecimal partMargContFat5) {
        markAsChanged("PARTMARGCONTFAT_5", partMargContFat5);
        this.partMargContFat5 = partMargContFat5;
   }

   public BigDecimal getPartMargContFat6() {
        return partMargContFat6;
   }

   public void setPartMargContFat6(BigDecimal partMargContFat6) {
        markAsChanged("PARTMARGCONTFAT_6", partMargContFat6);
        this.partMargContFat6 = partMargContFat6;
   }

   public BigDecimal getPartMargContFat7() {
        return partMargContFat7;
   }

   public void setPartMargContFat7(BigDecimal partMargContFat7) {
        markAsChanged("PARTMARGCONTFAT_7", partMargContFat7);
        this.partMargContFat7 = partMargContFat7;
   }

   public BigDecimal getPartMargContFat8() {
        return partMargContFat8;
   }

   public void setPartMargContFat8(BigDecimal partMargContFat8) {
        markAsChanged("PARTMARGCONTFAT_8", partMargContFat8);
        this.partMargContFat8 = partMargContFat8;
   }

   public BigDecimal getPartMargContFat9() {
        return partMargContFat9;
   }

   public void setPartMargContFat9(BigDecimal partMargContFat9) {
        markAsChanged("PARTMARGCONTFAT_9", partMargContFat9);
        this.partMargContFat9 = partMargContFat9;
   }

   public BigDecimal getPartMargCont1() {
        return partMargCont1;
   }

   public void setPartMargCont1(BigDecimal partMargCont1) {
        markAsChanged("PARTMARGCONT_1", partMargCont1);
        this.partMargCont1 = partMargCont1;
   }

   public BigDecimal getPartMargCont10() {
        return partMargCont10;
   }

   public void setPartMargCont10(BigDecimal partMargCont10) {
        markAsChanged("PARTMARGCONT_10", partMargCont10);
        this.partMargCont10 = partMargCont10;
   }

   public BigDecimal getPartMargCont11() {
        return partMargCont11;
   }

   public void setPartMargCont11(BigDecimal partMargCont11) {
        markAsChanged("PARTMARGCONT_11", partMargCont11);
        this.partMargCont11 = partMargCont11;
   }

   public BigDecimal getPartMargCont12() {
        return partMargCont12;
   }

   public void setPartMargCont12(BigDecimal partMargCont12) {
        markAsChanged("PARTMARGCONT_12", partMargCont12);
        this.partMargCont12 = partMargCont12;
   }

   public BigDecimal getPartMargCont2() {
        return partMargCont2;
   }

   public void setPartMargCont2(BigDecimal partMargCont2) {
        markAsChanged("PARTMARGCONT_2", partMargCont2);
        this.partMargCont2 = partMargCont2;
   }

   public BigDecimal getPartMargCont3() {
        return partMargCont3;
   }

   public void setPartMargCont3(BigDecimal partMargCont3) {
        markAsChanged("PARTMARGCONT_3", partMargCont3);
        this.partMargCont3 = partMargCont3;
   }

   public BigDecimal getPartMargCont4() {
        return partMargCont4;
   }

   public void setPartMargCont4(BigDecimal partMargCont4) {
        markAsChanged("PARTMARGCONT_4", partMargCont4);
        this.partMargCont4 = partMargCont4;
   }

   public BigDecimal getPartMargCont5() {
        return partMargCont5;
   }

   public void setPartMargCont5(BigDecimal partMargCont5) {
        markAsChanged("PARTMARGCONT_5", partMargCont5);
        this.partMargCont5 = partMargCont5;
   }

   public BigDecimal getPartMargCont6() {
        return partMargCont6;
   }

   public void setPartMargCont6(BigDecimal partMargCont6) {
        markAsChanged("PARTMARGCONT_6", partMargCont6);
        this.partMargCont6 = partMargCont6;
   }

   public BigDecimal getPartMargCont7() {
        return partMargCont7;
   }

   public void setPartMargCont7(BigDecimal partMargCont7) {
        markAsChanged("PARTMARGCONT_7", partMargCont7);
        this.partMargCont7 = partMargCont7;
   }

   public BigDecimal getPartMargCont8() {
        return partMargCont8;
   }

   public void setPartMargCont8(BigDecimal partMargCont8) {
        markAsChanged("PARTMARGCONT_8", partMargCont8);
        this.partMargCont8 = partMargCont8;
   }

   public BigDecimal getPartMargCont9() {
        return partMargCont9;
   }

   public void setPartMargCont9(BigDecimal partMargCont9) {
        markAsChanged("PARTMARGCONT_9", partMargCont9);
        this.partMargCont9 = partMargCont9;
   }

   public BigDecimal getPartPeso1() {
        return partPeso1;
   }

   public void setPartPeso1(BigDecimal partPeso1) {
        markAsChanged("PARTPESO_1", partPeso1);
        this.partPeso1 = partPeso1;
   }

   public BigDecimal getAcumMarg1() {
        return acumMarg1;
   }

   public void setAcumMarg1(BigDecimal acumMarg1) {
        markAsChanged("ACUMMARG_1", acumMarg1);
        this.acumMarg1 = acumMarg1;
   }

   public BigDecimal getAcumMarg10() {
        return acumMarg10;
   }

   public void setAcumMarg10(BigDecimal acumMarg10) {
        markAsChanged("ACUMMARG_10", acumMarg10);
        this.acumMarg10 = acumMarg10;
   }

   public BigDecimal getQtdMinima() {
        return qtdMinima;
   }

   public void setQtdMinima(BigDecimal qtdMinima) {
        markAsChanged("QTDMINIMA", qtdMinima);
        this.qtdMinima = qtdMinima;
   }

   public BigDecimal getQtdTotal() {
        return qtdTotal;
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        markAsChanged("QTDTOTAL", qtdTotal);
        this.qtdTotal = qtdTotal;
   }

   public BigDecimal getQtdUltCompra() {
        return qtdUltCompra;
   }

   public void setQtdUltCompra(BigDecimal qtdUltCompra) {
        markAsChanged("QTDULTCOMPRA", qtdUltCompra);
        this.qtdUltCompra = qtdUltCompra;
   }

   public BigDecimal getPartPeso10() {
        return partPeso10;
   }

   public void setPartPeso10(BigDecimal partPeso10) {
        markAsChanged("PARTPESO_10", partPeso10);
        this.partPeso10 = partPeso10;
   }

   public BigDecimal getPartPeso11() {
        return partPeso11;
   }

   public void setPartPeso11(BigDecimal partPeso11) {
        markAsChanged("PARTPESO_11", partPeso11);
        this.partPeso11 = partPeso11;
   }

   public BigDecimal getPartPeso12() {
        return partPeso12;
   }

   public void setPartPeso12(BigDecimal partPeso12) {
        markAsChanged("PARTPESO_12", partPeso12);
        this.partPeso12 = partPeso12;
   }

   public BigDecimal getPartPeso2() {
        return partPeso2;
   }

   public void setPartPeso2(BigDecimal partPeso2) {
        markAsChanged("PARTPESO_2", partPeso2);
        this.partPeso2 = partPeso2;
   }

   public BigDecimal getPartPeso3() {
        return partPeso3;
   }

   public void setPartPeso3(BigDecimal partPeso3) {
        markAsChanged("PARTPESO_3", partPeso3);
        this.partPeso3 = partPeso3;
   }

   public BigDecimal getPartPeso4() {
        return partPeso4;
   }

   public void setPartPeso4(BigDecimal partPeso4) {
        markAsChanged("PARTPESO_4", partPeso4);
        this.partPeso4 = partPeso4;
   }

   public BigDecimal getPartPeso5() {
        return partPeso5;
   }

   public void setPartPeso5(BigDecimal partPeso5) {
        markAsChanged("PARTPESO_5", partPeso5);
        this.partPeso5 = partPeso5;
   }

   public BigDecimal getPartPeso6() {
        return partPeso6;
   }

   public void setPartPeso6(BigDecimal partPeso6) {
        markAsChanged("PARTPESO_6", partPeso6);
        this.partPeso6 = partPeso6;
   }

   public BigDecimal getPartPeso7() {
        return partPeso7;
   }

   public void setPartPeso7(BigDecimal partPeso7) {
        markAsChanged("PARTPESO_7", partPeso7);
        this.partPeso7 = partPeso7;
   }

   public BigDecimal getPartPeso8() {
        return partPeso8;
   }

   public void setPartPeso8(BigDecimal partPeso8) {
        markAsChanged("PARTPESO_8", partPeso8);
        this.partPeso8 = partPeso8;
   }

   public BigDecimal getPartPeso9() {
        return partPeso9;
   }

   public void setPartPeso9(BigDecimal partPeso9) {
        markAsChanged("PARTPESO_9", partPeso9);
        this.partPeso9 = partPeso9;
   }

   public BigDecimal getPartQtde1() {
        return partQtde1;
   }

   public void setPartQtde1(BigDecimal partQtde1) {
        markAsChanged("PARTQTDE_1", partQtde1);
        this.partQtde1 = partQtde1;
   }

   public BigDecimal getPartQtde10() {
        return partQtde10;
   }

   public void setPartQtde10(BigDecimal partQtde10) {
        markAsChanged("PARTQTDE_10", partQtde10);
        this.partQtde10 = partQtde10;
   }

   public BigDecimal getPartQtde11() {
        return partQtde11;
   }

   public void setPartQtde11(BigDecimal partQtde11) {
        markAsChanged("PARTQTDE_11", partQtde11);
        this.partQtde11 = partQtde11;
   }

   public BigDecimal getPartQtde12() {
        return partQtde12;
   }

   public void setPartQtde12(BigDecimal partQtde12) {
        markAsChanged("PARTQTDE_12", partQtde12);
        this.partQtde12 = partQtde12;
   }

   public BigDecimal getPartQtde2() {
        return partQtde2;
   }

   public void setPartQtde2(BigDecimal partQtde2) {
        markAsChanged("PARTQTDE_2", partQtde2);
        this.partQtde2 = partQtde2;
   }

   public BigDecimal getPartQtde3() {
        return partQtde3;
   }

   public void setPartQtde3(BigDecimal partQtde3) {
        markAsChanged("PARTQTDE_3", partQtde3);
        this.partQtde3 = partQtde3;
   }

   public BigDecimal getPartQtde4() {
        return partQtde4;
   }

   public void setPartQtde4(BigDecimal partQtde4) {
        markAsChanged("PARTQTDE_4", partQtde4);
        this.partQtde4 = partQtde4;
   }

   public BigDecimal getPartQtde5() {
        return partQtde5;
   }

   public void setPartQtde5(BigDecimal partQtde5) {
        markAsChanged("PARTQTDE_5", partQtde5);
        this.partQtde5 = partQtde5;
   }

   public BigDecimal getPartQtde6() {
        return partQtde6;
   }

   public void setPartQtde6(BigDecimal partQtde6) {
        markAsChanged("PARTQTDE_6", partQtde6);
        this.partQtde6 = partQtde6;
   }

   public BigDecimal getPartQtde7() {
        return partQtde7;
   }

   public void setPartQtde7(BigDecimal partQtde7) {
        markAsChanged("PARTQTDE_7", partQtde7);
        this.partQtde7 = partQtde7;
   }

   public BigDecimal getPartQtde8() {
        return partQtde8;
   }

   public void setPartQtde8(BigDecimal partQtde8) {
        markAsChanged("PARTQTDE_8", partQtde8);
        this.partQtde8 = partQtde8;
   }

   public BigDecimal getPartQtde9() {
        return partQtde9;
   }

   public void setPartQtde9(BigDecimal partQtde9) {
        markAsChanged("PARTQTDE_9", partQtde9);
        this.partQtde9 = partQtde9;
   }

   public BigDecimal getPartTotPer1() {
        return partTotPer1;
   }

   public void setPartTotPer1(BigDecimal partTotPer1) {
        markAsChanged("PARTTOTPER_1", partTotPer1);
        this.partTotPer1 = partTotPer1;
   }

   public BigDecimal getPartTotPer10() {
        return partTotPer10;
   }

   public void setPartTotPer10(BigDecimal partTotPer10) {
        markAsChanged("PARTTOTPER_10", partTotPer10);
        this.partTotPer10 = partTotPer10;
   }

   public BigDecimal getPartTotPer11() {
        return partTotPer11;
   }

   public void setPartTotPer11(BigDecimal partTotPer11) {
        markAsChanged("PARTTOTPER_11", partTotPer11);
        this.partTotPer11 = partTotPer11;
   }

   public BigDecimal getPartTotPer12() {
        return partTotPer12;
   }

   public void setPartTotPer12(BigDecimal partTotPer12) {
        markAsChanged("PARTTOTPER_12", partTotPer12);
        this.partTotPer12 = partTotPer12;
   }

   public BigDecimal getPartTotPer2() {
        return partTotPer2;
   }

   public void setPartTotPer2(BigDecimal partTotPer2) {
        markAsChanged("PARTTOTPER_2", partTotPer2);
        this.partTotPer2 = partTotPer2;
   }

   public BigDecimal getPartTotPer3() {
        return partTotPer3;
   }

   public void setPartTotPer3(BigDecimal partTotPer3) {
        markAsChanged("PARTTOTPER_3", partTotPer3);
        this.partTotPer3 = partTotPer3;
   }

   public BigDecimal getPartTotPer4() {
        return partTotPer4;
   }

   public void setPartTotPer4(BigDecimal partTotPer4) {
        markAsChanged("PARTTOTPER_4", partTotPer4);
        this.partTotPer4 = partTotPer4;
   }

   public BigDecimal getPartTotPer5() {
        return partTotPer5;
   }

   public void setPartTotPer5(BigDecimal partTotPer5) {
        markAsChanged("PARTTOTPER_5", partTotPer5);
        this.partTotPer5 = partTotPer5;
   }

   public BigDecimal getPartTotPer6() {
        return partTotPer6;
   }

   public void setPartTotPer6(BigDecimal partTotPer6) {
        markAsChanged("PARTTOTPER_6", partTotPer6);
        this.partTotPer6 = partTotPer6;
   }

   public BigDecimal getPartTotPer7() {
        return partTotPer7;
   }

   public void setPartTotPer7(BigDecimal partTotPer7) {
        markAsChanged("PARTTOTPER_7", partTotPer7);
        this.partTotPer7 = partTotPer7;
   }

   public BigDecimal getPartTotPer8() {
        return partTotPer8;
   }

   public void setPartTotPer8(BigDecimal partTotPer8) {
        markAsChanged("PARTTOTPER_8", partTotPer8);
        this.partTotPer8 = partTotPer8;
   }

   public BigDecimal getPartTotPer9() {
        return partTotPer9;
   }

   public void setPartTotPer9(BigDecimal partTotPer9) {
        markAsChanged("PARTTOTPER_9", partTotPer9);
        this.partTotPer9 = partTotPer9;
   }

   public BigDecimal getPedCpApend() {
        return pedCpApend;
   }

   public void setPedCpApend(BigDecimal pedCpApend) {
        markAsChanged("PEDCPAPEND", pedCpApend);
        this.pedCpApend = pedCpApend;
   }

   public BigDecimal getPedVdApend() {
        return pedVdApend;
   }

   public void setPedVdApend(BigDecimal pedVdApend) {
        markAsChanged("PEDVDAPEND", pedVdApend);
        this.pedVdApend = pedVdApend;
   }

   public BigDecimal getPerLucro1() {
        return perLucro1;
   }

   public void setPerLucro1(BigDecimal perLucro1) {
        markAsChanged("PERLUCRO_1", perLucro1);
        this.perLucro1 = perLucro1;
   }

   public BigDecimal getPerLucro10() {
        return perLucro10;
   }

   public void setPerLucro10(BigDecimal perLucro10) {
        markAsChanged("PERLUCRO_10", perLucro10);
        this.perLucro10 = perLucro10;
   }

   public BigDecimal getPerLucro11() {
        return perLucro11;
   }

   public void setPerLucro11(BigDecimal perLucro11) {
        markAsChanged("PERLUCRO_11", perLucro11);
        this.perLucro11 = perLucro11;
   }

   public BigDecimal getPerLucro12() {
        return perLucro12;
   }

   public void setPerLucro12(BigDecimal perLucro12) {
        markAsChanged("PERLUCRO_12", perLucro12);
        this.perLucro12 = perLucro12;
   }

   public BigDecimal getPerLucro2() {
        return perLucro2;
   }

   public void setPerLucro2(BigDecimal perLucro2) {
        markAsChanged("PERLUCRO_2", perLucro2);
        this.perLucro2 = perLucro2;
   }

   public BigDecimal getPerLucro3() {
        return perLucro3;
   }

   public void setPerLucro3(BigDecimal perLucro3) {
        markAsChanged("PERLUCRO_3", perLucro3);
        this.perLucro3 = perLucro3;
   }

   public BigDecimal getPerLucro4() {
        return perLucro4;
   }

   public void setPerLucro4(BigDecimal perLucro4) {
        markAsChanged("PERLUCRO_4", perLucro4);
        this.perLucro4 = perLucro4;
   }

   public BigDecimal getPerLucro5() {
        return perLucro5;
   }

   public void setPerLucro5(BigDecimal perLucro5) {
        markAsChanged("PERLUCRO_5", perLucro5);
        this.perLucro5 = perLucro5;
   }

   public BigDecimal getPerLucro6() {
        return perLucro6;
   }

   public void setPerLucro6(BigDecimal perLucro6) {
        markAsChanged("PERLUCRO_6", perLucro6);
        this.perLucro6 = perLucro6;
   }

   public BigDecimal getPerLucro7() {
        return perLucro7;
   }

   public void setPerLucro7(BigDecimal perLucro7) {
        markAsChanged("PERLUCRO_7", perLucro7);
        this.perLucro7 = perLucro7;
   }

   public BigDecimal getPerLucro8() {
        return perLucro8;
   }

   public void setPerLucro8(BigDecimal perLucro8) {
        markAsChanged("PERLUCRO_8", perLucro8);
        this.perLucro8 = perLucro8;
   }

   public BigDecimal getPerLucro9() {
        return perLucro9;
   }

   public void setPerLucro9(BigDecimal perLucro9) {
        markAsChanged("PERLUCRO_9", perLucro9);
        this.perLucro9 = perLucro9;
   }

   public BigDecimal getPeso1() {
        return peso1;
   }

   public void setPeso1(BigDecimal peso1) {
        markAsChanged("PESO_1", peso1);
        this.peso1 = peso1;
   }

   public BigDecimal getPeso10() {
        return peso10;
   }

   public void setPeso10(BigDecimal peso10) {
        markAsChanged("PESO_10", peso10);
        this.peso10 = peso10;
   }

   public BigDecimal getPeso11() {
        return peso11;
   }

   public void setPeso11(BigDecimal peso11) {
        markAsChanged("PESO_11", peso11);
        this.peso11 = peso11;
   }

   public BigDecimal getPeso12() {
        return peso12;
   }

   public void setPeso12(BigDecimal peso12) {
        markAsChanged("PESO_12", peso12);
        this.peso12 = peso12;
   }

   public BigDecimal getPeso2() {
        return peso2;
   }

   public void setPeso2(BigDecimal peso2) {
        markAsChanged("PESO_2", peso2);
        this.peso2 = peso2;
   }

   public BigDecimal getPeso3() {
        return peso3;
   }

   public void setPeso3(BigDecimal peso3) {
        markAsChanged("PESO_3", peso3);
        this.peso3 = peso3;
   }

   public BigDecimal getPeso4() {
        return peso4;
   }

   public void setPeso4(BigDecimal peso4) {
        markAsChanged("PESO_4", peso4);
        this.peso4 = peso4;
   }

   public BigDecimal getPeso5() {
        return peso5;
   }

   public void setPeso5(BigDecimal peso5) {
        markAsChanged("PESO_5", peso5);
        this.peso5 = peso5;
   }

   public BigDecimal getPeso6() {
        return peso6;
   }

   public void setPeso6(BigDecimal peso6) {
        markAsChanged("PESO_6", peso6);
        this.peso6 = peso6;
   }

   public BigDecimal getPeso7() {
        return peso7;
   }

   public void setPeso7(BigDecimal peso7) {
        markAsChanged("PESO_7", peso7);
        this.peso7 = peso7;
   }

   public BigDecimal getPeso8() {
        return peso8;
   }

   public void setPeso8(BigDecimal peso8) {
        markAsChanged("PESO_8", peso8);
        this.peso8 = peso8;
   }

   public BigDecimal getPeso9() {
        return peso9;
   }

   public void setPeso9(BigDecimal peso9) {
        markAsChanged("PESO_9", peso9);
        this.peso9 = peso9;
   }

   public BigDecimal getPopTotal() {
        return popTotal;
   }

   public void setPopTotal(BigDecimal popTotal) {
        markAsChanged("POPTOTAL", popTotal);
        this.popTotal = popTotal;
   }

   public BigDecimal getPopularidade1() {
        return popularidade1;
   }

   public void setPopularidade1(BigDecimal popularidade1) {
        markAsChanged("POPULARIDADE_1", popularidade1);
        this.popularidade1 = popularidade1;
   }

   public BigDecimal getPopularidade10() {
        return popularidade10;
   }

   public void setPopularidade10(BigDecimal popularidade10) {
        markAsChanged("POPULARIDADE_10", popularidade10);
        this.popularidade10 = popularidade10;
   }

   public BigDecimal getPopularidade11() {
        return popularidade11;
   }

   public void setPopularidade11(BigDecimal popularidade11) {
        markAsChanged("POPULARIDADE_11", popularidade11);
        this.popularidade11 = popularidade11;
   }

   public BigDecimal getPopularidade12() {
        return popularidade12;
   }

   public void setPopularidade12(BigDecimal popularidade12) {
        markAsChanged("POPULARIDADE_12", popularidade12);
        this.popularidade12 = popularidade12;
   }

   public BigDecimal getPopularidade2() {
        return popularidade2;
   }

   public void setPopularidade2(BigDecimal popularidade2) {
        markAsChanged("POPULARIDADE_2", popularidade2);
        this.popularidade2 = popularidade2;
   }

   public BigDecimal getPopularidade3() {
        return popularidade3;
   }

   public void setPopularidade3(BigDecimal popularidade3) {
        markAsChanged("POPULARIDADE_3", popularidade3);
        this.popularidade3 = popularidade3;
   }

   public BigDecimal getPopularidade4() {
        return popularidade4;
   }

   public void setPopularidade4(BigDecimal popularidade4) {
        markAsChanged("POPULARIDADE_4", popularidade4);
        this.popularidade4 = popularidade4;
   }

   public BigDecimal getPopularidade5() {
        return popularidade5;
   }

   public void setPopularidade5(BigDecimal popularidade5) {
        markAsChanged("POPULARIDADE_5", popularidade5);
        this.popularidade5 = popularidade5;
   }

   public BigDecimal getPartMargContFat3() {
        return partMargContFat3;
   }

   public void setPartMargContFat3(BigDecimal partMargContFat3) {
        markAsChanged("PARTMARGCONTFAT_3", partMargContFat3);
        this.partMargContFat3 = partMargContFat3;
   }

   public BigDecimal getPartMargContFat4() {
        return partMargContFat4;
   }

   public void setPartMargContFat4(BigDecimal partMargContFat4) {
        markAsChanged("PARTMARGCONTFAT_4", partMargContFat4);
        this.partMargContFat4 = partMargContFat4;
   }

   public BigDecimal getCustoVenda6() {
        return custoVenda6;
   }

   public void setCustoVenda6(BigDecimal custoVenda6) {
        markAsChanged("CUSTOVENDA_6", custoVenda6);
        this.custoVenda6 = custoVenda6;
   }

   public BigDecimal getCustoVenda7() {
        return custoVenda7;
   }

   public void setCustoVenda7(BigDecimal custoVenda7) {
        markAsChanged("CUSTOVENDA_7", custoVenda7);
        this.custoVenda7 = custoVenda7;
   }

   public BigDecimal getCustoVenda8() {
        return custoVenda8;
   }

   public void setCustoVenda8(BigDecimal custoVenda8) {
        markAsChanged("CUSTOVENDA_8", custoVenda8);
        this.custoVenda8 = custoVenda8;
   }

   public BigDecimal getCustoVenda9() {
        return custoVenda9;
   }

   public void setCustoVenda9(BigDecimal custoVenda9) {
        markAsChanged("CUSTOVENDA_9", custoVenda9);
        this.custoVenda9 = custoVenda9;
   }

   public BigDecimal getCustoVndTotal1() {
        return custoVndTotal1;
   }

   public void setCustoVndTotal1(BigDecimal custoVndTotal1) {
        markAsChanged("CUSTOVNDTOTAL_1", custoVndTotal1);
        this.custoVndTotal1 = custoVndTotal1;
   }

   public BigDecimal getCustoVndTotal10() {
        return custoVndTotal10;
   }

   public void setCustoVndTotal10(BigDecimal custoVndTotal10) {
        markAsChanged("CUSTOVNDTOTAL_10", custoVndTotal10);
        this.custoVndTotal10 = custoVndTotal10;
   }

   public BigDecimal getCustoVndTotal11() {
        return custoVndTotal11;
   }

   public void setCustoVndTotal11(BigDecimal custoVndTotal11) {
        markAsChanged("CUSTOVNDTOTAL_11", custoVndTotal11);
        this.custoVndTotal11 = custoVndTotal11;
   }

   public BigDecimal getCustoVndTotal12() {
        return custoVndTotal12;
   }

   public void setCustoVndTotal12(BigDecimal custoVndTotal12) {
        markAsChanged("CUSTOVNDTOTAL_12", custoVndTotal12);
        this.custoVndTotal12 = custoVndTotal12;
   }

   public BigDecimal getCustoVndTotal2() {
        return custoVndTotal2;
   }

   public void setCustoVndTotal2(BigDecimal custoVndTotal2) {
        markAsChanged("CUSTOVNDTOTAL_2", custoVndTotal2);
        this.custoVndTotal2 = custoVndTotal2;
   }

   public BigDecimal getCustoVndTotal3() {
        return custoVndTotal3;
   }

   public void setCustoVndTotal3(BigDecimal custoVndTotal3) {
        markAsChanged("CUSTOVNDTOTAL_3", custoVndTotal3);
        this.custoVndTotal3 = custoVndTotal3;
   }

   public BigDecimal getCustoVndTotal4() {
        return custoVndTotal4;
   }

   public void setCustoVndTotal4(BigDecimal custoVndTotal4) {
        markAsChanged("CUSTOVNDTOTAL_4", custoVndTotal4);
        this.custoVndTotal4 = custoVndTotal4;
   }

   public BigDecimal getCustoVndTotal5() {
        return custoVndTotal5;
   }

   public void setCustoVndTotal5(BigDecimal custoVndTotal5) {
        markAsChanged("CUSTOVNDTOTAL_5", custoVndTotal5);
        this.custoVndTotal5 = custoVndTotal5;
   }

   public BigDecimal getCustoVndTotal6() {
        return custoVndTotal6;
   }

   public void setCustoVndTotal6(BigDecimal custoVndTotal6) {
        markAsChanged("CUSTOVNDTOTAL_6", custoVndTotal6);
        this.custoVndTotal6 = custoVndTotal6;
   }

   public BigDecimal getCustoVndTotal7() {
        return custoVndTotal7;
   }

   public void setCustoVndTotal7(BigDecimal custoVndTotal7) {
        markAsChanged("CUSTOVNDTOTAL_7", custoVndTotal7);
        this.custoVndTotal7 = custoVndTotal7;
   }

   public BigDecimal getCustoVenda10() {
        return custoVenda10;
   }

   public void setCustoVenda10(BigDecimal custoVenda10) {
        markAsChanged("CUSTOVENDA_10", custoVenda10);
        this.custoVenda10 = custoVenda10;
   }

   public BigDecimal getCustoVenda11() {
        return custoVenda11;
   }

   public void setCustoVenda11(BigDecimal custoVenda11) {
        markAsChanged("CUSTOVENDA_11", custoVenda11);
        this.custoVenda11 = custoVenda11;
   }

   public BigDecimal getPopularidade6() {
        return popularidade6;
   }

   public void setPopularidade6(BigDecimal popularidade6) {
        markAsChanged("POPULARIDADE_6", popularidade6);
        this.popularidade6 = popularidade6;
   }

   public BigDecimal getVlrUnit7() {
        return vlrUnit7;
   }

   public void setVlrUnit7(BigDecimal vlrUnit7) {
        markAsChanged("VLRUNIT_7", vlrUnit7);
        this.vlrUnit7 = vlrUnit7;
   }

   public BigDecimal getVlrUnit8() {
        return vlrUnit8;
   }

   public void setVlrUnit8(BigDecimal vlrUnit8) {
        markAsChanged("VLRUNIT_8", vlrUnit8);
        this.vlrUnit8 = vlrUnit8;
   }

   public BigDecimal getVlrUnit9() {
        return vlrUnit9;
   }

   public void setVlrUnit9(BigDecimal vlrUnit9) {
        markAsChanged("VLRUNIT_9", vlrUnit9);
        this.vlrUnit9 = vlrUnit9;
   }

   public BigDecimal getVlrVenda1() {
        return vlrVenda1;
   }

   public void setVlrVenda1(BigDecimal vlrVenda1) {
        markAsChanged("VLRVENDA_1", vlrVenda1);
        this.vlrVenda1 = vlrVenda1;
   }

   public BigDecimal getVlrVenda10() {
        return vlrVenda10;
   }

   public void setVlrVenda10(BigDecimal vlrVenda10) {
        markAsChanged("VLRVENDA_10", vlrVenda10);
        this.vlrVenda10 = vlrVenda10;
   }

   public BigDecimal getVlrVenda11() {
        return vlrVenda11;
   }

   public void setVlrVenda11(BigDecimal vlrVenda11) {
        markAsChanged("VLRVENDA_11", vlrVenda11);
        this.vlrVenda11 = vlrVenda11;
   }

   public BigDecimal getVlrVenda12() {
        return vlrVenda12;
   }

   public void setVlrVenda12(BigDecimal vlrVenda12) {
        markAsChanged("VLRVENDA_12", vlrVenda12);
        this.vlrVenda12 = vlrVenda12;
   }

   public BigDecimal getVlrVenda2() {
        return vlrVenda2;
   }

   public void setVlrVenda2(BigDecimal vlrVenda2) {
        markAsChanged("VLRVENDA_2", vlrVenda2);
        this.vlrVenda2 = vlrVenda2;
   }

   public BigDecimal getVlrVenda3() {
        return vlrVenda3;
   }

   public void setVlrVenda3(BigDecimal vlrVenda3) {
        markAsChanged("VLRVENDA_3", vlrVenda3);
        this.vlrVenda3 = vlrVenda3;
   }

   public BigDecimal getVlrVenda4() {
        return vlrVenda4;
   }

   public void setVlrVenda4(BigDecimal vlrVenda4) {
        markAsChanged("VLRVENDA_4", vlrVenda4);
        this.vlrVenda4 = vlrVenda4;
   }

   public BigDecimal getVlrVenda5() {
        return vlrVenda5;
   }

   public void setVlrVenda5(BigDecimal vlrVenda5) {
        markAsChanged("VLRVENDA_5", vlrVenda5);
        this.vlrVenda5 = vlrVenda5;
   }

   public BigDecimal getVlrVenda6() {
        return vlrVenda6;
   }

   public void setVlrVenda6(BigDecimal vlrVenda6) {
        markAsChanged("VLRVENDA_6", vlrVenda6);
        this.vlrVenda6 = vlrVenda6;
   }

   public BigDecimal getVlrVenda7() {
        return vlrVenda7;
   }

   public void setVlrVenda7(BigDecimal vlrVenda7) {
        markAsChanged("VLRVENDA_7", vlrVenda7);
        this.vlrVenda7 = vlrVenda7;
   }

   public BigDecimal getVlrVenda8() {
        return vlrVenda8;
   }

   public void setVlrVenda8(BigDecimal vlrVenda8) {
        markAsChanged("VLRVENDA_8", vlrVenda8);
        this.vlrVenda8 = vlrVenda8;
   }

   public BigDecimal getVlrVenda9() {
        return vlrVenda9;
   }

   public void setVlrVenda9(BigDecimal vlrVenda9) {
        markAsChanged("VLRVENDA_9", vlrVenda9);
        this.vlrVenda9 = vlrVenda9;
   }

   public BigDecimal getVlrVendiaUtil1() {
        return vlrVendiaUtil1;
   }

   public void setVlrVendiaUtil1(BigDecimal vlrVendiaUtil1) {
        markAsChanged("VLRVENDIAUTIL_1", vlrVendiaUtil1);
        this.vlrVendiaUtil1 = vlrVendiaUtil1;
   }

   public BigDecimal getVlrVendiaUtil10() {
        return vlrVendiaUtil10;
   }

   public void setVlrVendiaUtil10(BigDecimal vlrVendiaUtil10) {
        markAsChanged("VLRVENDIAUTIL_10", vlrVendiaUtil10);
        this.vlrVendiaUtil10 = vlrVendiaUtil10;
   }

   public BigDecimal getVlrVendiaUtil11() {
        return vlrVendiaUtil11;
   }

   public void setVlrVendiaUtil11(BigDecimal vlrVendiaUtil11) {
        markAsChanged("VLRVENDIAUTIL_11", vlrVendiaUtil11);
        this.vlrVendiaUtil11 = vlrVendiaUtil11;
   }

   public BigDecimal getVlrVendiaUtil12() {
        return vlrVendiaUtil12;
   }

   public void setVlrVendiaUtil12(BigDecimal vlrVendiaUtil12) {
        markAsChanged("VLRVENDIAUTIL_12", vlrVendiaUtil12);
        this.vlrVendiaUtil12 = vlrVendiaUtil12;
   }

   public BigDecimal getVlrVendiaUtil2() {
        return vlrVendiaUtil2;
   }

   public void setVlrVendiaUtil2(BigDecimal vlrVendiaUtil2) {
        markAsChanged("VLRVENDIAUTIL_2", vlrVendiaUtil2);
        this.vlrVendiaUtil2 = vlrVendiaUtil2;
   }

   public BigDecimal getVlrVendiaUtil3() {
        return vlrVendiaUtil3;
   }

   public void setVlrVendiaUtil3(BigDecimal vlrVendiaUtil3) {
        markAsChanged("VLRVENDIAUTIL_3", vlrVendiaUtil3);
        this.vlrVendiaUtil3 = vlrVendiaUtil3;
   }

   public BigDecimal getVlrVendiaUtil4() {
        return vlrVendiaUtil4;
   }

   public void setVlrVendiaUtil4(BigDecimal vlrVendiaUtil4) {
        markAsChanged("VLRVENDIAUTIL_4", vlrVendiaUtil4);
        this.vlrVendiaUtil4 = vlrVendiaUtil4;
   }

   public BigDecimal getVlrVendiaUtil5() {
        return vlrVendiaUtil5;
   }

   public void setVlrVendiaUtil5(BigDecimal vlrVendiaUtil5) {
        markAsChanged("VLRVENDIAUTIL_5", vlrVendiaUtil5);
        this.vlrVendiaUtil5 = vlrVendiaUtil5;
   }

   public BigDecimal getVlrVendiaUtil6() {
        return vlrVendiaUtil6;
   }

   public void setVlrVendiaUtil6(BigDecimal vlrVendiaUtil6) {
        markAsChanged("VLRVENDIAUTIL_6", vlrVendiaUtil6);
        this.vlrVendiaUtil6 = vlrVendiaUtil6;
   }

   public BigDecimal getVlrVendiaUtil7() {
        return vlrVendiaUtil7;
   }

   public void setVlrVendiaUtil7(BigDecimal vlrVendiaUtil7) {
        markAsChanged("VLRVENDIAUTIL_7", vlrVendiaUtil7);
        this.vlrVendiaUtil7 = vlrVendiaUtil7;
   }

   public BigDecimal getVlrVendiaUtil8() {
        return vlrVendiaUtil8;
   }

   public void setVlrVendiaUtil8(BigDecimal vlrVendiaUtil8) {
        markAsChanged("VLRVENDIAUTIL_8", vlrVendiaUtil8);
        this.vlrVendiaUtil8 = vlrVendiaUtil8;
   }

   public BigDecimal getVlrVendiaUtil9() {
        return vlrVendiaUtil9;
   }

   public void setVlrVendiaUtil9(BigDecimal vlrVendiaUtil9) {
        markAsChanged("VLRVENDIAUTIL_9", vlrVendiaUtil9);
        this.vlrVendiaUtil9 = vlrVendiaUtil9;
   }

   public String getCurvaTot5() {
        return curvaTot5;
   }

   public void setCurvaTot5(String curvaTot5) {
        markAsChanged("CURVATOT_5", curvaTot5);
        this.curvaTot5 = curvaTot5;
   }

   public BigDecimal getPartMargContFat1() {
        return partMargContFat1;
   }

   public void setPartMargContFat1(BigDecimal partMargContFat1) {
        markAsChanged("PARTMARGCONTFAT_1", partMargContFat1);
        this.partMargContFat1 = partMargContFat1;
   }

   public BigDecimal getPartMargContFat10() {
        return partMargContFat10;
   }

   public void setPartMargContFat10(BigDecimal partMargContFat10) {
        markAsChanged("PARTMARGCONTFAT_10", partMargContFat10);
        this.partMargContFat10 = partMargContFat10;
   }

   public BigDecimal getPartMargContFat11() {
        return partMargContFat11;
   }

   public void setPartMargContFat11(BigDecimal partMargContFat11) {
        markAsChanged("PARTMARGCONTFAT_11", partMargContFat11);
        this.partMargContFat11 = partMargContFat11;
   }

   public BigDecimal getPartMargContFat12() {
        return partMargContFat12;
   }

   public void setPartMargContFat12(BigDecimal partMargContFat12) {
        markAsChanged("PARTMARGCONTFAT_12", partMargContFat12);
        this.partMargContFat12 = partMargContFat12;
   }

   public BigDecimal getPartMargContFat2() {
        return partMargContFat2;
   }

   public void setPartMargContFat2(BigDecimal partMargContFat2) {
        markAsChanged("PARTMARGCONTFAT_2", partMargContFat2);
        this.partMargContFat2 = partMargContFat2;
   }

   public BigDecimal getVlrGastoVar3() {
        return vlrGastoVar3;
   }

   public void setVlrGastoVar3(BigDecimal vlrGastoVar3) {
        markAsChanged("VLRGASTOVAR_3", vlrGastoVar3);
        this.vlrGastoVar3 = vlrGastoVar3;
   }

   public BigDecimal getVlrGastoVar4() {
        return vlrGastoVar4;
   }

   public void setVlrGastoVar4(BigDecimal vlrGastoVar4) {
        markAsChanged("VLRGASTOVAR_4", vlrGastoVar4);
        this.vlrGastoVar4 = vlrGastoVar4;
   }

   public BigDecimal getVlrGastoVar5() {
        return vlrGastoVar5;
   }

   public void setVlrGastoVar5(BigDecimal vlrGastoVar5) {
        markAsChanged("VLRGASTOVAR_5", vlrGastoVar5);
        this.vlrGastoVar5 = vlrGastoVar5;
   }

   public BigDecimal getAcumPeso7() {
        return acumPeso7;
   }

   public void setAcumPeso7(BigDecimal acumPeso7) {
        markAsChanged("ACUMPESO_7", acumPeso7);
        this.acumPeso7 = acumPeso7;
   }

   public BigDecimal getAcumPeso8() {
        return acumPeso8;
   }

   public void setAcumPeso8(BigDecimal acumPeso8) {
        markAsChanged("ACUMPESO_8", acumPeso8);
        this.acumPeso8 = acumPeso8;
   }

   public BigDecimal getAcumPeso9() {
        return acumPeso9;
   }

   public void setAcumPeso9(BigDecimal acumPeso9) {
        markAsChanged("ACUMPESO_9", acumPeso9);
        this.acumPeso9 = acumPeso9;
   }

   public BigDecimal getAcumQtd1() {
        return acumQtd1;
   }

   public void setAcumQtd1(BigDecimal acumQtd1) {
        markAsChanged("ACUMQTD_1", acumQtd1);
        this.acumQtd1 = acumQtd1;
   }

   public BigDecimal getAcumQtd10() {
        return acumQtd10;
   }

   public void setAcumQtd10(BigDecimal acumQtd10) {
        markAsChanged("ACUMQTD_10", acumQtd10);
        this.acumQtd10 = acumQtd10;
   }

   public BigDecimal getAcumQtd11() {
        return acumQtd11;
   }

   public void setAcumQtd11(BigDecimal acumQtd11) {
        markAsChanged("ACUMQTD_11", acumQtd11);
        this.acumQtd11 = acumQtd11;
   }

   public BigDecimal getAcumQtd12() {
        return acumQtd12;
   }

   public void setAcumQtd12(BigDecimal acumQtd12) {
        markAsChanged("ACUMQTD_12", acumQtd12);
        this.acumQtd12 = acumQtd12;
   }

   public BigDecimal getAcumQtd2() {
        return acumQtd2;
   }

   public void setAcumQtd2(BigDecimal acumQtd2) {
        markAsChanged("ACUMQTD_2", acumQtd2);
        this.acumQtd2 = acumQtd2;
   }

   public BigDecimal getAcumQtd3() {
        return acumQtd3;
   }

   public void setAcumQtd3(BigDecimal acumQtd3) {
        markAsChanged("ACUMQTD_3", acumQtd3);
        this.acumQtd3 = acumQtd3;
   }

   public BigDecimal getAcumQtd4() {
        return acumQtd4;
   }

   public void setAcumQtd4(BigDecimal acumQtd4) {
        markAsChanged("ACUMQTD_4", acumQtd4);
        this.acumQtd4 = acumQtd4;
   }

   public BigDecimal getAcumQtd5() {
        return acumQtd5;
   }

   public void setAcumQtd5(BigDecimal acumQtd5) {
        markAsChanged("ACUMQTD_5", acumQtd5);
        this.acumQtd5 = acumQtd5;
   }

   public BigDecimal getAcumQtd6() {
        return acumQtd6;
   }

   public void setAcumQtd6(BigDecimal acumQtd6) {
        markAsChanged("ACUMQTD_6", acumQtd6);
        this.acumQtd6 = acumQtd6;
   }

   public BigDecimal getAcumQtd7() {
        return acumQtd7;
   }

   public void setAcumQtd7(BigDecimal acumQtd7) {
        markAsChanged("ACUMQTD_7", acumQtd7);
        this.acumQtd7 = acumQtd7;
   }

   public BigDecimal getAcumQtd8() {
        return acumQtd8;
   }

   public void setAcumQtd8(BigDecimal acumQtd8) {
        markAsChanged("ACUMQTD_8", acumQtd8);
        this.acumQtd8 = acumQtd8;
   }

   public BigDecimal getAcumQtd9() {
        return acumQtd9;
   }

   public void setAcumQtd9(BigDecimal acumQtd9) {
        markAsChanged("ACUMQTD_9", acumQtd9);
        this.acumQtd9 = acumQtd9;
   }

   public BigDecimal getAcumTot1() {
        return acumTot1;
   }

   public void setAcumTot1(BigDecimal acumTot1) {
        markAsChanged("ACUMTOT_1", acumTot1);
        this.acumTot1 = acumTot1;
   }

   public BigDecimal getAcumTot10() {
        return acumTot10;
   }

   public void setAcumTot10(BigDecimal acumTot10) {
        markAsChanged("ACUMTOT_10", acumTot10);
        this.acumTot10 = acumTot10;
   }

   public BigDecimal getAcumTot11() {
        return acumTot11;
   }

   public void setAcumTot11(BigDecimal acumTot11) {
        markAsChanged("ACUMTOT_11", acumTot11);
        this.acumTot11 = acumTot11;
   }

   public BigDecimal getAcumTot12() {
        return acumTot12;
   }

   public void setAcumTot12(BigDecimal acumTot12) {
        markAsChanged("ACUMTOT_12", acumTot12);
        this.acumTot12 = acumTot12;
   }

   public BigDecimal getAcumTot2() {
        return acumTot2;
   }

   public void setAcumTot2(BigDecimal acumTot2) {
        markAsChanged("ACUMTOT_2", acumTot2);
        this.acumTot2 = acumTot2;
   }

   public BigDecimal getAcumTot3() {
        return acumTot3;
   }

   public void setAcumTot3(BigDecimal acumTot3) {
        markAsChanged("ACUMTOT_3", acumTot3);
        this.acumTot3 = acumTot3;
   }

   public BigDecimal getAcumTot4() {
        return acumTot4;
   }

   public void setAcumTot4(BigDecimal acumTot4) {
        markAsChanged("ACUMTOT_4", acumTot4);
        this.acumTot4 = acumTot4;
   }

   public BigDecimal getAcumTot5() {
        return acumTot5;
   }

   public void setAcumTot5(BigDecimal acumTot5) {
        markAsChanged("ACUMTOT_5", acumTot5);
        this.acumTot5 = acumTot5;
   }

   public BigDecimal getAcumTot6() {
        return acumTot6;
   }

   public void setAcumTot6(BigDecimal acumTot6) {
        markAsChanged("ACUMTOT_6", acumTot6);
        this.acumTot6 = acumTot6;
   }

   public BigDecimal getAcumTot7() {
        return acumTot7;
   }

   public void setAcumTot7(BigDecimal acumTot7) {
        markAsChanged("ACUMTOT_7", acumTot7);
        this.acumTot7 = acumTot7;
   }

   public BigDecimal getAcumTot8() {
        return acumTot8;
   }

   public void setAcumTot8(BigDecimal acumTot8) {
        markAsChanged("ACUMTOT_8", acumTot8);
        this.acumTot8 = acumTot8;
   }

   public BigDecimal getAcumTot9() {
        return acumTot9;
   }

   public void setAcumTot9(BigDecimal acumTot9) {
        markAsChanged("ACUMTOT_9", acumTot9);
        this.acumTot9 = acumTot9;
   }

   public BigDecimal getAliqCred() {
        return aliqCred;
   }

   public void setAliqCred(BigDecimal aliqCred) {
        markAsChanged("ALIQCRED", aliqCred);
        this.aliqCred = aliqCred;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getMultipCpa() {
        return multipCpa;
   }

   public void setMultipCpa(BigDecimal multipCpa) {
        markAsChanged("MULTIPCPA", multipCpa);
        this.multipCpa = multipCpa;
   }

   public BigDecimal getSugCompraGirAjustado() {
        return sugCompraGirAjustado;
   }

   public void setSugCompraGirAjustado(BigDecimal sugCompraGirAjustado) {
        markAsChanged("SUGCOMPRAGIRAJUSTADO", sugCompraGirAjustado);
        this.sugCompraGirAjustado = sugCompraGirAjustado;
   }

   public BigDecimal getSugCompraGirAjustadoMultCpa() {
        return sugCompraGirAjustadoMultCpa;
   }

   public void setSugCompraGirAjustadoMultCpa(BigDecimal sugCompraGirAjustadoMultCpa) {
        markAsChanged("SUGCOMPRAGIRAJUSTADOMULTCPA", sugCompraGirAjustadoMultCpa);
        this.sugCompraGirAjustadoMultCpa = sugCompraGirAjustadoMultCpa;
   }

   public String getTemSugGiroAjustado() {
        return temSugGiroAjustado;
   }

   public void setTemSugGiroAjustado(String temSugGiroAjustado) {
        markAsChanged("TEMSUGGIROAJUSTADO", temSugGiroAjustado);
        this.temSugGiroAjustado = temSugGiroAjustado;
   }

   public String getUnPadrao() {
        return unPadrao;
   }

   public void setUnPadrao(String unPadrao) {
        markAsChanged("UNPADRAO", unPadrao);
        this.unPadrao = unPadrao;
   }

   public BigDecimal getSugCompraGirMultCpa() {
        return sugCompraGirMultCpa;
   }

   public void setSugCompraGirMultCpa(BigDecimal sugCompraGirMultCpa) {
        markAsChanged("SUGCOMPRAGIRMULTCPA", sugCompraGirMultCpa);
        this.sugCompraGirMultCpa = sugCompraGirMultCpa;
   }

   public BigDecimal getAcumMarg4() {
        return acumMarg4;
   }

   public void setAcumMarg4(BigDecimal acumMarg4) {
        markAsChanged("ACUMMARG_4", acumMarg4);
        this.acumMarg4 = acumMarg4;
   }

   public BigDecimal getAcumMarg5() {
        return acumMarg5;
   }

   public void setAcumMarg5(BigDecimal acumMarg5) {
        markAsChanged("ACUMMARG_5", acumMarg5);
        this.acumMarg5 = acumMarg5;
   }

   public BigDecimal getAcumMarg6() {
        return acumMarg6;
   }

   public void setAcumMarg6(BigDecimal acumMarg6) {
        markAsChanged("ACUMMARG_6", acumMarg6);
        this.acumMarg6 = acumMarg6;
   }

   public BigDecimal getAcumMarg7() {
        return acumMarg7;
   }

   public void setAcumMarg7(BigDecimal acumMarg7) {
        markAsChanged("ACUMMARG_7", acumMarg7);
        this.acumMarg7 = acumMarg7;
   }

   public BigDecimal getAcumMarg8() {
        return acumMarg8;
   }

   public void setAcumMarg8(BigDecimal acumMarg8) {
        markAsChanged("ACUMMARG_8", acumMarg8);
        this.acumMarg8 = acumMarg8;
   }

   public BigDecimal getAcumMarg11() {
        return acumMarg11;
   }

   public void setAcumMarg11(BigDecimal acumMarg11) {
        markAsChanged("ACUMMARG_11", acumMarg11);
        this.acumMarg11 = acumMarg11;
   }

   public BigDecimal getAcumMarg12() {
        return acumMarg12;
   }

   public void setAcumMarg12(BigDecimal acumMarg12) {
        markAsChanged("ACUMMARG_12", acumMarg12);
        this.acumMarg12 = acumMarg12;
   }

   public BigDecimal getAcumPeso11() {
        return acumPeso11;
   }

   public void setAcumPeso11(BigDecimal acumPeso11) {
        markAsChanged("ACUMPESO_11", acumPeso11);
        this.acumPeso11 = acumPeso11;
   }

   public BigDecimal getAcumPeso12() {
        return acumPeso12;
   }

   public void setAcumPeso12(BigDecimal acumPeso12) {
        markAsChanged("ACUMPESO_12", acumPeso12);
        this.acumPeso12 = acumPeso12;
   }

   public BigDecimal getAcumPeso2() {
        return acumPeso2;
   }

   public void setAcumPeso2(BigDecimal acumPeso2) {
        markAsChanged("ACUMPESO_2", acumPeso2);
        this.acumPeso2 = acumPeso2;
   }

   public BigDecimal getAcumPeso3() {
        return acumPeso3;
   }

   public void setAcumPeso3(BigDecimal acumPeso3) {
        markAsChanged("ACUMPESO_3", acumPeso3);
        this.acumPeso3 = acumPeso3;
   }

   public BigDecimal getSugCompraMultCpa() {
        return sugCompraMultCpa;
   }

   public void setSugCompraMultCpa(BigDecimal sugCompraMultCpa) {
        markAsChanged("SUGCOMPRAMULTCPA", sugCompraMultCpa);
        this.sugCompraMultCpa = sugCompraMultCpa;
   }

   public String getSugCpaGirAlterado() {
        return sugCpaGirAlterado;
   }

   public void setSugCpaGirAlterado(String sugCpaGirAlterado) {
        markAsChanged("SUGCPAGIRALTERADO", sugCpaGirAlterado);
        this.sugCpaGirAlterado = sugCpaGirAlterado;
   }

   public BigDecimal getPercDescFornecedor() {
        return percDescFornecedor;
   }

   public void setPercDescFornecedor(BigDecimal percDescFornecedor) {
        markAsChanged("PERCDESCFORNECEDOR", percDescFornecedor);
        this.percDescFornecedor = percDescFornecedor;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
        this.numCotacao = numCotacao;
   }

   public BigDecimal getWmsBloqueado() {
        return wmsBloqueado;
   }

   public void setWmsBloqueado(BigDecimal wmsBloqueado) {
        markAsChanged("WMSBLOQUEADO", wmsBloqueado);
        this.wmsBloqueado = wmsBloqueado;
   }

   public BigDecimal getAccumMarg_2() {
        return accumMarg_2;
   }

   public void setAccumMarg_2(BigDecimal accumMarg_2) {
        markAsChanged("ACUMMARG_2", accumMarg_2);
        this.accumMarg_2 = accumMarg_2;
   }

   public BigDecimal getAccumMarg_3() {
        return accumMarg_3;
   }

   public void setAccumMarg_3(BigDecimal accumMarg_3) {
        markAsChanged("ACUMMARG_3", accumMarg_3);
        this.accumMarg_3 = accumMarg_3;
   }

   public BigDecimal getDurEstPosCpAgir() {
        return durEstPosCpAgir;
   }

   public void setDurEstPosCpAgir(BigDecimal durEstPosCpAgir) {
        markAsChanged("DURESTPOSCPAGIR", durEstPosCpAgir);
        this.durEstPosCpAgir = durEstPosCpAgir;
   }

   public BigDecimal getDurEstSeg() {
        return durEstSeg;
   }

   public void setDurEstSeg(BigDecimal durEstSeg) {
        markAsChanged("DURESTSEG", durEstSeg);
        this.durEstSeg = durEstSeg;
   }

   public BigDecimal getDiasUteis() {
        return diasUteis;
   }

   public void setDiasUteis(BigDecimal diasUteis) {
        markAsChanged("DIASUTEIS", diasUteis);
        this.diasUteis = diasUteis;
   }

   public Timestamp getPrevEntrega() {
        return prevEntrega;
   }

   public void setPrevEntrega(Timestamp prevEntrega) {
        markAsChanged("PREVENTREGA", prevEntrega);
        this.prevEntrega = prevEntrega;
   }

   public BigDecimal getGiroDiario() {
        return giroDiario;
   }

   public void setGiroDiario(BigDecimal giroDiario) {
        markAsChanged("GIRODIARIO", giroDiario);
        this.giroDiario = giroDiario;
   }

   public Timestamp getPontoPed() {
        return pontoPed;
   }

   public void setPontoPed(Timestamp pontoPed) {
        markAsChanged("PONTOPED", pontoPed);
        this.pontoPed = pontoPed;
   }

   public BigDecimal getVlrUltCompra() {
        return vlrUltCompra;
   }

   public void setVlrUltCompra(BigDecimal vlrUltCompra) {
        markAsChanged("VLRULTCOMPRA", vlrUltCompra);
        this.vlrUltCompra = vlrUltCompra;
   }

   public String getPossuiFam() {
        return possuiFam;
   }

   public void setPossuiFam(String possuiFam) {
        markAsChanged("POSSUIFAM", possuiFam);
        this.possuiFam = possuiFam;
   }

   public BigDecimal getDiasRuptura() {
        return diasRuptura;
   }

   public void setDiasRuptura(BigDecimal diasRuptura) {
        markAsChanged("DIASRUPTURA", diasRuptura);
        this.diasRuptura = diasRuptura;
   }

   public BigDecimal getDiasRupturaEst_1() {
        return diasRupturaEst_1;
   }

   public void setDiasRupturaEst_1(BigDecimal diasRupturaEst_1) {
        markAsChanged("DIASRUPTURAEST_1", diasRupturaEst_1);
        this.diasRupturaEst_1 = diasRupturaEst_1;
   }

   public BigDecimal getDiasRupturaEst_10() {
        return diasRupturaEst_10;
   }

   public void setDiasRupturaEst_10(BigDecimal diasRupturaEst_10) {
        markAsChanged("DIASRUPTURAEST_10", diasRupturaEst_10);
        this.diasRupturaEst_10 = diasRupturaEst_10;
   }

   public BigDecimal getDiasRupturaEst_11() {
        return diasRupturaEst_11;
   }

   public void setDiasRupturaEst_11(BigDecimal diasRupturaEst_11) {
        markAsChanged("DIASRUPTURAEST_11", diasRupturaEst_11);
        this.diasRupturaEst_11 = diasRupturaEst_11;
   }

   public BigDecimal getDiasRupturaEst_12() {
        return diasRupturaEst_12;
   }

   public void setDiasRupturaEst_12(BigDecimal diasRupturaEst_12) {
        markAsChanged("DIASRUPTURAEST_12", diasRupturaEst_12);
        this.diasRupturaEst_12 = diasRupturaEst_12;
   }

   public BigDecimal getDiasRupturaEst_2() {
        return diasRupturaEst_2;
   }

   public void setDiasRupturaEst_2(BigDecimal diasRupturaEst_2) {
        markAsChanged("DIASRUPTURAEST_2", diasRupturaEst_2);
        this.diasRupturaEst_2 = diasRupturaEst_2;
   }

   public BigDecimal getDiasRupturaEst_3() {
        return diasRupturaEst_3;
   }

   public void setDiasRupturaEst_3(BigDecimal diasRupturaEst_3) {
        markAsChanged("DIASRUPTURAEST_3", diasRupturaEst_3);
        this.diasRupturaEst_3 = diasRupturaEst_3;
   }

   public BigDecimal getDiasRupturaEst_4() {
        return diasRupturaEst_4;
   }

   public void setDiasRupturaEst_4(BigDecimal diasRupturaEst_4) {
        markAsChanged("DIASRUPTURAEST_4", diasRupturaEst_4);
        this.diasRupturaEst_4 = diasRupturaEst_4;
   }

   public BigDecimal getDiasRupturaEst_5() {
        return diasRupturaEst_5;
   }

   public void setDiasRupturaEst_5(BigDecimal diasRupturaEst_5) {
        markAsChanged("DIASRUPTURAEST_5", diasRupturaEst_5);
        this.diasRupturaEst_5 = diasRupturaEst_5;
   }

   public BigDecimal getDiasRupturaEst_6() {
        return diasRupturaEst_6;
   }

   public void setDiasRupturaEst_6(BigDecimal diasRupturaEst_6) {
        markAsChanged("DIASRUPTURAEST_6", diasRupturaEst_6);
        this.diasRupturaEst_6 = diasRupturaEst_6;
   }

   public BigDecimal getDiasRupturaEst_7() {
        return diasRupturaEst_7;
   }

   public void setDiasRupturaEst_7(BigDecimal diasRupturaEst_7) {
        markAsChanged("DIASRUPTURAEST_7", diasRupturaEst_7);
        this.diasRupturaEst_7 = diasRupturaEst_7;
   }

   public BigDecimal getDiasRupturaEst_8() {
        return diasRupturaEst_8;
   }

   public void setDiasRupturaEst_8(BigDecimal diasRupturaEst_8) {
        markAsChanged("DIASRUPTURAEST_8", diasRupturaEst_8);
        this.diasRupturaEst_8 = diasRupturaEst_8;
   }

   public BigDecimal getDiasRupturaEst_9() {
        return diasRupturaEst_9;
   }

   public void setDiasRupturaEst_9(BigDecimal diasRupturaEst_9) {
        markAsChanged("DIASRUPTURAEST_9", diasRupturaEst_9);
        this.diasRupturaEst_9 = diasRupturaEst_9;
   }

   public BigDecimal getNumMps() {
        return numMps;
   }

   public void setNumMps(BigDecimal numMps) {
        markAsChanged("NUMMPS", numMps);
        this.numMps = numMps;
   }

   @Override
   public String getTableName() {
        return "TGFGIR";
   }

   @Override
   public String getEntityName() {
        return "GiroProduto";
   }

   @Override
   public GiroProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codRel = vo.asBigDecimal("CODREL");
        this.codVol = vo.asString("CODVOL");
        this.codVolCompra = vo.asString("CODVOLCOMPRA");
        this.complDesc = vo.asString("COMPLDESC");
        this.controlado = vo.asString("CONTROLADO");
        this.controle = vo.asString("CONTROLE");
        this.curvaMarg1 = vo.asString("CURVAMARG_1");
        this.curvaMarg10 = vo.asString("CURVAMARG_10");
        this.curvaMarg11 = vo.asString("CURVAMARG_11");
        this.curvaMarg12 = vo.asString("CURVAMARG_12");
        this.curvaMarg2 = vo.asString("CURVAMARG_2");
        this.curvaMarg3 = vo.asString("CURVAMARG_3");
        this.curvaMarg4 = vo.asString("CURVAMARG_4");
        this.curvaMarg5 = vo.asString("CURVAMARG_5");
        this.curvaMarg6 = vo.asString("CURVAMARG_6");
        this.curvaMarg7 = vo.asString("CURVAMARG_7");
        this.curvaMarg8 = vo.asString("CURVAMARG_8");
        this.curvaMarg9 = vo.asString("CURVAMARG_9");
        this.curvaPeso1 = vo.asString("CURVAPESO_1");
        this.curvaPeso10 = vo.asString("CURVAPESO_10");
        this.curvaPeso11 = vo.asString("CURVAPESO_11");
        this.curvaPeso12 = vo.asString("CURVAPESO_12");
        this.curvaPeso2 = vo.asString("CURVAPESO_2");
        this.curvaPeso3 = vo.asString("CURVAPESO_3");
        this.curvaPeso4 = vo.asString("CURVAPESO_4");
        this.curvaPeso5 = vo.asString("CURVAPESO_5");
        this.curvaPeso6 = vo.asString("CURVAPESO_6");
        this.curvaPeso7 = vo.asString("CURVAPESO_7");
        this.curvaPeso8 = vo.asString("CURVAPESO_8");
        this.curvaPeso9 = vo.asString("CURVAPESO_9");
        this.curvaQtd1 = vo.asString("CURVAQTD_1");
        this.curvaQtd10 = vo.asString("CURVAQTD_10");
        this.curvaQtd11 = vo.asString("CURVAQTD_11");
        this.curvaQtd12 = vo.asString("CURVAQTD_12");
        this.curvaQtd2 = vo.asString("CURVAQTD_2");
        this.curvaQtd3 = vo.asString("CURVAQTD_3");
        this.curvaQtd4 = vo.asString("CURVAQTD_4");
        this.curvaQtd5 = vo.asString("CURVAQTD_5");
        this.curvaQtd6 = vo.asString("CURVAQTD_6");
        this.curvaQtd7 = vo.asString("CURVAQTD_7");
        this.curvaQtd8 = vo.asString("CURVAQTD_8");
        this.curvaQtd9 = vo.asString("CURVAQTD_9");
        this.curvaTot1 = vo.asString("CURVATOT_1");
        this.curvaTot10 = vo.asString("CURVATOT_10");
        this.curvaTot11 = vo.asString("CURVATOT_11");
        this.curvaTot12 = vo.asString("CURVATOT_12");
        this.curvaTot2 = vo.asString("CURVATOT_2");
        this.curvaTot3 = vo.asString("CURVATOT_3");
        this.curvaTot4 = vo.asString("CURVATOT_4");
        this.ultCompra = vo.asTimestamp("ULTCOMPRA");
        this.ultVenda = vo.asTimestamp("ULTVENDA");
        this.vlrCredIcms = vo.asBigDecimal("VLRCREDICMS");
        this.vlrGastoVar1 = vo.asBigDecimal("VLRGASTOVAR_1");
        this.vlrGastoVar6 = vo.asBigDecimal("VLRGASTOVAR_6");
        this.vlrGastoVar7 = vo.asBigDecimal("VLRGASTOVAR_7");
        this.vlrGastoVar8 = vo.asBigDecimal("VLRGASTOVAR_8");
        this.vlrGastoVar9 = vo.asBigDecimal("VLRGASTOVAR_9");
        this.vlrMargCont1 = vo.asBigDecimal("VLRMARGCONT_1");
        this.vlrMargCont10 = vo.asBigDecimal("VLRMARGCONT_10");
        this.vlrMargCont11 = vo.asBigDecimal("VLRMARGCONT_11");
        this.vlrMargCont12 = vo.asBigDecimal("VLRMARGCONT_12");
        this.vlrMargCont2 = vo.asBigDecimal("VLRMARGCONT_2");
        this.vlrMargCont3 = vo.asBigDecimal("VLRMARGCONT_3");
        this.vlrMargCont4 = vo.asBigDecimal("VLRMARGCONT_4");
        this.vlrMargCont5 = vo.asBigDecimal("VLRMARGCONT_5");
        this.vlrMargCont6 = vo.asBigDecimal("VLRMARGCONT_6");
        this.vlrMargCont7 = vo.asBigDecimal("VLRMARGCONT_7");
        this.vlrMargCont8 = vo.asBigDecimal("VLRMARGCONT_8");
        this.vlrMargCont9 = vo.asBigDecimal("VLRMARGCONT_9");
        this.vlrTabPreco = vo.asBigDecimal("VLRTABPRECO");
        this.vlrTot1 = vo.asBigDecimal("VLRTOT_1");
        this.vlrTot10 = vo.asBigDecimal("VLRTOT_10");
        this.vlrTot11 = vo.asBigDecimal("VLRTOT_11");
        this.vlrTot12 = vo.asBigDecimal("VLRTOT_12");
        this.vlrTot2 = vo.asBigDecimal("VLRTOT_2");
        this.vlrTot3 = vo.asBigDecimal("VLRTOT_3");
        this.vlrTot4 = vo.asBigDecimal("VLRTOT_4");
        this.vlrTot5 = vo.asBigDecimal("VLRTOT_5");
        this.vlrTot6 = vo.asBigDecimal("VLRTOT_6");
        this.vlrTot7 = vo.asBigDecimal("VLRTOT_7");
        this.vlrTot8 = vo.asBigDecimal("VLRTOT_8");
        this.vlrTot9 = vo.asBigDecimal("VLRTOT_9");
        this.vlrUnit1 = vo.asBigDecimal("VLRUNIT_1");
        this.vlrUnit10 = vo.asBigDecimal("VLRUNIT_10");
        this.vlrUnit11 = vo.asBigDecimal("VLRUNIT_11");
        this.vlrUnit12 = vo.asBigDecimal("VLRUNIT_12");
        this.vlrUnit2 = vo.asBigDecimal("VLRUNIT_2");
        this.vlrUnit3 = vo.asBigDecimal("VLRUNIT_3");
        this.vlrUnit4 = vo.asBigDecimal("VLRUNIT_4");
        this.vlrUnit5 = vo.asBigDecimal("VLRUNIT_5");
        this.vlrUnit6 = vo.asBigDecimal("VLRUNIT_6");
        this.acumPeso4 = vo.asBigDecimal("ACUMPESO_4");
        this.acumPeso5 = vo.asBigDecimal("ACUMPESO_5");
        this.acumPeso6 = vo.asBigDecimal("ACUMPESO_6");
        this.popularidade7 = vo.asBigDecimal("POPULARIDADE_7");
        this.popularidade8 = vo.asBigDecimal("POPULARIDADE_8");
        this.popularidade9 = vo.asBigDecimal("POPULARIDADE_9");
        this.accumMarg9 = vo.asBigDecimal("ACUMMARG_9");
        this.accumPeso1 = vo.asBigDecimal("ACUMPESO_1");
        this.accumPeso10 = vo.asBigDecimal("ACUMPESO_10");
        this.estMax = vo.asBigDecimal("ESTMAX");
        this.custoVenda12 = vo.asBigDecimal("CUSTOVENDA_12");
        this.custoVenda2 = vo.asBigDecimal("CUSTOVENDA_2");
        this.custoVenda3 = vo.asBigDecimal("CUSTOVENDA_3");
        this.custoVenda4 = vo.asBigDecimal("CUSTOVENDA_4");
        this.custoVenda5 = vo.asBigDecimal("CUSTOVENDA_5");
        this.vlrGastoVar10 = vo.asBigDecimal("VLRGASTOVAR_10");
        this.vlrGastoVar11 = vo.asBigDecimal("VLRGASTOVAR_11");
        this.vlrGastoVar12 = vo.asBigDecimal("VLRGASTOVAR_12");
        this.vlrGastoVar2 = vo.asBigDecimal("VLRGASTOVAR_2");
        this.sugCompra = vo.asBigDecimal("SUGCOMPRA");
        this.sugCompraGir = vo.asBigDecimal("SUGCOMPRAGIR");
        this.termoLabil = vo.asString("TERMOLABIL");
        this.custoVndTotal8 = vo.asBigDecimal("CUSTOVNDTOTAL_8");
        this.custoVndTotal9 = vo.asBigDecimal("CUSTOVNDTOTAL_9");
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
        this.lucro1 = vo.asBigDecimal("LUCRO_1");
        this.lucro10 = vo.asBigDecimal("LUCRO_10");
        this.lucro11 = vo.asBigDecimal("LUCRO_11");
        this.lucro12 = vo.asBigDecimal("LUCRO_12");
        this.lucro2 = vo.asBigDecimal("LUCRO_2");
        this.lucro3 = vo.asBigDecimal("LUCRO_3");
        this.lucro4 = vo.asBigDecimal("LUCRO_4");
        this.lucro5 = vo.asBigDecimal("LUCRO_5");
        this.lucro6 = vo.asBigDecimal("LUCRO_6");
        this.lucro7 = vo.asBigDecimal("LUCRO_7");
        this.lucro8 = vo.asBigDecimal("LUCRO_8");
        this.lucro9 = vo.asBigDecimal("LUCRO_9");
        this.marca = vo.asString("MARCA");
        this.markup = vo.asBigDecimal("MARKUP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.oneroso = vo.asString("ONEROSO");
        this.ordemMedida = vo.asBigDecimal("ORDEMMEDIDA");
        this.partEstoque = vo.asBigDecimal("PARTESTOQUE");
        this.partGasVarFat1 = vo.asBigDecimal("PARTGASVARFAT_1");
        this.partGasVarFat10 = vo.asBigDecimal("PARTGASVARFAT_10");
        this.partGasVarFat11 = vo.asBigDecimal("PARTGASVARFAT_11");
        this.partGasVarFat12 = vo.asBigDecimal("PARTGASVARFAT_12");
        this.partGasVarFat2 = vo.asBigDecimal("PARTGASVARFAT_2");
        this.partGasVarFat3 = vo.asBigDecimal("PARTGASVARFAT_3");
        this.partGasVarFat4 = vo.asBigDecimal("PARTGASVARFAT_4");
        this.partGasVarFat5 = vo.asBigDecimal("PARTGASVARFAT_5");
        this.partGasVarFat6 = vo.asBigDecimal("PARTGASVARFAT_6");
        this.partGasVarFat7 = vo.asBigDecimal("PARTGASVARFAT_7");
        this.partGasVarFat8 = vo.asBigDecimal("PARTGASVARFAT_8");
        this.partGasVarFat9 = vo.asBigDecimal("PARTGASVARFAT_9");
        this.partGasVar1 = vo.asBigDecimal("PARTGASVAR_1");
        this.partGasVar10 = vo.asBigDecimal("PARTGASVAR_10");
        this.partGasVar11 = vo.asBigDecimal("PARTGASVAR_11");
        this.partGasVar12 = vo.asBigDecimal("PARTGASVAR_12");
        this.partGasVar2 = vo.asBigDecimal("PARTGASVAR_2");
        this.partGasVar3 = vo.asBigDecimal("PARTGASVAR_3");
        this.partGasVar4 = vo.asBigDecimal("PARTGASVAR_4");
        this.partGasVar5 = vo.asBigDecimal("PARTGASVAR_5");
        this.partGasVar6 = vo.asBigDecimal("PARTGASVAR_6");
        this.partGasVar7 = vo.asBigDecimal("PARTGASVAR_7");
        this.partGasVar8 = vo.asBigDecimal("PARTGASVAR_8");
        this.partGasVar9 = vo.asBigDecimal("PARTGASVAR_9");
        this.partLucro1 = vo.asBigDecimal("PARTLUCRO_1");
        this.partLucro10 = vo.asBigDecimal("PARTLUCRO_10");
        this.partLucro11 = vo.asBigDecimal("PARTLUCRO_11");
        this.partLucro12 = vo.asBigDecimal("PARTLUCRO_12");
        this.partLucro2 = vo.asBigDecimal("PARTLUCRO_2");
        this.partLucro3 = vo.asBigDecimal("PARTLUCRO_3");
        this.partLucro4 = vo.asBigDecimal("PARTLUCRO_4");
        this.partLucro5 = vo.asBigDecimal("PARTLUCRO_5");
        this.prodFalta = vo.asString("PRODFALTA");
        this.qtdMaxima = vo.asBigDecimal("QTDMAXIMA");
        this.qtdMedia = vo.asBigDecimal("QTDMEDIA");
        this.partLucro6 = vo.asBigDecimal("PARTLUCRO_6");
        this.partLucro7 = vo.asBigDecimal("PARTLUCRO_7");
        this.partLucro8 = vo.asBigDecimal("PARTLUCRO_8");
        this.partLucro9 = vo.asBigDecimal("PARTLUCRO_9");
        this.referencia = vo.asString("REFERENCIA");
        this.refForn = vo.asString("REFFORN");
        this.refMercMed = vo.asString("REFMERCMED");
        this.statusMed = vo.asBigDecimal("STATUSMED");
        this.sugCompCustGer = vo.asBigDecimal("SUGCOMPCUSTGER");
        this.curvaTot6 = vo.asString("CURVATOT_6");
        this.curvaTot7 = vo.asString("CURVATOT_7");
        this.curvaTot8 = vo.asString("CURVATOT_8");
        this.curvaTot9 = vo.asString("CURVATOT_9");
        this.custoGer = vo.asBigDecimal("CUSTOGER");
        this.custoRep = vo.asBigDecimal("CUSTOREP");
        this.custoVenda1 = vo.asBigDecimal("CUSTOVENDA_1");
        this.partMargContFat5 = vo.asBigDecimal("PARTMARGCONTFAT_5");
        this.partMargContFat6 = vo.asBigDecimal("PARTMARGCONTFAT_6");
        this.partMargContFat7 = vo.asBigDecimal("PARTMARGCONTFAT_7");
        this.partMargContFat8 = vo.asBigDecimal("PARTMARGCONTFAT_8");
        this.partMargContFat9 = vo.asBigDecimal("PARTMARGCONTFAT_9");
        this.partMargCont1 = vo.asBigDecimal("PARTMARGCONT_1");
        this.partMargCont10 = vo.asBigDecimal("PARTMARGCONT_10");
        this.partMargCont11 = vo.asBigDecimal("PARTMARGCONT_11");
        this.partMargCont12 = vo.asBigDecimal("PARTMARGCONT_12");
        this.partMargCont2 = vo.asBigDecimal("PARTMARGCONT_2");
        this.partMargCont3 = vo.asBigDecimal("PARTMARGCONT_3");
        this.partMargCont4 = vo.asBigDecimal("PARTMARGCONT_4");
        this.partMargCont5 = vo.asBigDecimal("PARTMARGCONT_5");
        this.partMargCont6 = vo.asBigDecimal("PARTMARGCONT_6");
        this.partMargCont7 = vo.asBigDecimal("PARTMARGCONT_7");
        this.partMargCont8 = vo.asBigDecimal("PARTMARGCONT_8");
        this.partMargCont9 = vo.asBigDecimal("PARTMARGCONT_9");
        this.partPeso1 = vo.asBigDecimal("PARTPESO_1");
        this.acumMarg1 = vo.asBigDecimal("ACUMMARG_1");
        this.acumMarg10 = vo.asBigDecimal("ACUMMARG_10");
        this.qtdMinima = vo.asBigDecimal("QTDMINIMA");
        this.qtdTotal = vo.asBigDecimal("QTDTOTAL");
        this.qtdUltCompra = vo.asBigDecimal("QTDULTCOMPRA");
        this.partPeso10 = vo.asBigDecimal("PARTPESO_10");
        this.partPeso11 = vo.asBigDecimal("PARTPESO_11");
        this.partPeso12 = vo.asBigDecimal("PARTPESO_12");
        this.partPeso2 = vo.asBigDecimal("PARTPESO_2");
        this.partPeso3 = vo.asBigDecimal("PARTPESO_3");
        this.partPeso4 = vo.asBigDecimal("PARTPESO_4");
        this.partPeso5 = vo.asBigDecimal("PARTPESO_5");
        this.partPeso6 = vo.asBigDecimal("PARTPESO_6");
        this.partPeso7 = vo.asBigDecimal("PARTPESO_7");
        this.partPeso8 = vo.asBigDecimal("PARTPESO_8");
        this.partPeso9 = vo.asBigDecimal("PARTPESO_9");
        this.partQtde1 = vo.asBigDecimal("PARTQTDE_1");
        this.partQtde10 = vo.asBigDecimal("PARTQTDE_10");
        this.partQtde11 = vo.asBigDecimal("PARTQTDE_11");
        this.partQtde12 = vo.asBigDecimal("PARTQTDE_12");
        this.partQtde2 = vo.asBigDecimal("PARTQTDE_2");
        this.partQtde3 = vo.asBigDecimal("PARTQTDE_3");
        this.partQtde4 = vo.asBigDecimal("PARTQTDE_4");
        this.partQtde5 = vo.asBigDecimal("PARTQTDE_5");
        this.partQtde6 = vo.asBigDecimal("PARTQTDE_6");
        this.partQtde7 = vo.asBigDecimal("PARTQTDE_7");
        this.partQtde8 = vo.asBigDecimal("PARTQTDE_8");
        this.partQtde9 = vo.asBigDecimal("PARTQTDE_9");
        this.partTotPer1 = vo.asBigDecimal("PARTTOTPER_1");
        this.partTotPer10 = vo.asBigDecimal("PARTTOTPER_10");
        this.partTotPer11 = vo.asBigDecimal("PARTTOTPER_11");
        this.partTotPer12 = vo.asBigDecimal("PARTTOTPER_12");
        this.partTotPer2 = vo.asBigDecimal("PARTTOTPER_2");
        this.partTotPer3 = vo.asBigDecimal("PARTTOTPER_3");
        this.partTotPer4 = vo.asBigDecimal("PARTTOTPER_4");
        this.partTotPer5 = vo.asBigDecimal("PARTTOTPER_5");
        this.partTotPer6 = vo.asBigDecimal("PARTTOTPER_6");
        this.partTotPer7 = vo.asBigDecimal("PARTTOTPER_7");
        this.partTotPer8 = vo.asBigDecimal("PARTTOTPER_8");
        this.partTotPer9 = vo.asBigDecimal("PARTTOTPER_9");
        this.pedCpApend = vo.asBigDecimal("PEDCPAPEND");
        this.pedVdApend = vo.asBigDecimal("PEDVDAPEND");
        this.perLucro1 = vo.asBigDecimal("PERLUCRO_1");
        this.perLucro10 = vo.asBigDecimal("PERLUCRO_10");
        this.perLucro11 = vo.asBigDecimal("PERLUCRO_11");
        this.perLucro12 = vo.asBigDecimal("PERLUCRO_12");
        this.perLucro2 = vo.asBigDecimal("PERLUCRO_2");
        this.perLucro3 = vo.asBigDecimal("PERLUCRO_3");
        this.perLucro4 = vo.asBigDecimal("PERLUCRO_4");
        this.perLucro5 = vo.asBigDecimal("PERLUCRO_5");
        this.perLucro6 = vo.asBigDecimal("PERLUCRO_6");
        this.perLucro7 = vo.asBigDecimal("PERLUCRO_7");
        this.perLucro8 = vo.asBigDecimal("PERLUCRO_8");
        this.perLucro9 = vo.asBigDecimal("PERLUCRO_9");
        this.peso1 = vo.asBigDecimal("PESO_1");
        this.peso10 = vo.asBigDecimal("PESO_10");
        this.peso11 = vo.asBigDecimal("PESO_11");
        this.peso12 = vo.asBigDecimal("PESO_12");
        this.peso2 = vo.asBigDecimal("PESO_2");
        this.peso3 = vo.asBigDecimal("PESO_3");
        this.peso4 = vo.asBigDecimal("PESO_4");
        this.peso5 = vo.asBigDecimal("PESO_5");
        this.peso6 = vo.asBigDecimal("PESO_6");
        this.peso7 = vo.asBigDecimal("PESO_7");
        this.peso8 = vo.asBigDecimal("PESO_8");
        this.peso9 = vo.asBigDecimal("PESO_9");
        this.popTotal = vo.asBigDecimal("POPTOTAL");
        this.popularidade1 = vo.asBigDecimal("POPULARIDADE_1");
        this.popularidade10 = vo.asBigDecimal("POPULARIDADE_10");
        this.popularidade11 = vo.asBigDecimal("POPULARIDADE_11");
        this.popularidade12 = vo.asBigDecimal("POPULARIDADE_12");
        this.popularidade2 = vo.asBigDecimal("POPULARIDADE_2");
        this.popularidade3 = vo.asBigDecimal("POPULARIDADE_3");
        this.popularidade4 = vo.asBigDecimal("POPULARIDADE_4");
        this.popularidade5 = vo.asBigDecimal("POPULARIDADE_5");
        this.partMargContFat3 = vo.asBigDecimal("PARTMARGCONTFAT_3");
        this.partMargContFat4 = vo.asBigDecimal("PARTMARGCONTFAT_4");
        this.custoVenda6 = vo.asBigDecimal("CUSTOVENDA_6");
        this.custoVenda7 = vo.asBigDecimal("CUSTOVENDA_7");
        this.custoVenda8 = vo.asBigDecimal("CUSTOVENDA_8");
        this.custoVenda9 = vo.asBigDecimal("CUSTOVENDA_9");
        this.custoVndTotal1 = vo.asBigDecimal("CUSTOVNDTOTAL_1");
        this.custoVndTotal10 = vo.asBigDecimal("CUSTOVNDTOTAL_10");
        this.custoVndTotal11 = vo.asBigDecimal("CUSTOVNDTOTAL_11");
        this.custoVndTotal12 = vo.asBigDecimal("CUSTOVNDTOTAL_12");
        this.custoVndTotal2 = vo.asBigDecimal("CUSTOVNDTOTAL_2");
        this.custoVndTotal3 = vo.asBigDecimal("CUSTOVNDTOTAL_3");
        this.custoVndTotal4 = vo.asBigDecimal("CUSTOVNDTOTAL_4");
        this.custoVndTotal5 = vo.asBigDecimal("CUSTOVNDTOTAL_5");
        this.custoVndTotal6 = vo.asBigDecimal("CUSTOVNDTOTAL_6");
        this.custoVndTotal7 = vo.asBigDecimal("CUSTOVNDTOTAL_7");
        this.custoVenda10 = vo.asBigDecimal("CUSTOVENDA_10");
        this.custoVenda11 = vo.asBigDecimal("CUSTOVENDA_11");
        this.popularidade6 = vo.asBigDecimal("POPULARIDADE_6");
        this.vlrUnit7 = vo.asBigDecimal("VLRUNIT_7");
        this.vlrUnit8 = vo.asBigDecimal("VLRUNIT_8");
        this.vlrUnit9 = vo.asBigDecimal("VLRUNIT_9");
        this.vlrVenda1 = vo.asBigDecimal("VLRVENDA_1");
        this.vlrVenda10 = vo.asBigDecimal("VLRVENDA_10");
        this.vlrVenda11 = vo.asBigDecimal("VLRVENDA_11");
        this.vlrVenda12 = vo.asBigDecimal("VLRVENDA_12");
        this.vlrVenda2 = vo.asBigDecimal("VLRVENDA_2");
        this.vlrVenda3 = vo.asBigDecimal("VLRVENDA_3");
        this.vlrVenda4 = vo.asBigDecimal("VLRVENDA_4");
        this.vlrVenda5 = vo.asBigDecimal("VLRVENDA_5");
        this.vlrVenda6 = vo.asBigDecimal("VLRVENDA_6");
        this.vlrVenda7 = vo.asBigDecimal("VLRVENDA_7");
        this.vlrVenda8 = vo.asBigDecimal("VLRVENDA_8");
        this.vlrVenda9 = vo.asBigDecimal("VLRVENDA_9");
        this.vlrVendiaUtil1 = vo.asBigDecimal("VLRVENDIAUTIL_1");
        this.vlrVendiaUtil10 = vo.asBigDecimal("VLRVENDIAUTIL_10");
        this.vlrVendiaUtil11 = vo.asBigDecimal("VLRVENDIAUTIL_11");
        this.vlrVendiaUtil12 = vo.asBigDecimal("VLRVENDIAUTIL_12");
        this.vlrVendiaUtil2 = vo.asBigDecimal("VLRVENDIAUTIL_2");
        this.vlrVendiaUtil3 = vo.asBigDecimal("VLRVENDIAUTIL_3");
        this.vlrVendiaUtil4 = vo.asBigDecimal("VLRVENDIAUTIL_4");
        this.vlrVendiaUtil5 = vo.asBigDecimal("VLRVENDIAUTIL_5");
        this.vlrVendiaUtil6 = vo.asBigDecimal("VLRVENDIAUTIL_6");
        this.vlrVendiaUtil7 = vo.asBigDecimal("VLRVENDIAUTIL_7");
        this.vlrVendiaUtil8 = vo.asBigDecimal("VLRVENDIAUTIL_8");
        this.vlrVendiaUtil9 = vo.asBigDecimal("VLRVENDIAUTIL_9");
        this.curvaTot5 = vo.asString("CURVATOT_5");
        this.partMargContFat1 = vo.asBigDecimal("PARTMARGCONTFAT_1");
        this.partMargContFat10 = vo.asBigDecimal("PARTMARGCONTFAT_10");
        this.partMargContFat11 = vo.asBigDecimal("PARTMARGCONTFAT_11");
        this.partMargContFat12 = vo.asBigDecimal("PARTMARGCONTFAT_12");
        this.partMargContFat2 = vo.asBigDecimal("PARTMARGCONTFAT_2");
        this.vlrGastoVar3 = vo.asBigDecimal("VLRGASTOVAR_3");
        this.vlrGastoVar4 = vo.asBigDecimal("VLRGASTOVAR_4");
        this.vlrGastoVar5 = vo.asBigDecimal("VLRGASTOVAR_5");
        this.acumPeso7 = vo.asBigDecimal("ACUMPESO_7");
        this.acumPeso8 = vo.asBigDecimal("ACUMPESO_8");
        this.acumPeso9 = vo.asBigDecimal("ACUMPESO_9");
        this.acumQtd1 = vo.asBigDecimal("ACUMQTD_1");
        this.acumQtd10 = vo.asBigDecimal("ACUMQTD_10");
        this.acumQtd11 = vo.asBigDecimal("ACUMQTD_11");
        this.acumQtd12 = vo.asBigDecimal("ACUMQTD_12");
        this.acumQtd2 = vo.asBigDecimal("ACUMQTD_2");
        this.acumQtd3 = vo.asBigDecimal("ACUMQTD_3");
        this.acumQtd4 = vo.asBigDecimal("ACUMQTD_4");
        this.acumQtd5 = vo.asBigDecimal("ACUMQTD_5");
        this.acumQtd6 = vo.asBigDecimal("ACUMQTD_6");
        this.acumQtd7 = vo.asBigDecimal("ACUMQTD_7");
        this.acumQtd8 = vo.asBigDecimal("ACUMQTD_8");
        this.acumQtd9 = vo.asBigDecimal("ACUMQTD_9");
        this.acumTot1 = vo.asBigDecimal("ACUMTOT_1");
        this.acumTot10 = vo.asBigDecimal("ACUMTOT_10");
        this.acumTot11 = vo.asBigDecimal("ACUMTOT_11");
        this.acumTot12 = vo.asBigDecimal("ACUMTOT_12");
        this.acumTot2 = vo.asBigDecimal("ACUMTOT_2");
        this.acumTot3 = vo.asBigDecimal("ACUMTOT_3");
        this.acumTot4 = vo.asBigDecimal("ACUMTOT_4");
        this.acumTot5 = vo.asBigDecimal("ACUMTOT_5");
        this.acumTot6 = vo.asBigDecimal("ACUMTOT_6");
        this.acumTot7 = vo.asBigDecimal("ACUMTOT_7");
        this.acumTot8 = vo.asBigDecimal("ACUMTOT_8");
        this.acumTot9 = vo.asBigDecimal("ACUMTOT_9");
        this.aliqCred = vo.asBigDecimal("ALIQCRED");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.multipCpa = vo.asBigDecimal("MULTIPCPA");
        this.sugCompraGirAjustado = vo.asBigDecimal("SUGCOMPRAGIRAJUSTADO");
        this.sugCompraGirAjustadoMultCpa = vo.asBigDecimal("SUGCOMPRAGIRAJUSTADOMULTCPA");
        this.temSugGiroAjustado = vo.asString("TEMSUGGIROAJUSTADO");
        this.unPadrao = vo.asString("UNPADRAO");
        this.sugCompraGirMultCpa = vo.asBigDecimal("SUGCOMPRAGIRMULTCPA");
        this.acumMarg4 = vo.asBigDecimal("ACUMMARG_4");
        this.acumMarg5 = vo.asBigDecimal("ACUMMARG_5");
        this.acumMarg6 = vo.asBigDecimal("ACUMMARG_6");
        this.acumMarg7 = vo.asBigDecimal("ACUMMARG_7");
        this.acumMarg8 = vo.asBigDecimal("ACUMMARG_8");
        this.acumMarg11 = vo.asBigDecimal("ACUMMARG_11");
        this.acumMarg12 = vo.asBigDecimal("ACUMMARG_12");
        this.acumPeso11 = vo.asBigDecimal("ACUMPESO_11");
        this.acumPeso12 = vo.asBigDecimal("ACUMPESO_12");
        this.acumPeso2 = vo.asBigDecimal("ACUMPESO_2");
        this.acumPeso3 = vo.asBigDecimal("ACUMPESO_3");
        this.sugCompraMultCpa = vo.asBigDecimal("SUGCOMPRAMULTCPA");
        this.sugCpaGirAlterado = vo.asString("SUGCPAGIRALTERADO");
        this.percDescFornecedor = vo.asBigDecimal("PERCDESCFORNECEDOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.wmsBloqueado = vo.asBigDecimal("WMSBLOQUEADO");
        this.accumMarg_2 = vo.asBigDecimal("ACUMMARG_2");
        this.accumMarg_3 = vo.asBigDecimal("ACUMMARG_3");
        this.durEstPosCpAgir = vo.asBigDecimal("DURESTPOSCPAGIR");
        this.durEstSeg = vo.asBigDecimal("DURESTSEG");
        this.diasUteis = vo.asBigDecimal("DIASUTEIS");
        this.prevEntrega = vo.asTimestamp("PREVENTREGA");
        this.giroDiario = vo.asBigDecimal("GIRODIARIO");
        this.pontoPed = vo.asTimestamp("PONTOPED");
        this.vlrUltCompra = vo.asBigDecimal("VLRULTCOMPRA");
        this.possuiFam = vo.asString("POSSUIFAM");
        this.diasRuptura = vo.asBigDecimal("DIASRUPTURA");
        this.diasRupturaEst_1 = vo.asBigDecimal("DIASRUPTURAEST_1");
        this.diasRupturaEst_10 = vo.asBigDecimal("DIASRUPTURAEST_10");
        this.diasRupturaEst_11 = vo.asBigDecimal("DIASRUPTURAEST_11");
        this.diasRupturaEst_12 = vo.asBigDecimal("DIASRUPTURAEST_12");
        this.diasRupturaEst_2 = vo.asBigDecimal("DIASRUPTURAEST_2");
        this.diasRupturaEst_3 = vo.asBigDecimal("DIASRUPTURAEST_3");
        this.diasRupturaEst_4 = vo.asBigDecimal("DIASRUPTURAEST_4");
        this.diasRupturaEst_5 = vo.asBigDecimal("DIASRUPTURAEST_5");
        this.diasRupturaEst_6 = vo.asBigDecimal("DIASRUPTURAEST_6");
        this.diasRupturaEst_7 = vo.asBigDecimal("DIASRUPTURAEST_7");
        this.diasRupturaEst_8 = vo.asBigDecimal("DIASRUPTURAEST_8");
        this.diasRupturaEst_9 = vo.asBigDecimal("DIASRUPTURAEST_9");
        this.numMps = vo.asBigDecimal("NUMMPS");
        return this;
   }
}
