package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GiroProduto extends AbstractSankhyaEntity<GiroProduto> {
   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParcForn() {
        return this.getVo().asBigDecimal("CODPARCFORN");
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodRel() {
        return this.getVo().asBigDecimal("CODREL");
   }

   public void setCodRel(BigDecimal codRel) {
        markAsChanged("CODREL", codRel);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getCodVolCompra() {
        return this.getVo().asString("CODVOLCOMPRA");
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public String getControlado() {
        return this.getVo().asString("CONTROLADO");
   }

   public void setControlado(String controlado) {
        markAsChanged("CONTROLADO", controlado);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCurvaMarg1() {
        return this.getVo().asString("CURVAMARG_1");
   }

   public void setCurvaMarg1(String curvaMarg1) {
        markAsChanged("CURVAMARG_1", curvaMarg1);
   }

   public String getCurvaMarg10() {
        return this.getVo().asString("CURVAMARG_10");
   }

   public void setCurvaMarg10(String curvaMarg10) {
        markAsChanged("CURVAMARG_10", curvaMarg10);
   }

   public String getCurvaMarg11() {
        return this.getVo().asString("CURVAMARG_11");
   }

   public void setCurvaMarg11(String curvaMarg11) {
        markAsChanged("CURVAMARG_11", curvaMarg11);
   }

   public String getCurvaMarg12() {
        return this.getVo().asString("CURVAMARG_12");
   }

   public void setCurvaMarg12(String curvaMarg12) {
        markAsChanged("CURVAMARG_12", curvaMarg12);
   }

   public String getCurvaMarg2() {
        return this.getVo().asString("CURVAMARG_2");
   }

   public void setCurvaMarg2(String curvaMarg2) {
        markAsChanged("CURVAMARG_2", curvaMarg2);
   }

   public String getCurvaMarg3() {
        return this.getVo().asString("CURVAMARG_3");
   }

   public void setCurvaMarg3(String curvaMarg3) {
        markAsChanged("CURVAMARG_3", curvaMarg3);
   }

   public String getCurvaMarg4() {
        return this.getVo().asString("CURVAMARG_4");
   }

   public void setCurvaMarg4(String curvaMarg4) {
        markAsChanged("CURVAMARG_4", curvaMarg4);
   }

   public String getCurvaMarg5() {
        return this.getVo().asString("CURVAMARG_5");
   }

   public void setCurvaMarg5(String curvaMarg5) {
        markAsChanged("CURVAMARG_5", curvaMarg5);
   }

   public String getCurvaMarg6() {
        return this.getVo().asString("CURVAMARG_6");
   }

   public void setCurvaMarg6(String curvaMarg6) {
        markAsChanged("CURVAMARG_6", curvaMarg6);
   }

   public String getCurvaMarg7() {
        return this.getVo().asString("CURVAMARG_7");
   }

   public void setCurvaMarg7(String curvaMarg7) {
        markAsChanged("CURVAMARG_7", curvaMarg7);
   }

   public String getCurvaMarg8() {
        return this.getVo().asString("CURVAMARG_8");
   }

   public void setCurvaMarg8(String curvaMarg8) {
        markAsChanged("CURVAMARG_8", curvaMarg8);
   }

   public String getCurvaMarg9() {
        return this.getVo().asString("CURVAMARG_9");
   }

   public void setCurvaMarg9(String curvaMarg9) {
        markAsChanged("CURVAMARG_9", curvaMarg9);
   }

   public String getCurvaPeso1() {
        return this.getVo().asString("CURVAPESO_1");
   }

   public void setCurvaPeso1(String curvaPeso1) {
        markAsChanged("CURVAPESO_1", curvaPeso1);
   }

   public String getCurvaPeso10() {
        return this.getVo().asString("CURVAPESO_10");
   }

   public void setCurvaPeso10(String curvaPeso10) {
        markAsChanged("CURVAPESO_10", curvaPeso10);
   }

   public String getCurvaPeso11() {
        return this.getVo().asString("CURVAPESO_11");
   }

   public void setCurvaPeso11(String curvaPeso11) {
        markAsChanged("CURVAPESO_11", curvaPeso11);
   }

   public String getCurvaPeso12() {
        return this.getVo().asString("CURVAPESO_12");
   }

   public void setCurvaPeso12(String curvaPeso12) {
        markAsChanged("CURVAPESO_12", curvaPeso12);
   }

   public String getCurvaPeso2() {
        return this.getVo().asString("CURVAPESO_2");
   }

   public void setCurvaPeso2(String curvaPeso2) {
        markAsChanged("CURVAPESO_2", curvaPeso2);
   }

   public String getCurvaPeso3() {
        return this.getVo().asString("CURVAPESO_3");
   }

   public void setCurvaPeso3(String curvaPeso3) {
        markAsChanged("CURVAPESO_3", curvaPeso3);
   }

   public String getCurvaPeso4() {
        return this.getVo().asString("CURVAPESO_4");
   }

   public void setCurvaPeso4(String curvaPeso4) {
        markAsChanged("CURVAPESO_4", curvaPeso4);
   }

   public String getCurvaPeso5() {
        return this.getVo().asString("CURVAPESO_5");
   }

   public void setCurvaPeso5(String curvaPeso5) {
        markAsChanged("CURVAPESO_5", curvaPeso5);
   }

   public String getCurvaPeso6() {
        return this.getVo().asString("CURVAPESO_6");
   }

   public void setCurvaPeso6(String curvaPeso6) {
        markAsChanged("CURVAPESO_6", curvaPeso6);
   }

   public String getCurvaPeso7() {
        return this.getVo().asString("CURVAPESO_7");
   }

   public void setCurvaPeso7(String curvaPeso7) {
        markAsChanged("CURVAPESO_7", curvaPeso7);
   }

   public String getCurvaPeso8() {
        return this.getVo().asString("CURVAPESO_8");
   }

   public void setCurvaPeso8(String curvaPeso8) {
        markAsChanged("CURVAPESO_8", curvaPeso8);
   }

   public String getCurvaPeso9() {
        return this.getVo().asString("CURVAPESO_9");
   }

   public void setCurvaPeso9(String curvaPeso9) {
        markAsChanged("CURVAPESO_9", curvaPeso9);
   }

   public String getCurvaQtd1() {
        return this.getVo().asString("CURVAQTD_1");
   }

   public void setCurvaQtd1(String curvaQtd1) {
        markAsChanged("CURVAQTD_1", curvaQtd1);
   }

   public String getCurvaQtd10() {
        return this.getVo().asString("CURVAQTD_10");
   }

   public void setCurvaQtd10(String curvaQtd10) {
        markAsChanged("CURVAQTD_10", curvaQtd10);
   }

   public String getCurvaQtd11() {
        return this.getVo().asString("CURVAQTD_11");
   }

   public void setCurvaQtd11(String curvaQtd11) {
        markAsChanged("CURVAQTD_11", curvaQtd11);
   }

   public String getCurvaQtd12() {
        return this.getVo().asString("CURVAQTD_12");
   }

   public void setCurvaQtd12(String curvaQtd12) {
        markAsChanged("CURVAQTD_12", curvaQtd12);
   }

   public String getCurvaQtd2() {
        return this.getVo().asString("CURVAQTD_2");
   }

   public void setCurvaQtd2(String curvaQtd2) {
        markAsChanged("CURVAQTD_2", curvaQtd2);
   }

   public String getCurvaQtd3() {
        return this.getVo().asString("CURVAQTD_3");
   }

   public void setCurvaQtd3(String curvaQtd3) {
        markAsChanged("CURVAQTD_3", curvaQtd3);
   }

   public String getCurvaQtd4() {
        return this.getVo().asString("CURVAQTD_4");
   }

   public void setCurvaQtd4(String curvaQtd4) {
        markAsChanged("CURVAQTD_4", curvaQtd4);
   }

   public String getCurvaQtd5() {
        return this.getVo().asString("CURVAQTD_5");
   }

   public void setCurvaQtd5(String curvaQtd5) {
        markAsChanged("CURVAQTD_5", curvaQtd5);
   }

   public String getCurvaQtd6() {
        return this.getVo().asString("CURVAQTD_6");
   }

   public void setCurvaQtd6(String curvaQtd6) {
        markAsChanged("CURVAQTD_6", curvaQtd6);
   }

   public String getCurvaQtd7() {
        return this.getVo().asString("CURVAQTD_7");
   }

   public void setCurvaQtd7(String curvaQtd7) {
        markAsChanged("CURVAQTD_7", curvaQtd7);
   }

   public String getCurvaQtd8() {
        return this.getVo().asString("CURVAQTD_8");
   }

   public void setCurvaQtd8(String curvaQtd8) {
        markAsChanged("CURVAQTD_8", curvaQtd8);
   }

   public String getCurvaQtd9() {
        return this.getVo().asString("CURVAQTD_9");
   }

   public void setCurvaQtd9(String curvaQtd9) {
        markAsChanged("CURVAQTD_9", curvaQtd9);
   }

   public String getCurvaTot1() {
        return this.getVo().asString("CURVATOT_1");
   }

   public void setCurvaTot1(String curvaTot1) {
        markAsChanged("CURVATOT_1", curvaTot1);
   }

   public String getCurvaTot10() {
        return this.getVo().asString("CURVATOT_10");
   }

   public void setCurvaTot10(String curvaTot10) {
        markAsChanged("CURVATOT_10", curvaTot10);
   }

   public String getCurvaTot11() {
        return this.getVo().asString("CURVATOT_11");
   }

   public void setCurvaTot11(String curvaTot11) {
        markAsChanged("CURVATOT_11", curvaTot11);
   }

   public String getCurvaTot12() {
        return this.getVo().asString("CURVATOT_12");
   }

   public void setCurvaTot12(String curvaTot12) {
        markAsChanged("CURVATOT_12", curvaTot12);
   }

   public String getCurvaTot2() {
        return this.getVo().asString("CURVATOT_2");
   }

   public void setCurvaTot2(String curvaTot2) {
        markAsChanged("CURVATOT_2", curvaTot2);
   }

   public String getCurvaTot3() {
        return this.getVo().asString("CURVATOT_3");
   }

   public void setCurvaTot3(String curvaTot3) {
        markAsChanged("CURVATOT_3", curvaTot3);
   }

   public String getCurvaTot4() {
        return this.getVo().asString("CURVATOT_4");
   }

   public void setCurvaTot4(String curvaTot4) {
        markAsChanged("CURVATOT_4", curvaTot4);
   }

   public Timestamp getUltCompra() {
        return this.getVo().asTimestamp("ULTCOMPRA");
   }

   public void setUltCompra(Timestamp ultCompra) {
        markAsChanged("ULTCOMPRA", ultCompra);
   }

   public Timestamp getUltVenda() {
        return this.getVo().asTimestamp("ULTVENDA");
   }

   public void setUltVenda(Timestamp ultVenda) {
        markAsChanged("ULTVENDA", ultVenda);
   }

   public BigDecimal getVlrCredIcms() {
        return this.getVo().asBigDecimal("VLRCREDICMS");
   }

   public void setVlrCredIcms(BigDecimal vlrCredIcms) {
        markAsChanged("VLRCREDICMS", vlrCredIcms);
   }

   public BigDecimal getVlrGastoVar1() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_1");
   }

   public void setVlrGastoVar1(BigDecimal vlrGastoVar1) {
        markAsChanged("VLRGASTOVAR_1", vlrGastoVar1);
   }

   public BigDecimal getVlrGastoVar6() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_6");
   }

   public void setVlrGastoVar6(BigDecimal vlrGastoVar6) {
        markAsChanged("VLRGASTOVAR_6", vlrGastoVar6);
   }

   public BigDecimal getVlrGastoVar7() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_7");
   }

   public void setVlrGastoVar7(BigDecimal vlrGastoVar7) {
        markAsChanged("VLRGASTOVAR_7", vlrGastoVar7);
   }

   public BigDecimal getVlrGastoVar8() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_8");
   }

   public void setVlrGastoVar8(BigDecimal vlrGastoVar8) {
        markAsChanged("VLRGASTOVAR_8", vlrGastoVar8);
   }

   public BigDecimal getVlrGastoVar9() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_9");
   }

   public void setVlrGastoVar9(BigDecimal vlrGastoVar9) {
        markAsChanged("VLRGASTOVAR_9", vlrGastoVar9);
   }

   public BigDecimal getVlrMargCont1() {
        return this.getVo().asBigDecimal("VLRMARGCONT_1");
   }

   public void setVlrMargCont1(BigDecimal vlrMargCont1) {
        markAsChanged("VLRMARGCONT_1", vlrMargCont1);
   }

   public BigDecimal getVlrMargCont10() {
        return this.getVo().asBigDecimal("VLRMARGCONT_10");
   }

   public void setVlrMargCont10(BigDecimal vlrMargCont10) {
        markAsChanged("VLRMARGCONT_10", vlrMargCont10);
   }

   public BigDecimal getVlrMargCont11() {
        return this.getVo().asBigDecimal("VLRMARGCONT_11");
   }

   public void setVlrMargCont11(BigDecimal vlrMargCont11) {
        markAsChanged("VLRMARGCONT_11", vlrMargCont11);
   }

   public BigDecimal getVlrMargCont12() {
        return this.getVo().asBigDecimal("VLRMARGCONT_12");
   }

   public void setVlrMargCont12(BigDecimal vlrMargCont12) {
        markAsChanged("VLRMARGCONT_12", vlrMargCont12);
   }

   public BigDecimal getVlrMargCont2() {
        return this.getVo().asBigDecimal("VLRMARGCONT_2");
   }

   public void setVlrMargCont2(BigDecimal vlrMargCont2) {
        markAsChanged("VLRMARGCONT_2", vlrMargCont2);
   }

   public BigDecimal getVlrMargCont3() {
        return this.getVo().asBigDecimal("VLRMARGCONT_3");
   }

   public void setVlrMargCont3(BigDecimal vlrMargCont3) {
        markAsChanged("VLRMARGCONT_3", vlrMargCont3);
   }

   public BigDecimal getVlrMargCont4() {
        return this.getVo().asBigDecimal("VLRMARGCONT_4");
   }

   public void setVlrMargCont4(BigDecimal vlrMargCont4) {
        markAsChanged("VLRMARGCONT_4", vlrMargCont4);
   }

   public BigDecimal getVlrMargCont5() {
        return this.getVo().asBigDecimal("VLRMARGCONT_5");
   }

   public void setVlrMargCont5(BigDecimal vlrMargCont5) {
        markAsChanged("VLRMARGCONT_5", vlrMargCont5);
   }

   public BigDecimal getVlrMargCont6() {
        return this.getVo().asBigDecimal("VLRMARGCONT_6");
   }

   public void setVlrMargCont6(BigDecimal vlrMargCont6) {
        markAsChanged("VLRMARGCONT_6", vlrMargCont6);
   }

   public BigDecimal getVlrMargCont7() {
        return this.getVo().asBigDecimal("VLRMARGCONT_7");
   }

   public void setVlrMargCont7(BigDecimal vlrMargCont7) {
        markAsChanged("VLRMARGCONT_7", vlrMargCont7);
   }

   public BigDecimal getVlrMargCont8() {
        return this.getVo().asBigDecimal("VLRMARGCONT_8");
   }

   public void setVlrMargCont8(BigDecimal vlrMargCont8) {
        markAsChanged("VLRMARGCONT_8", vlrMargCont8);
   }

   public BigDecimal getVlrMargCont9() {
        return this.getVo().asBigDecimal("VLRMARGCONT_9");
   }

   public void setVlrMargCont9(BigDecimal vlrMargCont9) {
        markAsChanged("VLRMARGCONT_9", vlrMargCont9);
   }

   public BigDecimal getVlrTabPreco() {
        return this.getVo().asBigDecimal("VLRTABPRECO");
   }

   public void setVlrTabPreco(BigDecimal vlrTabPreco) {
        markAsChanged("VLRTABPRECO", vlrTabPreco);
   }

   public BigDecimal getVlrTot1() {
        return this.getVo().asBigDecimal("VLRTOT_1");
   }

   public void setVlrTot1(BigDecimal vlrTot1) {
        markAsChanged("VLRTOT_1", vlrTot1);
   }

   public BigDecimal getVlrTot10() {
        return this.getVo().asBigDecimal("VLRTOT_10");
   }

   public void setVlrTot10(BigDecimal vlrTot10) {
        markAsChanged("VLRTOT_10", vlrTot10);
   }

   public BigDecimal getVlrTot11() {
        return this.getVo().asBigDecimal("VLRTOT_11");
   }

   public void setVlrTot11(BigDecimal vlrTot11) {
        markAsChanged("VLRTOT_11", vlrTot11);
   }

   public BigDecimal getVlrTot12() {
        return this.getVo().asBigDecimal("VLRTOT_12");
   }

   public void setVlrTot12(BigDecimal vlrTot12) {
        markAsChanged("VLRTOT_12", vlrTot12);
   }

   public BigDecimal getVlrTot2() {
        return this.getVo().asBigDecimal("VLRTOT_2");
   }

   public void setVlrTot2(BigDecimal vlrTot2) {
        markAsChanged("VLRTOT_2", vlrTot2);
   }

   public BigDecimal getVlrTot3() {
        return this.getVo().asBigDecimal("VLRTOT_3");
   }

   public void setVlrTot3(BigDecimal vlrTot3) {
        markAsChanged("VLRTOT_3", vlrTot3);
   }

   public BigDecimal getVlrTot4() {
        return this.getVo().asBigDecimal("VLRTOT_4");
   }

   public void setVlrTot4(BigDecimal vlrTot4) {
        markAsChanged("VLRTOT_4", vlrTot4);
   }

   public BigDecimal getVlrTot5() {
        return this.getVo().asBigDecimal("VLRTOT_5");
   }

   public void setVlrTot5(BigDecimal vlrTot5) {
        markAsChanged("VLRTOT_5", vlrTot5);
   }

   public BigDecimal getVlrTot6() {
        return this.getVo().asBigDecimal("VLRTOT_6");
   }

   public void setVlrTot6(BigDecimal vlrTot6) {
        markAsChanged("VLRTOT_6", vlrTot6);
   }

   public BigDecimal getVlrTot7() {
        return this.getVo().asBigDecimal("VLRTOT_7");
   }

   public void setVlrTot7(BigDecimal vlrTot7) {
        markAsChanged("VLRTOT_7", vlrTot7);
   }

   public BigDecimal getVlrTot8() {
        return this.getVo().asBigDecimal("VLRTOT_8");
   }

   public void setVlrTot8(BigDecimal vlrTot8) {
        markAsChanged("VLRTOT_8", vlrTot8);
   }

   public BigDecimal getVlrTot9() {
        return this.getVo().asBigDecimal("VLRTOT_9");
   }

   public void setVlrTot9(BigDecimal vlrTot9) {
        markAsChanged("VLRTOT_9", vlrTot9);
   }

   public BigDecimal getVlrUnit1() {
        return this.getVo().asBigDecimal("VLRUNIT_1");
   }

   public void setVlrUnit1(BigDecimal vlrUnit1) {
        markAsChanged("VLRUNIT_1", vlrUnit1);
   }

   public BigDecimal getVlrUnit10() {
        return this.getVo().asBigDecimal("VLRUNIT_10");
   }

   public void setVlrUnit10(BigDecimal vlrUnit10) {
        markAsChanged("VLRUNIT_10", vlrUnit10);
   }

   public BigDecimal getVlrUnit11() {
        return this.getVo().asBigDecimal("VLRUNIT_11");
   }

   public void setVlrUnit11(BigDecimal vlrUnit11) {
        markAsChanged("VLRUNIT_11", vlrUnit11);
   }

   public BigDecimal getVlrUnit12() {
        return this.getVo().asBigDecimal("VLRUNIT_12");
   }

   public void setVlrUnit12(BigDecimal vlrUnit12) {
        markAsChanged("VLRUNIT_12", vlrUnit12);
   }

   public BigDecimal getVlrUnit2() {
        return this.getVo().asBigDecimal("VLRUNIT_2");
   }

   public void setVlrUnit2(BigDecimal vlrUnit2) {
        markAsChanged("VLRUNIT_2", vlrUnit2);
   }

   public BigDecimal getVlrUnit3() {
        return this.getVo().asBigDecimal("VLRUNIT_3");
   }

   public void setVlrUnit3(BigDecimal vlrUnit3) {
        markAsChanged("VLRUNIT_3", vlrUnit3);
   }

   public BigDecimal getVlrUnit4() {
        return this.getVo().asBigDecimal("VLRUNIT_4");
   }

   public void setVlrUnit4(BigDecimal vlrUnit4) {
        markAsChanged("VLRUNIT_4", vlrUnit4);
   }

   public BigDecimal getVlrUnit5() {
        return this.getVo().asBigDecimal("VLRUNIT_5");
   }

   public void setVlrUnit5(BigDecimal vlrUnit5) {
        markAsChanged("VLRUNIT_5", vlrUnit5);
   }

   public BigDecimal getVlrUnit6() {
        return this.getVo().asBigDecimal("VLRUNIT_6");
   }

   public void setVlrUnit6(BigDecimal vlrUnit6) {
        markAsChanged("VLRUNIT_6", vlrUnit6);
   }

   public BigDecimal getAcumPeso4() {
        return this.getVo().asBigDecimal("ACUMPESO_4");
   }

   public void setAcumPeso4(BigDecimal acumPeso4) {
        markAsChanged("ACUMPESO_4", acumPeso4);
   }

   public BigDecimal getAcumPeso5() {
        return this.getVo().asBigDecimal("ACUMPESO_5");
   }

   public void setAcumPeso5(BigDecimal acumPeso5) {
        markAsChanged("ACUMPESO_5", acumPeso5);
   }

   public BigDecimal getAcumPeso6() {
        return this.getVo().asBigDecimal("ACUMPESO_6");
   }

   public void setAcumPeso6(BigDecimal acumPeso6) {
        markAsChanged("ACUMPESO_6", acumPeso6);
   }

   public BigDecimal getPopularidade7() {
        return this.getVo().asBigDecimal("POPULARIDADE_7");
   }

   public void setPopularidade7(BigDecimal popularidade7) {
        markAsChanged("POPULARIDADE_7", popularidade7);
   }

   public BigDecimal getPopularidade8() {
        return this.getVo().asBigDecimal("POPULARIDADE_8");
   }

   public void setPopularidade8(BigDecimal popularidade8) {
        markAsChanged("POPULARIDADE_8", popularidade8);
   }

   public BigDecimal getPopularidade9() {
        return this.getVo().asBigDecimal("POPULARIDADE_9");
   }

   public void setPopularidade9(BigDecimal popularidade9) {
        markAsChanged("POPULARIDADE_9", popularidade9);
   }

   public BigDecimal getAccumMarg9() {
        return this.getVo().asBigDecimal("ACUMMARG_9");
   }

   public void setAccumMarg9(BigDecimal accumMarg9) {
        markAsChanged("ACUMMARG_9", accumMarg9);
   }

   public BigDecimal getAccumPeso1() {
        return this.getVo().asBigDecimal("ACUMPESO_1");
   }

   public void setAccumPeso1(BigDecimal accumPeso1) {
        markAsChanged("ACUMPESO_1", accumPeso1);
   }

   public BigDecimal getAccumPeso10() {
        return this.getVo().asBigDecimal("ACUMPESO_10");
   }

   public void setAccumPeso10(BigDecimal accumPeso10) {
        markAsChanged("ACUMPESO_10", accumPeso10);
   }

   public BigDecimal getEstMax() {
        return this.getVo().asBigDecimal("ESTMAX");
   }

   public void setEstMax(BigDecimal estMax) {
        markAsChanged("ESTMAX", estMax);
   }

   public BigDecimal getCustoVenda12() {
        return this.getVo().asBigDecimal("CUSTOVENDA_12");
   }

   public void setCustoVenda12(BigDecimal custoVenda12) {
        markAsChanged("CUSTOVENDA_12", custoVenda12);
   }

   public BigDecimal getCustoVenda2() {
        return this.getVo().asBigDecimal("CUSTOVENDA_2");
   }

   public void setCustoVenda2(BigDecimal custoVenda2) {
        markAsChanged("CUSTOVENDA_2", custoVenda2);
   }

   public BigDecimal getCustoVenda3() {
        return this.getVo().asBigDecimal("CUSTOVENDA_3");
   }

   public void setCustoVenda3(BigDecimal custoVenda3) {
        markAsChanged("CUSTOVENDA_3", custoVenda3);
   }

   public BigDecimal getCustoVenda4() {
        return this.getVo().asBigDecimal("CUSTOVENDA_4");
   }

   public void setCustoVenda4(BigDecimal custoVenda4) {
        markAsChanged("CUSTOVENDA_4", custoVenda4);
   }

   public BigDecimal getCustoVenda5() {
        return this.getVo().asBigDecimal("CUSTOVENDA_5");
   }

   public void setCustoVenda5(BigDecimal custoVenda5) {
        markAsChanged("CUSTOVENDA_5", custoVenda5);
   }

   public BigDecimal getVlrGastoVar10() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_10");
   }

   public void setVlrGastoVar10(BigDecimal vlrGastoVar10) {
        markAsChanged("VLRGASTOVAR_10", vlrGastoVar10);
   }

   public BigDecimal getVlrGastoVar11() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_11");
   }

   public void setVlrGastoVar11(BigDecimal vlrGastoVar11) {
        markAsChanged("VLRGASTOVAR_11", vlrGastoVar11);
   }

   public BigDecimal getVlrGastoVar12() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_12");
   }

   public void setVlrGastoVar12(BigDecimal vlrGastoVar12) {
        markAsChanged("VLRGASTOVAR_12", vlrGastoVar12);
   }

   public BigDecimal getVlrGastoVar2() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_2");
   }

   public void setVlrGastoVar2(BigDecimal vlrGastoVar2) {
        markAsChanged("VLRGASTOVAR_2", vlrGastoVar2);
   }

   public BigDecimal getSugCompra() {
        return this.getVo().asBigDecimal("SUGCOMPRA");
   }

   public void setSugCompra(BigDecimal sugCompra) {
        markAsChanged("SUGCOMPRA", sugCompra);
   }

   public BigDecimal getSugCompraGir() {
        return this.getVo().asBigDecimal("SUGCOMPRAGIR");
   }

   public void setSugCompraGir(BigDecimal sugCompraGir) {
        markAsChanged("SUGCOMPRAGIR", sugCompraGir);
   }

   public String getTermoLabil() {
        return this.getVo().asString("TERMOLABIL");
   }

   public void setTermoLabil(String termoLabil) {
        markAsChanged("TERMOLABIL", termoLabil);
   }

   public BigDecimal getCustoVndTotal8() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_8");
   }

   public void setCustoVndTotal8(BigDecimal custoVndTotal8) {
        markAsChanged("CUSTOVNDTOTAL_8", custoVndTotal8);
   }

   public BigDecimal getCustoVndTotal9() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_9");
   }

   public void setCustoVndTotal9(BigDecimal custoVndTotal9) {
        markAsChanged("CUSTOVNDTOTAL_9", custoVndTotal9);
   }

   public BigDecimal getDescMax() {
        return this.getVo().asBigDecimal("DESCMAX");
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
   }

   public BigDecimal getDiasSemVenda() {
        return this.getVo().asBigDecimal("DIASSEMVENDA");
   }

   public void setDiasSemVenda(BigDecimal diasSemVenda) {
        markAsChanged("DIASSEMVENDA", diasSemVenda);
   }

   public BigDecimal getDurEst() {
        return this.getVo().asBigDecimal("DUREST");
   }

   public void setDurEst(BigDecimal durEst) {
        markAsChanged("DUREST", durEst);
   }

   public BigDecimal getDurEstPosCpa() {
        return this.getVo().asBigDecimal("DURESTPOSCPA");
   }

   public void setDurEstPosCpa(BigDecimal durEstPosCpa) {
        markAsChanged("DURESTPOSCPA", durEstPosCpa);
   }

   public BigDecimal getEstCustGer() {
        return this.getVo().asBigDecimal("ESTCUSTGER");
   }

   public void setEstCustGer(BigDecimal estCustGer) {
        markAsChanged("ESTCUSTGER", estCustGer);
   }

   public String getEstMenMedVend() {
        return this.getVo().asString("ESTMENMEDVEND");
   }

   public void setEstMenMedVend(String estMenMedVend) {
        markAsChanged("ESTMENMEDVEND", estMenMedVend);
   }

   public BigDecimal getEstMin() {
        return this.getVo().asBigDecimal("ESTMIN");
   }

   public void setEstMin(BigDecimal estMin) {
        markAsChanged("ESTMIN", estMin);
   }

   public BigDecimal getEstMinGir() {
        return this.getVo().asBigDecimal("ESTMINGIR");
   }

   public void setEstMinGir(BigDecimal estMinGir) {
        markAsChanged("ESTMINGIR", estMinGir);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getFrequencia() {
        return this.getVo().asBigDecimal("FREQUENCIA");
   }

   public void setFrequencia(BigDecimal frequencia) {
        markAsChanged("FREQUENCIA", frequencia);
   }

   public String getIdenCorrelato() {
        return this.getVo().asString("IDENCORRELATO");
   }

   public void setIdenCorrelato(String idenCorrelato) {
        markAsChanged("IDENCORRELATO", idenCorrelato);
   }

   public String getIdenCosme() {
        return this.getVo().asString("IDENCOSME");
   }

   public void setIdenCosme(String idenCosme) {
        markAsChanged("IDENCOSME", idenCosme);
   }

   public String getIdenOtc() {
        return this.getVo().asString("IDENOTC");
   }

   public void setIdenOtc(String idenOtc) {
        markAsChanged("IDENOTC", idenOtc);
   }

   public String getIdenPortaria() {
        return this.getVo().asString("IDENPORTARIA");
   }

   public void setIdenPortaria(String idenPortaria) {
        markAsChanged("IDENPORTARIA", idenPortaria);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public String getListaLpm() {
        return this.getVo().asString("LISTALPM");
   }

   public void setListaLpm(String listaLpm) {
        markAsChanged("LISTALPM", listaLpm);
   }

   public BigDecimal getLucro1() {
        return this.getVo().asBigDecimal("LUCRO_1");
   }

   public void setLucro1(BigDecimal lucro1) {
        markAsChanged("LUCRO_1", lucro1);
   }

   public BigDecimal getLucro10() {
        return this.getVo().asBigDecimal("LUCRO_10");
   }

   public void setLucro10(BigDecimal lucro10) {
        markAsChanged("LUCRO_10", lucro10);
   }

   public BigDecimal getLucro11() {
        return this.getVo().asBigDecimal("LUCRO_11");
   }

   public void setLucro11(BigDecimal lucro11) {
        markAsChanged("LUCRO_11", lucro11);
   }

   public BigDecimal getLucro12() {
        return this.getVo().asBigDecimal("LUCRO_12");
   }

   public void setLucro12(BigDecimal lucro12) {
        markAsChanged("LUCRO_12", lucro12);
   }

   public BigDecimal getLucro2() {
        return this.getVo().asBigDecimal("LUCRO_2");
   }

   public void setLucro2(BigDecimal lucro2) {
        markAsChanged("LUCRO_2", lucro2);
   }

   public BigDecimal getLucro3() {
        return this.getVo().asBigDecimal("LUCRO_3");
   }

   public void setLucro3(BigDecimal lucro3) {
        markAsChanged("LUCRO_3", lucro3);
   }

   public BigDecimal getLucro4() {
        return this.getVo().asBigDecimal("LUCRO_4");
   }

   public void setLucro4(BigDecimal lucro4) {
        markAsChanged("LUCRO_4", lucro4);
   }

   public BigDecimal getLucro5() {
        return this.getVo().asBigDecimal("LUCRO_5");
   }

   public void setLucro5(BigDecimal lucro5) {
        markAsChanged("LUCRO_5", lucro5);
   }

   public BigDecimal getLucro6() {
        return this.getVo().asBigDecimal("LUCRO_6");
   }

   public void setLucro6(BigDecimal lucro6) {
        markAsChanged("LUCRO_6", lucro6);
   }

   public BigDecimal getLucro7() {
        return this.getVo().asBigDecimal("LUCRO_7");
   }

   public void setLucro7(BigDecimal lucro7) {
        markAsChanged("LUCRO_7", lucro7);
   }

   public BigDecimal getLucro8() {
        return this.getVo().asBigDecimal("LUCRO_8");
   }

   public void setLucro8(BigDecimal lucro8) {
        markAsChanged("LUCRO_8", lucro8);
   }

   public BigDecimal getLucro9() {
        return this.getVo().asBigDecimal("LUCRO_9");
   }

   public void setLucro9(BigDecimal lucro9) {
        markAsChanged("LUCRO_9", lucro9);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getMarkup() {
        return this.getVo().asBigDecimal("MARKUP");
   }

   public void setMarkup(BigDecimal markup) {
        markAsChanged("MARKUP", markup);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getOneroso() {
        return this.getVo().asString("ONEROSO");
   }

   public void setOneroso(String oneroso) {
        markAsChanged("ONEROSO", oneroso);
   }

   public BigDecimal getOrdemMedida() {
        return this.getVo().asBigDecimal("ORDEMMEDIDA");
   }

   public void setOrdemMedida(BigDecimal ordemMedida) {
        markAsChanged("ORDEMMEDIDA", ordemMedida);
   }

   public BigDecimal getPartEstoque() {
        return this.getVo().asBigDecimal("PARTESTOQUE");
   }

   public void setPartEstoque(BigDecimal partEstoque) {
        markAsChanged("PARTESTOQUE", partEstoque);
   }

   public BigDecimal getPartGasVarFat1() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_1");
   }

   public void setPartGasVarFat1(BigDecimal partGasVarFat1) {
        markAsChanged("PARTGASVARFAT_1", partGasVarFat1);
   }

   public BigDecimal getPartGasVarFat10() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_10");
   }

   public void setPartGasVarFat10(BigDecimal partGasVarFat10) {
        markAsChanged("PARTGASVARFAT_10", partGasVarFat10);
   }

   public BigDecimal getPartGasVarFat11() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_11");
   }

   public void setPartGasVarFat11(BigDecimal partGasVarFat11) {
        markAsChanged("PARTGASVARFAT_11", partGasVarFat11);
   }

   public BigDecimal getPartGasVarFat12() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_12");
   }

   public void setPartGasVarFat12(BigDecimal partGasVarFat12) {
        markAsChanged("PARTGASVARFAT_12", partGasVarFat12);
   }

   public BigDecimal getPartGasVarFat2() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_2");
   }

   public void setPartGasVarFat2(BigDecimal partGasVarFat2) {
        markAsChanged("PARTGASVARFAT_2", partGasVarFat2);
   }

   public BigDecimal getPartGasVarFat3() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_3");
   }

   public void setPartGasVarFat3(BigDecimal partGasVarFat3) {
        markAsChanged("PARTGASVARFAT_3", partGasVarFat3);
   }

   public BigDecimal getPartGasVarFat4() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_4");
   }

   public void setPartGasVarFat4(BigDecimal partGasVarFat4) {
        markAsChanged("PARTGASVARFAT_4", partGasVarFat4);
   }

   public BigDecimal getPartGasVarFat5() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_5");
   }

   public void setPartGasVarFat5(BigDecimal partGasVarFat5) {
        markAsChanged("PARTGASVARFAT_5", partGasVarFat5);
   }

   public BigDecimal getPartGasVarFat6() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_6");
   }

   public void setPartGasVarFat6(BigDecimal partGasVarFat6) {
        markAsChanged("PARTGASVARFAT_6", partGasVarFat6);
   }

   public BigDecimal getPartGasVarFat7() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_7");
   }

   public void setPartGasVarFat7(BigDecimal partGasVarFat7) {
        markAsChanged("PARTGASVARFAT_7", partGasVarFat7);
   }

   public BigDecimal getPartGasVarFat8() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_8");
   }

   public void setPartGasVarFat8(BigDecimal partGasVarFat8) {
        markAsChanged("PARTGASVARFAT_8", partGasVarFat8);
   }

   public BigDecimal getPartGasVarFat9() {
        return this.getVo().asBigDecimal("PARTGASVARFAT_9");
   }

   public void setPartGasVarFat9(BigDecimal partGasVarFat9) {
        markAsChanged("PARTGASVARFAT_9", partGasVarFat9);
   }

   public BigDecimal getPartGasVar1() {
        return this.getVo().asBigDecimal("PARTGASVAR_1");
   }

   public void setPartGasVar1(BigDecimal partGasVar1) {
        markAsChanged("PARTGASVAR_1", partGasVar1);
   }

   public BigDecimal getPartGasVar10() {
        return this.getVo().asBigDecimal("PARTGASVAR_10");
   }

   public void setPartGasVar10(BigDecimal partGasVar10) {
        markAsChanged("PARTGASVAR_10", partGasVar10);
   }

   public BigDecimal getPartGasVar11() {
        return this.getVo().asBigDecimal("PARTGASVAR_11");
   }

   public void setPartGasVar11(BigDecimal partGasVar11) {
        markAsChanged("PARTGASVAR_11", partGasVar11);
   }

   public BigDecimal getPartGasVar12() {
        return this.getVo().asBigDecimal("PARTGASVAR_12");
   }

   public void setPartGasVar12(BigDecimal partGasVar12) {
        markAsChanged("PARTGASVAR_12", partGasVar12);
   }

   public BigDecimal getPartGasVar2() {
        return this.getVo().asBigDecimal("PARTGASVAR_2");
   }

   public void setPartGasVar2(BigDecimal partGasVar2) {
        markAsChanged("PARTGASVAR_2", partGasVar2);
   }

   public BigDecimal getPartGasVar3() {
        return this.getVo().asBigDecimal("PARTGASVAR_3");
   }

   public void setPartGasVar3(BigDecimal partGasVar3) {
        markAsChanged("PARTGASVAR_3", partGasVar3);
   }

   public BigDecimal getPartGasVar4() {
        return this.getVo().asBigDecimal("PARTGASVAR_4");
   }

   public void setPartGasVar4(BigDecimal partGasVar4) {
        markAsChanged("PARTGASVAR_4", partGasVar4);
   }

   public BigDecimal getPartGasVar5() {
        return this.getVo().asBigDecimal("PARTGASVAR_5");
   }

   public void setPartGasVar5(BigDecimal partGasVar5) {
        markAsChanged("PARTGASVAR_5", partGasVar5);
   }

   public BigDecimal getPartGasVar6() {
        return this.getVo().asBigDecimal("PARTGASVAR_6");
   }

   public void setPartGasVar6(BigDecimal partGasVar6) {
        markAsChanged("PARTGASVAR_6", partGasVar6);
   }

   public BigDecimal getPartGasVar7() {
        return this.getVo().asBigDecimal("PARTGASVAR_7");
   }

   public void setPartGasVar7(BigDecimal partGasVar7) {
        markAsChanged("PARTGASVAR_7", partGasVar7);
   }

   public BigDecimal getPartGasVar8() {
        return this.getVo().asBigDecimal("PARTGASVAR_8");
   }

   public void setPartGasVar8(BigDecimal partGasVar8) {
        markAsChanged("PARTGASVAR_8", partGasVar8);
   }

   public BigDecimal getPartGasVar9() {
        return this.getVo().asBigDecimal("PARTGASVAR_9");
   }

   public void setPartGasVar9(BigDecimal partGasVar9) {
        markAsChanged("PARTGASVAR_9", partGasVar9);
   }

   public BigDecimal getPartLucro1() {
        return this.getVo().asBigDecimal("PARTLUCRO_1");
   }

   public void setPartLucro1(BigDecimal partLucro1) {
        markAsChanged("PARTLUCRO_1", partLucro1);
   }

   public BigDecimal getPartLucro10() {
        return this.getVo().asBigDecimal("PARTLUCRO_10");
   }

   public void setPartLucro10(BigDecimal partLucro10) {
        markAsChanged("PARTLUCRO_10", partLucro10);
   }

   public BigDecimal getPartLucro11() {
        return this.getVo().asBigDecimal("PARTLUCRO_11");
   }

   public void setPartLucro11(BigDecimal partLucro11) {
        markAsChanged("PARTLUCRO_11", partLucro11);
   }

   public BigDecimal getPartLucro12() {
        return this.getVo().asBigDecimal("PARTLUCRO_12");
   }

   public void setPartLucro12(BigDecimal partLucro12) {
        markAsChanged("PARTLUCRO_12", partLucro12);
   }

   public BigDecimal getPartLucro2() {
        return this.getVo().asBigDecimal("PARTLUCRO_2");
   }

   public void setPartLucro2(BigDecimal partLucro2) {
        markAsChanged("PARTLUCRO_2", partLucro2);
   }

   public BigDecimal getPartLucro3() {
        return this.getVo().asBigDecimal("PARTLUCRO_3");
   }

   public void setPartLucro3(BigDecimal partLucro3) {
        markAsChanged("PARTLUCRO_3", partLucro3);
   }

   public BigDecimal getPartLucro4() {
        return this.getVo().asBigDecimal("PARTLUCRO_4");
   }

   public void setPartLucro4(BigDecimal partLucro4) {
        markAsChanged("PARTLUCRO_4", partLucro4);
   }

   public BigDecimal getPartLucro5() {
        return this.getVo().asBigDecimal("PARTLUCRO_5");
   }

   public void setPartLucro5(BigDecimal partLucro5) {
        markAsChanged("PARTLUCRO_5", partLucro5);
   }

   public String getProdFalta() {
        return this.getVo().asString("PRODFALTA");
   }

   public void setProdFalta(String prodFalta) {
        markAsChanged("PRODFALTA", prodFalta);
   }

   public BigDecimal getQtdMaxima() {
        return this.getVo().asBigDecimal("QTDMAXIMA");
   }

   public void setQtdMaxima(BigDecimal qtdMaxima) {
        markAsChanged("QTDMAXIMA", qtdMaxima);
   }

   public BigDecimal getQtdMedia() {
        return this.getVo().asBigDecimal("QTDMEDIA");
   }

   public void setQtdMedia(BigDecimal qtdMedia) {
        markAsChanged("QTDMEDIA", qtdMedia);
   }

   public BigDecimal getPartLucro6() {
        return this.getVo().asBigDecimal("PARTLUCRO_6");
   }

   public void setPartLucro6(BigDecimal partLucro6) {
        markAsChanged("PARTLUCRO_6", partLucro6);
   }

   public BigDecimal getPartLucro7() {
        return this.getVo().asBigDecimal("PARTLUCRO_7");
   }

   public void setPartLucro7(BigDecimal partLucro7) {
        markAsChanged("PARTLUCRO_7", partLucro7);
   }

   public BigDecimal getPartLucro8() {
        return this.getVo().asBigDecimal("PARTLUCRO_8");
   }

   public void setPartLucro8(BigDecimal partLucro8) {
        markAsChanged("PARTLUCRO_8", partLucro8);
   }

   public BigDecimal getPartLucro9() {
        return this.getVo().asBigDecimal("PARTLUCRO_9");
   }

   public void setPartLucro9(BigDecimal partLucro9) {
        markAsChanged("PARTLUCRO_9", partLucro9);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getRefForn() {
        return this.getVo().asString("REFFORN");
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
   }

   public String getRefMercMed() {
        return this.getVo().asString("REFMERCMED");
   }

   public void setRefMercMed(String refMercMed) {
        markAsChanged("REFMERCMED", refMercMed);
   }

   public BigDecimal getStatusMed() {
        return this.getVo().asBigDecimal("STATUSMED");
   }

   public void setStatusMed(BigDecimal statusMed) {
        markAsChanged("STATUSMED", statusMed);
   }

   public BigDecimal getSugCompCustGer() {
        return this.getVo().asBigDecimal("SUGCOMPCUSTGER");
   }

   public void setSugCompCustGer(BigDecimal sugCompCustGer) {
        markAsChanged("SUGCOMPCUSTGER", sugCompCustGer);
   }

   public String getCurvaTot6() {
        return this.getVo().asString("CURVATOT_6");
   }

   public void setCurvaTot6(String curvaTot6) {
        markAsChanged("CURVATOT_6", curvaTot6);
   }

   public String getCurvaTot7() {
        return this.getVo().asString("CURVATOT_7");
   }

   public void setCurvaTot7(String curvaTot7) {
        markAsChanged("CURVATOT_7", curvaTot7);
   }

   public String getCurvaTot8() {
        return this.getVo().asString("CURVATOT_8");
   }

   public void setCurvaTot8(String curvaTot8) {
        markAsChanged("CURVATOT_8", curvaTot8);
   }

   public String getCurvaTot9() {
        return this.getVo().asString("CURVATOT_9");
   }

   public void setCurvaTot9(String curvaTot9) {
        markAsChanged("CURVATOT_9", curvaTot9);
   }

   public BigDecimal getCustoGer() {
        return this.getVo().asBigDecimal("CUSTOGER");
   }

   public void setCustoGer(BigDecimal custoGer) {
        markAsChanged("CUSTOGER", custoGer);
   }

   public BigDecimal getCustoRep() {
        return this.getVo().asBigDecimal("CUSTOREP");
   }

   public void setCustoRep(BigDecimal custoRep) {
        markAsChanged("CUSTOREP", custoRep);
   }

   public BigDecimal getCustoVenda1() {
        return this.getVo().asBigDecimal("CUSTOVENDA_1");
   }

   public void setCustoVenda1(BigDecimal custoVenda1) {
        markAsChanged("CUSTOVENDA_1", custoVenda1);
   }

   public BigDecimal getPartMargContFat5() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_5");
   }

   public void setPartMargContFat5(BigDecimal partMargContFat5) {
        markAsChanged("PARTMARGCONTFAT_5", partMargContFat5);
   }

   public BigDecimal getPartMargContFat6() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_6");
   }

   public void setPartMargContFat6(BigDecimal partMargContFat6) {
        markAsChanged("PARTMARGCONTFAT_6", partMargContFat6);
   }

   public BigDecimal getPartMargContFat7() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_7");
   }

   public void setPartMargContFat7(BigDecimal partMargContFat7) {
        markAsChanged("PARTMARGCONTFAT_7", partMargContFat7);
   }

   public BigDecimal getPartMargContFat8() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_8");
   }

   public void setPartMargContFat8(BigDecimal partMargContFat8) {
        markAsChanged("PARTMARGCONTFAT_8", partMargContFat8);
   }

   public BigDecimal getPartMargContFat9() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_9");
   }

   public void setPartMargContFat9(BigDecimal partMargContFat9) {
        markAsChanged("PARTMARGCONTFAT_9", partMargContFat9);
   }

   public BigDecimal getPartMargCont1() {
        return this.getVo().asBigDecimal("PARTMARGCONT_1");
   }

   public void setPartMargCont1(BigDecimal partMargCont1) {
        markAsChanged("PARTMARGCONT_1", partMargCont1);
   }

   public BigDecimal getPartMargCont10() {
        return this.getVo().asBigDecimal("PARTMARGCONT_10");
   }

   public void setPartMargCont10(BigDecimal partMargCont10) {
        markAsChanged("PARTMARGCONT_10", partMargCont10);
   }

   public BigDecimal getPartMargCont11() {
        return this.getVo().asBigDecimal("PARTMARGCONT_11");
   }

   public void setPartMargCont11(BigDecimal partMargCont11) {
        markAsChanged("PARTMARGCONT_11", partMargCont11);
   }

   public BigDecimal getPartMargCont12() {
        return this.getVo().asBigDecimal("PARTMARGCONT_12");
   }

   public void setPartMargCont12(BigDecimal partMargCont12) {
        markAsChanged("PARTMARGCONT_12", partMargCont12);
   }

   public BigDecimal getPartMargCont2() {
        return this.getVo().asBigDecimal("PARTMARGCONT_2");
   }

   public void setPartMargCont2(BigDecimal partMargCont2) {
        markAsChanged("PARTMARGCONT_2", partMargCont2);
   }

   public BigDecimal getPartMargCont3() {
        return this.getVo().asBigDecimal("PARTMARGCONT_3");
   }

   public void setPartMargCont3(BigDecimal partMargCont3) {
        markAsChanged("PARTMARGCONT_3", partMargCont3);
   }

   public BigDecimal getPartMargCont4() {
        return this.getVo().asBigDecimal("PARTMARGCONT_4");
   }

   public void setPartMargCont4(BigDecimal partMargCont4) {
        markAsChanged("PARTMARGCONT_4", partMargCont4);
   }

   public BigDecimal getPartMargCont5() {
        return this.getVo().asBigDecimal("PARTMARGCONT_5");
   }

   public void setPartMargCont5(BigDecimal partMargCont5) {
        markAsChanged("PARTMARGCONT_5", partMargCont5);
   }

   public BigDecimal getPartMargCont6() {
        return this.getVo().asBigDecimal("PARTMARGCONT_6");
   }

   public void setPartMargCont6(BigDecimal partMargCont6) {
        markAsChanged("PARTMARGCONT_6", partMargCont6);
   }

   public BigDecimal getPartMargCont7() {
        return this.getVo().asBigDecimal("PARTMARGCONT_7");
   }

   public void setPartMargCont7(BigDecimal partMargCont7) {
        markAsChanged("PARTMARGCONT_7", partMargCont7);
   }

   public BigDecimal getPartMargCont8() {
        return this.getVo().asBigDecimal("PARTMARGCONT_8");
   }

   public void setPartMargCont8(BigDecimal partMargCont8) {
        markAsChanged("PARTMARGCONT_8", partMargCont8);
   }

   public BigDecimal getPartMargCont9() {
        return this.getVo().asBigDecimal("PARTMARGCONT_9");
   }

   public void setPartMargCont9(BigDecimal partMargCont9) {
        markAsChanged("PARTMARGCONT_9", partMargCont9);
   }

   public BigDecimal getPartPeso1() {
        return this.getVo().asBigDecimal("PARTPESO_1");
   }

   public void setPartPeso1(BigDecimal partPeso1) {
        markAsChanged("PARTPESO_1", partPeso1);
   }

   public BigDecimal getAcumMarg1() {
        return this.getVo().asBigDecimal("ACUMMARG_1");
   }

   public void setAcumMarg1(BigDecimal acumMarg1) {
        markAsChanged("ACUMMARG_1", acumMarg1);
   }

   public BigDecimal getAcumMarg10() {
        return this.getVo().asBigDecimal("ACUMMARG_10");
   }

   public void setAcumMarg10(BigDecimal acumMarg10) {
        markAsChanged("ACUMMARG_10", acumMarg10);
   }

   public BigDecimal getQtdMinima() {
        return this.getVo().asBigDecimal("QTDMINIMA");
   }

   public void setQtdMinima(BigDecimal qtdMinima) {
        markAsChanged("QTDMINIMA", qtdMinima);
   }

   public BigDecimal getQtdTotal() {
        return this.getVo().asBigDecimal("QTDTOTAL");
   }

   public void setQtdTotal(BigDecimal qtdTotal) {
        markAsChanged("QTDTOTAL", qtdTotal);
   }

   public BigDecimal getQtdUltCompra() {
        return this.getVo().asBigDecimal("QTDULTCOMPRA");
   }

   public void setQtdUltCompra(BigDecimal qtdUltCompra) {
        markAsChanged("QTDULTCOMPRA", qtdUltCompra);
   }

   public BigDecimal getPartPeso10() {
        return this.getVo().asBigDecimal("PARTPESO_10");
   }

   public void setPartPeso10(BigDecimal partPeso10) {
        markAsChanged("PARTPESO_10", partPeso10);
   }

   public BigDecimal getPartPeso11() {
        return this.getVo().asBigDecimal("PARTPESO_11");
   }

   public void setPartPeso11(BigDecimal partPeso11) {
        markAsChanged("PARTPESO_11", partPeso11);
   }

   public BigDecimal getPartPeso12() {
        return this.getVo().asBigDecimal("PARTPESO_12");
   }

   public void setPartPeso12(BigDecimal partPeso12) {
        markAsChanged("PARTPESO_12", partPeso12);
   }

   public BigDecimal getPartPeso2() {
        return this.getVo().asBigDecimal("PARTPESO_2");
   }

   public void setPartPeso2(BigDecimal partPeso2) {
        markAsChanged("PARTPESO_2", partPeso2);
   }

   public BigDecimal getPartPeso3() {
        return this.getVo().asBigDecimal("PARTPESO_3");
   }

   public void setPartPeso3(BigDecimal partPeso3) {
        markAsChanged("PARTPESO_3", partPeso3);
   }

   public BigDecimal getPartPeso4() {
        return this.getVo().asBigDecimal("PARTPESO_4");
   }

   public void setPartPeso4(BigDecimal partPeso4) {
        markAsChanged("PARTPESO_4", partPeso4);
   }

   public BigDecimal getPartPeso5() {
        return this.getVo().asBigDecimal("PARTPESO_5");
   }

   public void setPartPeso5(BigDecimal partPeso5) {
        markAsChanged("PARTPESO_5", partPeso5);
   }

   public BigDecimal getPartPeso6() {
        return this.getVo().asBigDecimal("PARTPESO_6");
   }

   public void setPartPeso6(BigDecimal partPeso6) {
        markAsChanged("PARTPESO_6", partPeso6);
   }

   public BigDecimal getPartPeso7() {
        return this.getVo().asBigDecimal("PARTPESO_7");
   }

   public void setPartPeso7(BigDecimal partPeso7) {
        markAsChanged("PARTPESO_7", partPeso7);
   }

   public BigDecimal getPartPeso8() {
        return this.getVo().asBigDecimal("PARTPESO_8");
   }

   public void setPartPeso8(BigDecimal partPeso8) {
        markAsChanged("PARTPESO_8", partPeso8);
   }

   public BigDecimal getPartPeso9() {
        return this.getVo().asBigDecimal("PARTPESO_9");
   }

   public void setPartPeso9(BigDecimal partPeso9) {
        markAsChanged("PARTPESO_9", partPeso9);
   }

   public BigDecimal getPartQtde1() {
        return this.getVo().asBigDecimal("PARTQTDE_1");
   }

   public void setPartQtde1(BigDecimal partQtde1) {
        markAsChanged("PARTQTDE_1", partQtde1);
   }

   public BigDecimal getPartQtde10() {
        return this.getVo().asBigDecimal("PARTQTDE_10");
   }

   public void setPartQtde10(BigDecimal partQtde10) {
        markAsChanged("PARTQTDE_10", partQtde10);
   }

   public BigDecimal getPartQtde11() {
        return this.getVo().asBigDecimal("PARTQTDE_11");
   }

   public void setPartQtde11(BigDecimal partQtde11) {
        markAsChanged("PARTQTDE_11", partQtde11);
   }

   public BigDecimal getPartQtde12() {
        return this.getVo().asBigDecimal("PARTQTDE_12");
   }

   public void setPartQtde12(BigDecimal partQtde12) {
        markAsChanged("PARTQTDE_12", partQtde12);
   }

   public BigDecimal getPartQtde2() {
        return this.getVo().asBigDecimal("PARTQTDE_2");
   }

   public void setPartQtde2(BigDecimal partQtde2) {
        markAsChanged("PARTQTDE_2", partQtde2);
   }

   public BigDecimal getPartQtde3() {
        return this.getVo().asBigDecimal("PARTQTDE_3");
   }

   public void setPartQtde3(BigDecimal partQtde3) {
        markAsChanged("PARTQTDE_3", partQtde3);
   }

   public BigDecimal getPartQtde4() {
        return this.getVo().asBigDecimal("PARTQTDE_4");
   }

   public void setPartQtde4(BigDecimal partQtde4) {
        markAsChanged("PARTQTDE_4", partQtde4);
   }

   public BigDecimal getPartQtde5() {
        return this.getVo().asBigDecimal("PARTQTDE_5");
   }

   public void setPartQtde5(BigDecimal partQtde5) {
        markAsChanged("PARTQTDE_5", partQtde5);
   }

   public BigDecimal getPartQtde6() {
        return this.getVo().asBigDecimal("PARTQTDE_6");
   }

   public void setPartQtde6(BigDecimal partQtde6) {
        markAsChanged("PARTQTDE_6", partQtde6);
   }

   public BigDecimal getPartQtde7() {
        return this.getVo().asBigDecimal("PARTQTDE_7");
   }

   public void setPartQtde7(BigDecimal partQtde7) {
        markAsChanged("PARTQTDE_7", partQtde7);
   }

   public BigDecimal getPartQtde8() {
        return this.getVo().asBigDecimal("PARTQTDE_8");
   }

   public void setPartQtde8(BigDecimal partQtde8) {
        markAsChanged("PARTQTDE_8", partQtde8);
   }

   public BigDecimal getPartQtde9() {
        return this.getVo().asBigDecimal("PARTQTDE_9");
   }

   public void setPartQtde9(BigDecimal partQtde9) {
        markAsChanged("PARTQTDE_9", partQtde9);
   }

   public BigDecimal getPartTotPer1() {
        return this.getVo().asBigDecimal("PARTTOTPER_1");
   }

   public void setPartTotPer1(BigDecimal partTotPer1) {
        markAsChanged("PARTTOTPER_1", partTotPer1);
   }

   public BigDecimal getPartTotPer10() {
        return this.getVo().asBigDecimal("PARTTOTPER_10");
   }

   public void setPartTotPer10(BigDecimal partTotPer10) {
        markAsChanged("PARTTOTPER_10", partTotPer10);
   }

   public BigDecimal getPartTotPer11() {
        return this.getVo().asBigDecimal("PARTTOTPER_11");
   }

   public void setPartTotPer11(BigDecimal partTotPer11) {
        markAsChanged("PARTTOTPER_11", partTotPer11);
   }

   public BigDecimal getPartTotPer12() {
        return this.getVo().asBigDecimal("PARTTOTPER_12");
   }

   public void setPartTotPer12(BigDecimal partTotPer12) {
        markAsChanged("PARTTOTPER_12", partTotPer12);
   }

   public BigDecimal getPartTotPer2() {
        return this.getVo().asBigDecimal("PARTTOTPER_2");
   }

   public void setPartTotPer2(BigDecimal partTotPer2) {
        markAsChanged("PARTTOTPER_2", partTotPer2);
   }

   public BigDecimal getPartTotPer3() {
        return this.getVo().asBigDecimal("PARTTOTPER_3");
   }

   public void setPartTotPer3(BigDecimal partTotPer3) {
        markAsChanged("PARTTOTPER_3", partTotPer3);
   }

   public BigDecimal getPartTotPer4() {
        return this.getVo().asBigDecimal("PARTTOTPER_4");
   }

   public void setPartTotPer4(BigDecimal partTotPer4) {
        markAsChanged("PARTTOTPER_4", partTotPer4);
   }

   public BigDecimal getPartTotPer5() {
        return this.getVo().asBigDecimal("PARTTOTPER_5");
   }

   public void setPartTotPer5(BigDecimal partTotPer5) {
        markAsChanged("PARTTOTPER_5", partTotPer5);
   }

   public BigDecimal getPartTotPer6() {
        return this.getVo().asBigDecimal("PARTTOTPER_6");
   }

   public void setPartTotPer6(BigDecimal partTotPer6) {
        markAsChanged("PARTTOTPER_6", partTotPer6);
   }

   public BigDecimal getPartTotPer7() {
        return this.getVo().asBigDecimal("PARTTOTPER_7");
   }

   public void setPartTotPer7(BigDecimal partTotPer7) {
        markAsChanged("PARTTOTPER_7", partTotPer7);
   }

   public BigDecimal getPartTotPer8() {
        return this.getVo().asBigDecimal("PARTTOTPER_8");
   }

   public void setPartTotPer8(BigDecimal partTotPer8) {
        markAsChanged("PARTTOTPER_8", partTotPer8);
   }

   public BigDecimal getPartTotPer9() {
        return this.getVo().asBigDecimal("PARTTOTPER_9");
   }

   public void setPartTotPer9(BigDecimal partTotPer9) {
        markAsChanged("PARTTOTPER_9", partTotPer9);
   }

   public BigDecimal getPedCpApend() {
        return this.getVo().asBigDecimal("PEDCPAPEND");
   }

   public void setPedCpApend(BigDecimal pedCpApend) {
        markAsChanged("PEDCPAPEND", pedCpApend);
   }

   public BigDecimal getPedVdApend() {
        return this.getVo().asBigDecimal("PEDVDAPEND");
   }

   public void setPedVdApend(BigDecimal pedVdApend) {
        markAsChanged("PEDVDAPEND", pedVdApend);
   }

   public BigDecimal getPerLucro1() {
        return this.getVo().asBigDecimal("PERLUCRO_1");
   }

   public void setPerLucro1(BigDecimal perLucro1) {
        markAsChanged("PERLUCRO_1", perLucro1);
   }

   public BigDecimal getPerLucro10() {
        return this.getVo().asBigDecimal("PERLUCRO_10");
   }

   public void setPerLucro10(BigDecimal perLucro10) {
        markAsChanged("PERLUCRO_10", perLucro10);
   }

   public BigDecimal getPerLucro11() {
        return this.getVo().asBigDecimal("PERLUCRO_11");
   }

   public void setPerLucro11(BigDecimal perLucro11) {
        markAsChanged("PERLUCRO_11", perLucro11);
   }

   public BigDecimal getPerLucro12() {
        return this.getVo().asBigDecimal("PERLUCRO_12");
   }

   public void setPerLucro12(BigDecimal perLucro12) {
        markAsChanged("PERLUCRO_12", perLucro12);
   }

   public BigDecimal getPerLucro2() {
        return this.getVo().asBigDecimal("PERLUCRO_2");
   }

   public void setPerLucro2(BigDecimal perLucro2) {
        markAsChanged("PERLUCRO_2", perLucro2);
   }

   public BigDecimal getPerLucro3() {
        return this.getVo().asBigDecimal("PERLUCRO_3");
   }

   public void setPerLucro3(BigDecimal perLucro3) {
        markAsChanged("PERLUCRO_3", perLucro3);
   }

   public BigDecimal getPerLucro4() {
        return this.getVo().asBigDecimal("PERLUCRO_4");
   }

   public void setPerLucro4(BigDecimal perLucro4) {
        markAsChanged("PERLUCRO_4", perLucro4);
   }

   public BigDecimal getPerLucro5() {
        return this.getVo().asBigDecimal("PERLUCRO_5");
   }

   public void setPerLucro5(BigDecimal perLucro5) {
        markAsChanged("PERLUCRO_5", perLucro5);
   }

   public BigDecimal getPerLucro6() {
        return this.getVo().asBigDecimal("PERLUCRO_6");
   }

   public void setPerLucro6(BigDecimal perLucro6) {
        markAsChanged("PERLUCRO_6", perLucro6);
   }

   public BigDecimal getPerLucro7() {
        return this.getVo().asBigDecimal("PERLUCRO_7");
   }

   public void setPerLucro7(BigDecimal perLucro7) {
        markAsChanged("PERLUCRO_7", perLucro7);
   }

   public BigDecimal getPerLucro8() {
        return this.getVo().asBigDecimal("PERLUCRO_8");
   }

   public void setPerLucro8(BigDecimal perLucro8) {
        markAsChanged("PERLUCRO_8", perLucro8);
   }

   public BigDecimal getPerLucro9() {
        return this.getVo().asBigDecimal("PERLUCRO_9");
   }

   public void setPerLucro9(BigDecimal perLucro9) {
        markAsChanged("PERLUCRO_9", perLucro9);
   }

   public BigDecimal getPeso1() {
        return this.getVo().asBigDecimal("PESO_1");
   }

   public void setPeso1(BigDecimal peso1) {
        markAsChanged("PESO_1", peso1);
   }

   public BigDecimal getPeso10() {
        return this.getVo().asBigDecimal("PESO_10");
   }

   public void setPeso10(BigDecimal peso10) {
        markAsChanged("PESO_10", peso10);
   }

   public BigDecimal getPeso11() {
        return this.getVo().asBigDecimal("PESO_11");
   }

   public void setPeso11(BigDecimal peso11) {
        markAsChanged("PESO_11", peso11);
   }

   public BigDecimal getPeso12() {
        return this.getVo().asBigDecimal("PESO_12");
   }

   public void setPeso12(BigDecimal peso12) {
        markAsChanged("PESO_12", peso12);
   }

   public BigDecimal getPeso2() {
        return this.getVo().asBigDecimal("PESO_2");
   }

   public void setPeso2(BigDecimal peso2) {
        markAsChanged("PESO_2", peso2);
   }

   public BigDecimal getPeso3() {
        return this.getVo().asBigDecimal("PESO_3");
   }

   public void setPeso3(BigDecimal peso3) {
        markAsChanged("PESO_3", peso3);
   }

   public BigDecimal getPeso4() {
        return this.getVo().asBigDecimal("PESO_4");
   }

   public void setPeso4(BigDecimal peso4) {
        markAsChanged("PESO_4", peso4);
   }

   public BigDecimal getPeso5() {
        return this.getVo().asBigDecimal("PESO_5");
   }

   public void setPeso5(BigDecimal peso5) {
        markAsChanged("PESO_5", peso5);
   }

   public BigDecimal getPeso6() {
        return this.getVo().asBigDecimal("PESO_6");
   }

   public void setPeso6(BigDecimal peso6) {
        markAsChanged("PESO_6", peso6);
   }

   public BigDecimal getPeso7() {
        return this.getVo().asBigDecimal("PESO_7");
   }

   public void setPeso7(BigDecimal peso7) {
        markAsChanged("PESO_7", peso7);
   }

   public BigDecimal getPeso8() {
        return this.getVo().asBigDecimal("PESO_8");
   }

   public void setPeso8(BigDecimal peso8) {
        markAsChanged("PESO_8", peso8);
   }

   public BigDecimal getPeso9() {
        return this.getVo().asBigDecimal("PESO_9");
   }

   public void setPeso9(BigDecimal peso9) {
        markAsChanged("PESO_9", peso9);
   }

   public BigDecimal getPopTotal() {
        return this.getVo().asBigDecimal("POPTOTAL");
   }

   public void setPopTotal(BigDecimal popTotal) {
        markAsChanged("POPTOTAL", popTotal);
   }

   public BigDecimal getPopularidade1() {
        return this.getVo().asBigDecimal("POPULARIDADE_1");
   }

   public void setPopularidade1(BigDecimal popularidade1) {
        markAsChanged("POPULARIDADE_1", popularidade1);
   }

   public BigDecimal getPopularidade10() {
        return this.getVo().asBigDecimal("POPULARIDADE_10");
   }

   public void setPopularidade10(BigDecimal popularidade10) {
        markAsChanged("POPULARIDADE_10", popularidade10);
   }

   public BigDecimal getPopularidade11() {
        return this.getVo().asBigDecimal("POPULARIDADE_11");
   }

   public void setPopularidade11(BigDecimal popularidade11) {
        markAsChanged("POPULARIDADE_11", popularidade11);
   }

   public BigDecimal getPopularidade12() {
        return this.getVo().asBigDecimal("POPULARIDADE_12");
   }

   public void setPopularidade12(BigDecimal popularidade12) {
        markAsChanged("POPULARIDADE_12", popularidade12);
   }

   public BigDecimal getPopularidade2() {
        return this.getVo().asBigDecimal("POPULARIDADE_2");
   }

   public void setPopularidade2(BigDecimal popularidade2) {
        markAsChanged("POPULARIDADE_2", popularidade2);
   }

   public BigDecimal getPopularidade3() {
        return this.getVo().asBigDecimal("POPULARIDADE_3");
   }

   public void setPopularidade3(BigDecimal popularidade3) {
        markAsChanged("POPULARIDADE_3", popularidade3);
   }

   public BigDecimal getPopularidade4() {
        return this.getVo().asBigDecimal("POPULARIDADE_4");
   }

   public void setPopularidade4(BigDecimal popularidade4) {
        markAsChanged("POPULARIDADE_4", popularidade4);
   }

   public BigDecimal getPopularidade5() {
        return this.getVo().asBigDecimal("POPULARIDADE_5");
   }

   public void setPopularidade5(BigDecimal popularidade5) {
        markAsChanged("POPULARIDADE_5", popularidade5);
   }

   public BigDecimal getPartMargContFat3() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_3");
   }

   public void setPartMargContFat3(BigDecimal partMargContFat3) {
        markAsChanged("PARTMARGCONTFAT_3", partMargContFat3);
   }

   public BigDecimal getPartMargContFat4() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_4");
   }

   public void setPartMargContFat4(BigDecimal partMargContFat4) {
        markAsChanged("PARTMARGCONTFAT_4", partMargContFat4);
   }

   public BigDecimal getCustoVenda6() {
        return this.getVo().asBigDecimal("CUSTOVENDA_6");
   }

   public void setCustoVenda6(BigDecimal custoVenda6) {
        markAsChanged("CUSTOVENDA_6", custoVenda6);
   }

   public BigDecimal getCustoVenda7() {
        return this.getVo().asBigDecimal("CUSTOVENDA_7");
   }

   public void setCustoVenda7(BigDecimal custoVenda7) {
        markAsChanged("CUSTOVENDA_7", custoVenda7);
   }

   public BigDecimal getCustoVenda8() {
        return this.getVo().asBigDecimal("CUSTOVENDA_8");
   }

   public void setCustoVenda8(BigDecimal custoVenda8) {
        markAsChanged("CUSTOVENDA_8", custoVenda8);
   }

   public BigDecimal getCustoVenda9() {
        return this.getVo().asBigDecimal("CUSTOVENDA_9");
   }

   public void setCustoVenda9(BigDecimal custoVenda9) {
        markAsChanged("CUSTOVENDA_9", custoVenda9);
   }

   public BigDecimal getCustoVndTotal1() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_1");
   }

   public void setCustoVndTotal1(BigDecimal custoVndTotal1) {
        markAsChanged("CUSTOVNDTOTAL_1", custoVndTotal1);
   }

   public BigDecimal getCustoVndTotal10() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_10");
   }

   public void setCustoVndTotal10(BigDecimal custoVndTotal10) {
        markAsChanged("CUSTOVNDTOTAL_10", custoVndTotal10);
   }

   public BigDecimal getCustoVndTotal11() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_11");
   }

   public void setCustoVndTotal11(BigDecimal custoVndTotal11) {
        markAsChanged("CUSTOVNDTOTAL_11", custoVndTotal11);
   }

   public BigDecimal getCustoVndTotal12() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_12");
   }

   public void setCustoVndTotal12(BigDecimal custoVndTotal12) {
        markAsChanged("CUSTOVNDTOTAL_12", custoVndTotal12);
   }

   public BigDecimal getCustoVndTotal2() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_2");
   }

   public void setCustoVndTotal2(BigDecimal custoVndTotal2) {
        markAsChanged("CUSTOVNDTOTAL_2", custoVndTotal2);
   }

   public BigDecimal getCustoVndTotal3() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_3");
   }

   public void setCustoVndTotal3(BigDecimal custoVndTotal3) {
        markAsChanged("CUSTOVNDTOTAL_3", custoVndTotal3);
   }

   public BigDecimal getCustoVndTotal4() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_4");
   }

   public void setCustoVndTotal4(BigDecimal custoVndTotal4) {
        markAsChanged("CUSTOVNDTOTAL_4", custoVndTotal4);
   }

   public BigDecimal getCustoVndTotal5() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_5");
   }

   public void setCustoVndTotal5(BigDecimal custoVndTotal5) {
        markAsChanged("CUSTOVNDTOTAL_5", custoVndTotal5);
   }

   public BigDecimal getCustoVndTotal6() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_6");
   }

   public void setCustoVndTotal6(BigDecimal custoVndTotal6) {
        markAsChanged("CUSTOVNDTOTAL_6", custoVndTotal6);
   }

   public BigDecimal getCustoVndTotal7() {
        return this.getVo().asBigDecimal("CUSTOVNDTOTAL_7");
   }

   public void setCustoVndTotal7(BigDecimal custoVndTotal7) {
        markAsChanged("CUSTOVNDTOTAL_7", custoVndTotal7);
   }

   public BigDecimal getCustoVenda10() {
        return this.getVo().asBigDecimal("CUSTOVENDA_10");
   }

   public void setCustoVenda10(BigDecimal custoVenda10) {
        markAsChanged("CUSTOVENDA_10", custoVenda10);
   }

   public BigDecimal getCustoVenda11() {
        return this.getVo().asBigDecimal("CUSTOVENDA_11");
   }

   public void setCustoVenda11(BigDecimal custoVenda11) {
        markAsChanged("CUSTOVENDA_11", custoVenda11);
   }

   public BigDecimal getPopularidade6() {
        return this.getVo().asBigDecimal("POPULARIDADE_6");
   }

   public void setPopularidade6(BigDecimal popularidade6) {
        markAsChanged("POPULARIDADE_6", popularidade6);
   }

   public BigDecimal getVlrUnit7() {
        return this.getVo().asBigDecimal("VLRUNIT_7");
   }

   public void setVlrUnit7(BigDecimal vlrUnit7) {
        markAsChanged("VLRUNIT_7", vlrUnit7);
   }

   public BigDecimal getVlrUnit8() {
        return this.getVo().asBigDecimal("VLRUNIT_8");
   }

   public void setVlrUnit8(BigDecimal vlrUnit8) {
        markAsChanged("VLRUNIT_8", vlrUnit8);
   }

   public BigDecimal getVlrUnit9() {
        return this.getVo().asBigDecimal("VLRUNIT_9");
   }

   public void setVlrUnit9(BigDecimal vlrUnit9) {
        markAsChanged("VLRUNIT_9", vlrUnit9);
   }

   public BigDecimal getVlrVenda1() {
        return this.getVo().asBigDecimal("VLRVENDA_1");
   }

   public void setVlrVenda1(BigDecimal vlrVenda1) {
        markAsChanged("VLRVENDA_1", vlrVenda1);
   }

   public BigDecimal getVlrVenda10() {
        return this.getVo().asBigDecimal("VLRVENDA_10");
   }

   public void setVlrVenda10(BigDecimal vlrVenda10) {
        markAsChanged("VLRVENDA_10", vlrVenda10);
   }

   public BigDecimal getVlrVenda11() {
        return this.getVo().asBigDecimal("VLRVENDA_11");
   }

   public void setVlrVenda11(BigDecimal vlrVenda11) {
        markAsChanged("VLRVENDA_11", vlrVenda11);
   }

   public BigDecimal getVlrVenda12() {
        return this.getVo().asBigDecimal("VLRVENDA_12");
   }

   public void setVlrVenda12(BigDecimal vlrVenda12) {
        markAsChanged("VLRVENDA_12", vlrVenda12);
   }

   public BigDecimal getVlrVenda2() {
        return this.getVo().asBigDecimal("VLRVENDA_2");
   }

   public void setVlrVenda2(BigDecimal vlrVenda2) {
        markAsChanged("VLRVENDA_2", vlrVenda2);
   }

   public BigDecimal getVlrVenda3() {
        return this.getVo().asBigDecimal("VLRVENDA_3");
   }

   public void setVlrVenda3(BigDecimal vlrVenda3) {
        markAsChanged("VLRVENDA_3", vlrVenda3);
   }

   public BigDecimal getVlrVenda4() {
        return this.getVo().asBigDecimal("VLRVENDA_4");
   }

   public void setVlrVenda4(BigDecimal vlrVenda4) {
        markAsChanged("VLRVENDA_4", vlrVenda4);
   }

   public BigDecimal getVlrVenda5() {
        return this.getVo().asBigDecimal("VLRVENDA_5");
   }

   public void setVlrVenda5(BigDecimal vlrVenda5) {
        markAsChanged("VLRVENDA_5", vlrVenda5);
   }

   public BigDecimal getVlrVenda6() {
        return this.getVo().asBigDecimal("VLRVENDA_6");
   }

   public void setVlrVenda6(BigDecimal vlrVenda6) {
        markAsChanged("VLRVENDA_6", vlrVenda6);
   }

   public BigDecimal getVlrVenda7() {
        return this.getVo().asBigDecimal("VLRVENDA_7");
   }

   public void setVlrVenda7(BigDecimal vlrVenda7) {
        markAsChanged("VLRVENDA_7", vlrVenda7);
   }

   public BigDecimal getVlrVenda8() {
        return this.getVo().asBigDecimal("VLRVENDA_8");
   }

   public void setVlrVenda8(BigDecimal vlrVenda8) {
        markAsChanged("VLRVENDA_8", vlrVenda8);
   }

   public BigDecimal getVlrVenda9() {
        return this.getVo().asBigDecimal("VLRVENDA_9");
   }

   public void setVlrVenda9(BigDecimal vlrVenda9) {
        markAsChanged("VLRVENDA_9", vlrVenda9);
   }

   public BigDecimal getVlrVendiaUtil1() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_1");
   }

   public void setVlrVendiaUtil1(BigDecimal vlrVendiaUtil1) {
        markAsChanged("VLRVENDIAUTIL_1", vlrVendiaUtil1);
   }

   public BigDecimal getVlrVendiaUtil10() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_10");
   }

   public void setVlrVendiaUtil10(BigDecimal vlrVendiaUtil10) {
        markAsChanged("VLRVENDIAUTIL_10", vlrVendiaUtil10);
   }

   public BigDecimal getVlrVendiaUtil11() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_11");
   }

   public void setVlrVendiaUtil11(BigDecimal vlrVendiaUtil11) {
        markAsChanged("VLRVENDIAUTIL_11", vlrVendiaUtil11);
   }

   public BigDecimal getVlrVendiaUtil12() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_12");
   }

   public void setVlrVendiaUtil12(BigDecimal vlrVendiaUtil12) {
        markAsChanged("VLRVENDIAUTIL_12", vlrVendiaUtil12);
   }

   public BigDecimal getVlrVendiaUtil2() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_2");
   }

   public void setVlrVendiaUtil2(BigDecimal vlrVendiaUtil2) {
        markAsChanged("VLRVENDIAUTIL_2", vlrVendiaUtil2);
   }

   public BigDecimal getVlrVendiaUtil3() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_3");
   }

   public void setVlrVendiaUtil3(BigDecimal vlrVendiaUtil3) {
        markAsChanged("VLRVENDIAUTIL_3", vlrVendiaUtil3);
   }

   public BigDecimal getVlrVendiaUtil4() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_4");
   }

   public void setVlrVendiaUtil4(BigDecimal vlrVendiaUtil4) {
        markAsChanged("VLRVENDIAUTIL_4", vlrVendiaUtil4);
   }

   public BigDecimal getVlrVendiaUtil5() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_5");
   }

   public void setVlrVendiaUtil5(BigDecimal vlrVendiaUtil5) {
        markAsChanged("VLRVENDIAUTIL_5", vlrVendiaUtil5);
   }

   public BigDecimal getVlrVendiaUtil6() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_6");
   }

   public void setVlrVendiaUtil6(BigDecimal vlrVendiaUtil6) {
        markAsChanged("VLRVENDIAUTIL_6", vlrVendiaUtil6);
   }

   public BigDecimal getVlrVendiaUtil7() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_7");
   }

   public void setVlrVendiaUtil7(BigDecimal vlrVendiaUtil7) {
        markAsChanged("VLRVENDIAUTIL_7", vlrVendiaUtil7);
   }

   public BigDecimal getVlrVendiaUtil8() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_8");
   }

   public void setVlrVendiaUtil8(BigDecimal vlrVendiaUtil8) {
        markAsChanged("VLRVENDIAUTIL_8", vlrVendiaUtil8);
   }

   public BigDecimal getVlrVendiaUtil9() {
        return this.getVo().asBigDecimal("VLRVENDIAUTIL_9");
   }

   public void setVlrVendiaUtil9(BigDecimal vlrVendiaUtil9) {
        markAsChanged("VLRVENDIAUTIL_9", vlrVendiaUtil9);
   }

   public String getCurvaTot5() {
        return this.getVo().asString("CURVATOT_5");
   }

   public void setCurvaTot5(String curvaTot5) {
        markAsChanged("CURVATOT_5", curvaTot5);
   }

   public BigDecimal getPartMargContFat1() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_1");
   }

   public void setPartMargContFat1(BigDecimal partMargContFat1) {
        markAsChanged("PARTMARGCONTFAT_1", partMargContFat1);
   }

   public BigDecimal getPartMargContFat10() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_10");
   }

   public void setPartMargContFat10(BigDecimal partMargContFat10) {
        markAsChanged("PARTMARGCONTFAT_10", partMargContFat10);
   }

   public BigDecimal getPartMargContFat11() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_11");
   }

   public void setPartMargContFat11(BigDecimal partMargContFat11) {
        markAsChanged("PARTMARGCONTFAT_11", partMargContFat11);
   }

   public BigDecimal getPartMargContFat12() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_12");
   }

   public void setPartMargContFat12(BigDecimal partMargContFat12) {
        markAsChanged("PARTMARGCONTFAT_12", partMargContFat12);
   }

   public BigDecimal getPartMargContFat2() {
        return this.getVo().asBigDecimal("PARTMARGCONTFAT_2");
   }

   public void setPartMargContFat2(BigDecimal partMargContFat2) {
        markAsChanged("PARTMARGCONTFAT_2", partMargContFat2);
   }

   public BigDecimal getVlrGastoVar3() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_3");
   }

   public void setVlrGastoVar3(BigDecimal vlrGastoVar3) {
        markAsChanged("VLRGASTOVAR_3", vlrGastoVar3);
   }

   public BigDecimal getVlrGastoVar4() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_4");
   }

   public void setVlrGastoVar4(BigDecimal vlrGastoVar4) {
        markAsChanged("VLRGASTOVAR_4", vlrGastoVar4);
   }

   public BigDecimal getVlrGastoVar5() {
        return this.getVo().asBigDecimal("VLRGASTOVAR_5");
   }

   public void setVlrGastoVar5(BigDecimal vlrGastoVar5) {
        markAsChanged("VLRGASTOVAR_5", vlrGastoVar5);
   }

   public BigDecimal getAcumPeso7() {
        return this.getVo().asBigDecimal("ACUMPESO_7");
   }

   public void setAcumPeso7(BigDecimal acumPeso7) {
        markAsChanged("ACUMPESO_7", acumPeso7);
   }

   public BigDecimal getAcumPeso8() {
        return this.getVo().asBigDecimal("ACUMPESO_8");
   }

   public void setAcumPeso8(BigDecimal acumPeso8) {
        markAsChanged("ACUMPESO_8", acumPeso8);
   }

   public BigDecimal getAcumPeso9() {
        return this.getVo().asBigDecimal("ACUMPESO_9");
   }

   public void setAcumPeso9(BigDecimal acumPeso9) {
        markAsChanged("ACUMPESO_9", acumPeso9);
   }

   public BigDecimal getAcumQtd1() {
        return this.getVo().asBigDecimal("ACUMQTD_1");
   }

   public void setAcumQtd1(BigDecimal acumQtd1) {
        markAsChanged("ACUMQTD_1", acumQtd1);
   }

   public BigDecimal getAcumQtd10() {
        return this.getVo().asBigDecimal("ACUMQTD_10");
   }

   public void setAcumQtd10(BigDecimal acumQtd10) {
        markAsChanged("ACUMQTD_10", acumQtd10);
   }

   public BigDecimal getAcumQtd11() {
        return this.getVo().asBigDecimal("ACUMQTD_11");
   }

   public void setAcumQtd11(BigDecimal acumQtd11) {
        markAsChanged("ACUMQTD_11", acumQtd11);
   }

   public BigDecimal getAcumQtd12() {
        return this.getVo().asBigDecimal("ACUMQTD_12");
   }

   public void setAcumQtd12(BigDecimal acumQtd12) {
        markAsChanged("ACUMQTD_12", acumQtd12);
   }

   public BigDecimal getAcumQtd2() {
        return this.getVo().asBigDecimal("ACUMQTD_2");
   }

   public void setAcumQtd2(BigDecimal acumQtd2) {
        markAsChanged("ACUMQTD_2", acumQtd2);
   }

   public BigDecimal getAcumQtd3() {
        return this.getVo().asBigDecimal("ACUMQTD_3");
   }

   public void setAcumQtd3(BigDecimal acumQtd3) {
        markAsChanged("ACUMQTD_3", acumQtd3);
   }

   public BigDecimal getAcumQtd4() {
        return this.getVo().asBigDecimal("ACUMQTD_4");
   }

   public void setAcumQtd4(BigDecimal acumQtd4) {
        markAsChanged("ACUMQTD_4", acumQtd4);
   }

   public BigDecimal getAcumQtd5() {
        return this.getVo().asBigDecimal("ACUMQTD_5");
   }

   public void setAcumQtd5(BigDecimal acumQtd5) {
        markAsChanged("ACUMQTD_5", acumQtd5);
   }

   public BigDecimal getAcumQtd6() {
        return this.getVo().asBigDecimal("ACUMQTD_6");
   }

   public void setAcumQtd6(BigDecimal acumQtd6) {
        markAsChanged("ACUMQTD_6", acumQtd6);
   }

   public BigDecimal getAcumQtd7() {
        return this.getVo().asBigDecimal("ACUMQTD_7");
   }

   public void setAcumQtd7(BigDecimal acumQtd7) {
        markAsChanged("ACUMQTD_7", acumQtd7);
   }

   public BigDecimal getAcumQtd8() {
        return this.getVo().asBigDecimal("ACUMQTD_8");
   }

   public void setAcumQtd8(BigDecimal acumQtd8) {
        markAsChanged("ACUMQTD_8", acumQtd8);
   }

   public BigDecimal getAcumQtd9() {
        return this.getVo().asBigDecimal("ACUMQTD_9");
   }

   public void setAcumQtd9(BigDecimal acumQtd9) {
        markAsChanged("ACUMQTD_9", acumQtd9);
   }

   public BigDecimal getAcumTot1() {
        return this.getVo().asBigDecimal("ACUMTOT_1");
   }

   public void setAcumTot1(BigDecimal acumTot1) {
        markAsChanged("ACUMTOT_1", acumTot1);
   }

   public BigDecimal getAcumTot10() {
        return this.getVo().asBigDecimal("ACUMTOT_10");
   }

   public void setAcumTot10(BigDecimal acumTot10) {
        markAsChanged("ACUMTOT_10", acumTot10);
   }

   public BigDecimal getAcumTot11() {
        return this.getVo().asBigDecimal("ACUMTOT_11");
   }

   public void setAcumTot11(BigDecimal acumTot11) {
        markAsChanged("ACUMTOT_11", acumTot11);
   }

   public BigDecimal getAcumTot12() {
        return this.getVo().asBigDecimal("ACUMTOT_12");
   }

   public void setAcumTot12(BigDecimal acumTot12) {
        markAsChanged("ACUMTOT_12", acumTot12);
   }

   public BigDecimal getAcumTot2() {
        return this.getVo().asBigDecimal("ACUMTOT_2");
   }

   public void setAcumTot2(BigDecimal acumTot2) {
        markAsChanged("ACUMTOT_2", acumTot2);
   }

   public BigDecimal getAcumTot3() {
        return this.getVo().asBigDecimal("ACUMTOT_3");
   }

   public void setAcumTot3(BigDecimal acumTot3) {
        markAsChanged("ACUMTOT_3", acumTot3);
   }

   public BigDecimal getAcumTot4() {
        return this.getVo().asBigDecimal("ACUMTOT_4");
   }

   public void setAcumTot4(BigDecimal acumTot4) {
        markAsChanged("ACUMTOT_4", acumTot4);
   }

   public BigDecimal getAcumTot5() {
        return this.getVo().asBigDecimal("ACUMTOT_5");
   }

   public void setAcumTot5(BigDecimal acumTot5) {
        markAsChanged("ACUMTOT_5", acumTot5);
   }

   public BigDecimal getAcumTot6() {
        return this.getVo().asBigDecimal("ACUMTOT_6");
   }

   public void setAcumTot6(BigDecimal acumTot6) {
        markAsChanged("ACUMTOT_6", acumTot6);
   }

   public BigDecimal getAcumTot7() {
        return this.getVo().asBigDecimal("ACUMTOT_7");
   }

   public void setAcumTot7(BigDecimal acumTot7) {
        markAsChanged("ACUMTOT_7", acumTot7);
   }

   public BigDecimal getAcumTot8() {
        return this.getVo().asBigDecimal("ACUMTOT_8");
   }

   public void setAcumTot8(BigDecimal acumTot8) {
        markAsChanged("ACUMTOT_8", acumTot8);
   }

   public BigDecimal getAcumTot9() {
        return this.getVo().asBigDecimal("ACUMTOT_9");
   }

   public void setAcumTot9(BigDecimal acumTot9) {
        markAsChanged("ACUMTOT_9", acumTot9);
   }

   public BigDecimal getAliqCred() {
        return this.getVo().asBigDecimal("ALIQCRED");
   }

   public void setAliqCred(BigDecimal aliqCred) {
        markAsChanged("ALIQCRED", aliqCred);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getMultipCpa() {
        return this.getVo().asBigDecimal("MULTIPCPA");
   }

   public void setMultipCpa(BigDecimal multipCpa) {
        markAsChanged("MULTIPCPA", multipCpa);
   }

   public BigDecimal getSugCompraGirAjustado() {
        return this.getVo().asBigDecimal("SUGCOMPRAGIRAJUSTADO");
   }

   public void setSugCompraGirAjustado(BigDecimal sugCompraGirAjustado) {
        markAsChanged("SUGCOMPRAGIRAJUSTADO", sugCompraGirAjustado);
   }

   public BigDecimal getSugCompraGirAjustadoMultCpa() {
        return this.getVo().asBigDecimal("SUGCOMPRAGIRAJUSTADOMULTCPA");
   }

   public void setSugCompraGirAjustadoMultCpa(BigDecimal sugCompraGirAjustadoMultCpa) {
        markAsChanged("SUGCOMPRAGIRAJUSTADOMULTCPA", sugCompraGirAjustadoMultCpa);
   }

   public String getTemSugGiroAjustado() {
        return this.getVo().asString("TEMSUGGIROAJUSTADO");
   }

   public void setTemSugGiroAjustado(String temSugGiroAjustado) {
        markAsChanged("TEMSUGGIROAJUSTADO", temSugGiroAjustado);
   }

   public String getUnPadrao() {
        return this.getVo().asString("UNPADRAO");
   }

   public void setUnPadrao(String unPadrao) {
        markAsChanged("UNPADRAO", unPadrao);
   }

   public BigDecimal getSugCompraGirMultCpa() {
        return this.getVo().asBigDecimal("SUGCOMPRAGIRMULTCPA");
   }

   public void setSugCompraGirMultCpa(BigDecimal sugCompraGirMultCpa) {
        markAsChanged("SUGCOMPRAGIRMULTCPA", sugCompraGirMultCpa);
   }

   public BigDecimal getAcumMarg4() {
        return this.getVo().asBigDecimal("ACUMMARG_4");
   }

   public void setAcumMarg4(BigDecimal acumMarg4) {
        markAsChanged("ACUMMARG_4", acumMarg4);
   }

   public BigDecimal getAcumMarg5() {
        return this.getVo().asBigDecimal("ACUMMARG_5");
   }

   public void setAcumMarg5(BigDecimal acumMarg5) {
        markAsChanged("ACUMMARG_5", acumMarg5);
   }

   public BigDecimal getAcumMarg6() {
        return this.getVo().asBigDecimal("ACUMMARG_6");
   }

   public void setAcumMarg6(BigDecimal acumMarg6) {
        markAsChanged("ACUMMARG_6", acumMarg6);
   }

   public BigDecimal getAcumMarg7() {
        return this.getVo().asBigDecimal("ACUMMARG_7");
   }

   public void setAcumMarg7(BigDecimal acumMarg7) {
        markAsChanged("ACUMMARG_7", acumMarg7);
   }

   public BigDecimal getAcumMarg8() {
        return this.getVo().asBigDecimal("ACUMMARG_8");
   }

   public void setAcumMarg8(BigDecimal acumMarg8) {
        markAsChanged("ACUMMARG_8", acumMarg8);
   }

   public BigDecimal getAcumMarg11() {
        return this.getVo().asBigDecimal("ACUMMARG_11");
   }

   public void setAcumMarg11(BigDecimal acumMarg11) {
        markAsChanged("ACUMMARG_11", acumMarg11);
   }

   public BigDecimal getAcumMarg12() {
        return this.getVo().asBigDecimal("ACUMMARG_12");
   }

   public void setAcumMarg12(BigDecimal acumMarg12) {
        markAsChanged("ACUMMARG_12", acumMarg12);
   }

   public BigDecimal getAcumPeso11() {
        return this.getVo().asBigDecimal("ACUMPESO_11");
   }

   public void setAcumPeso11(BigDecimal acumPeso11) {
        markAsChanged("ACUMPESO_11", acumPeso11);
   }

   public BigDecimal getAcumPeso12() {
        return this.getVo().asBigDecimal("ACUMPESO_12");
   }

   public void setAcumPeso12(BigDecimal acumPeso12) {
        markAsChanged("ACUMPESO_12", acumPeso12);
   }

   public BigDecimal getAcumPeso2() {
        return this.getVo().asBigDecimal("ACUMPESO_2");
   }

   public void setAcumPeso2(BigDecimal acumPeso2) {
        markAsChanged("ACUMPESO_2", acumPeso2);
   }

   public BigDecimal getAcumPeso3() {
        return this.getVo().asBigDecimal("ACUMPESO_3");
   }

   public void setAcumPeso3(BigDecimal acumPeso3) {
        markAsChanged("ACUMPESO_3", acumPeso3);
   }

   public BigDecimal getSugCompraMultCpa() {
        return this.getVo().asBigDecimal("SUGCOMPRAMULTCPA");
   }

   public void setSugCompraMultCpa(BigDecimal sugCompraMultCpa) {
        markAsChanged("SUGCOMPRAMULTCPA", sugCompraMultCpa);
   }

   public String getSugCpaGirAlterado() {
        return this.getVo().asString("SUGCPAGIRALTERADO");
   }

   public void setSugCpaGirAlterado(String sugCpaGirAlterado) {
        markAsChanged("SUGCPAGIRALTERADO", sugCpaGirAlterado);
   }

   public BigDecimal getPercDescFornecedor() {
        return this.getVo().asBigDecimal("PERCDESCFORNECEDOR");
   }

   public void setPercDescFornecedor(BigDecimal percDescFornecedor) {
        markAsChanged("PERCDESCFORNECEDOR", percDescFornecedor);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   public BigDecimal getWmsBloqueado() {
        return this.getVo().asBigDecimal("WMSBLOQUEADO");
   }

   public void setWmsBloqueado(BigDecimal wmsBloqueado) {
        markAsChanged("WMSBLOQUEADO", wmsBloqueado);
   }

   public BigDecimal getAccumMarg_2() {
        return this.getVo().asBigDecimal("ACUMMARG_2");
   }

   public void setAccumMarg_2(BigDecimal accumMarg_2) {
        markAsChanged("ACUMMARG_2", accumMarg_2);
   }

   public BigDecimal getAccumMarg_3() {
        return this.getVo().asBigDecimal("ACUMMARG_3");
   }

   public void setAccumMarg_3(BigDecimal accumMarg_3) {
        markAsChanged("ACUMMARG_3", accumMarg_3);
   }

   public BigDecimal getDurEstPosCpAgir() {
        return this.getVo().asBigDecimal("DURESTPOSCPAGIR");
   }

   public void setDurEstPosCpAgir(BigDecimal durEstPosCpAgir) {
        markAsChanged("DURESTPOSCPAGIR", durEstPosCpAgir);
   }

   public BigDecimal getDurEstSeg() {
        return this.getVo().asBigDecimal("DURESTSEG");
   }

   public void setDurEstSeg(BigDecimal durEstSeg) {
        markAsChanged("DURESTSEG", durEstSeg);
   }

   public BigDecimal getDiasUteis() {
        return this.getVo().asBigDecimal("DIASUTEIS");
   }

   public void setDiasUteis(BigDecimal diasUteis) {
        markAsChanged("DIASUTEIS", diasUteis);
   }

   public Timestamp getPrevEntrega() {
        return this.getVo().asTimestamp("PREVENTREGA");
   }

   public void setPrevEntrega(Timestamp prevEntrega) {
        markAsChanged("PREVENTREGA", prevEntrega);
   }

   public BigDecimal getGiroDiario() {
        return this.getVo().asBigDecimal("GIRODIARIO");
   }

   public void setGiroDiario(BigDecimal giroDiario) {
        markAsChanged("GIRODIARIO", giroDiario);
   }

   public Timestamp getPontoPed() {
        return this.getVo().asTimestamp("PONTOPED");
   }

   public void setPontoPed(Timestamp pontoPed) {
        markAsChanged("PONTOPED", pontoPed);
   }

   public BigDecimal getVlrUltCompra() {
        return this.getVo().asBigDecimal("VLRULTCOMPRA");
   }

   public void setVlrUltCompra(BigDecimal vlrUltCompra) {
        markAsChanged("VLRULTCOMPRA", vlrUltCompra);
   }

   public String getPossuiFam() {
        return this.getVo().asString("POSSUIFAM");
   }

   public void setPossuiFam(String possuiFam) {
        markAsChanged("POSSUIFAM", possuiFam);
   }

   public BigDecimal getDiasRuptura() {
        return this.getVo().asBigDecimal("DIASRUPTURA");
   }

   public void setDiasRuptura(BigDecimal diasRuptura) {
        markAsChanged("DIASRUPTURA", diasRuptura);
   }

   public BigDecimal getDiasRupturaEst_1() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_1");
   }

   public void setDiasRupturaEst_1(BigDecimal diasRupturaEst_1) {
        markAsChanged("DIASRUPTURAEST_1", diasRupturaEst_1);
   }

   public BigDecimal getDiasRupturaEst_10() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_10");
   }

   public void setDiasRupturaEst_10(BigDecimal diasRupturaEst_10) {
        markAsChanged("DIASRUPTURAEST_10", diasRupturaEst_10);
   }

   public BigDecimal getDiasRupturaEst_11() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_11");
   }

   public void setDiasRupturaEst_11(BigDecimal diasRupturaEst_11) {
        markAsChanged("DIASRUPTURAEST_11", diasRupturaEst_11);
   }

   public BigDecimal getDiasRupturaEst_12() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_12");
   }

   public void setDiasRupturaEst_12(BigDecimal diasRupturaEst_12) {
        markAsChanged("DIASRUPTURAEST_12", diasRupturaEst_12);
   }

   public BigDecimal getDiasRupturaEst_2() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_2");
   }

   public void setDiasRupturaEst_2(BigDecimal diasRupturaEst_2) {
        markAsChanged("DIASRUPTURAEST_2", diasRupturaEst_2);
   }

   public BigDecimal getDiasRupturaEst_3() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_3");
   }

   public void setDiasRupturaEst_3(BigDecimal diasRupturaEst_3) {
        markAsChanged("DIASRUPTURAEST_3", diasRupturaEst_3);
   }

   public BigDecimal getDiasRupturaEst_4() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_4");
   }

   public void setDiasRupturaEst_4(BigDecimal diasRupturaEst_4) {
        markAsChanged("DIASRUPTURAEST_4", diasRupturaEst_4);
   }

   public BigDecimal getDiasRupturaEst_5() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_5");
   }

   public void setDiasRupturaEst_5(BigDecimal diasRupturaEst_5) {
        markAsChanged("DIASRUPTURAEST_5", diasRupturaEst_5);
   }

   public BigDecimal getDiasRupturaEst_6() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_6");
   }

   public void setDiasRupturaEst_6(BigDecimal diasRupturaEst_6) {
        markAsChanged("DIASRUPTURAEST_6", diasRupturaEst_6);
   }

   public BigDecimal getDiasRupturaEst_7() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_7");
   }

   public void setDiasRupturaEst_7(BigDecimal diasRupturaEst_7) {
        markAsChanged("DIASRUPTURAEST_7", diasRupturaEst_7);
   }

   public BigDecimal getDiasRupturaEst_8() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_8");
   }

   public void setDiasRupturaEst_8(BigDecimal diasRupturaEst_8) {
        markAsChanged("DIASRUPTURAEST_8", diasRupturaEst_8);
   }

   public BigDecimal getDiasRupturaEst_9() {
        return this.getVo().asBigDecimal("DIASRUPTURAEST_9");
   }

   public void setDiasRupturaEst_9(BigDecimal diasRupturaEst_9) {
        markAsChanged("DIASRUPTURAEST_9", diasRupturaEst_9);
   }

   public BigDecimal getNumMps() {
        return this.getVo().asBigDecimal("NUMMPS");
   }

   public void setNumMps(BigDecimal numMps) {
        markAsChanged("NUMMPS", numMps);
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
        this.setVo(vo);
        return this;
   }
}
