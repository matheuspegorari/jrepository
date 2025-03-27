package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InventarioRotativo extends AbstractSankhyaEntity<InventarioRotativo> {
   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhContagem() {
        return this.getVo().asTimestamp("DHCONTAGEM");
   }

   public void setDhContagem(Timestamp dhContagem) {
        markAsChanged("DHCONTAGEM", dhContagem);
   }

   public BigDecimal getDivergenciaPad() {
        return this.getVo().asBigDecimal("DIVERGENCIAPAD");
   }

   public void setDivergenciaPad(BigDecimal divergenciaPad) {
        markAsChanged("DIVERGENCIAPAD", divergenciaPad);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public BigDecimal getNuAjuste() {
        return this.getVo().asBigDecimal("NUAJUSTE");
   }

   public void setNuAjuste(BigDecimal nuAjuste) {
        markAsChanged("NUAJUSTE", nuAjuste);
   }

   public BigDecimal getNuIvt() {
        return this.getVo().asBigDecimal("NUIVT");
   }

   public void setNuIvt(BigDecimal nuIvt) {
        markAsChanged("NUIVT", nuIvt);
   }

   public BigDecimal getQtdEstContada() {
        return this.getVo().asBigDecimal("QTDESTCONTADA");
   }

   public void setQtdEstContada(BigDecimal qtdEstContada) {
        markAsChanged("QTDESTCONTADA", qtdEstContada);
   }

   public BigDecimal getQtdEstContadaPad() {
        return this.getVo().asBigDecimal("QTDESTCONTADAPAD");
   }

   public void setQtdEstContadaPad(BigDecimal qtdEstContadaPad) {
        markAsChanged("QTDESTCONTADAPAD", qtdEstContadaPad);
   }

   public BigDecimal getQtdEstLogica() {
        return this.getVo().asBigDecimal("QTDESTLOGICA");
   }

   public void setQtdEstLogica(BigDecimal qtdEstLogica) {
        markAsChanged("QTDESTLOGICA", qtdEstLogica);
   }

   public BigDecimal getQtdEstLogicaPad() {
        return this.getVo().asBigDecimal("QTDESTLOGICAPAD");
   }

   public void setQtdEstLogicaPad(BigDecimal qtdEstLogicaPad) {
        markAsChanged("QTDESTLOGICAPAD", qtdEstLogicaPad);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipoDivergencia() {
        return this.getVo().asString("TIPODIVERGENCIA");
   }

   public void setTipoDivergencia(String tipoDivergencia) {
        markAsChanged("TIPODIVERGENCIA", tipoDivergencia);
   }

   public BigDecimal getDivergencia() {
        return this.getVo().asBigDecimal("DIVERGENCIA");
   }

   public void setDivergencia(BigDecimal divergencia) {
        markAsChanged("DIVERGENCIA", divergencia);
   }

   public Timestamp getDtRec() {
        return this.getVo().asTimestamp("DTREC");
   }

   public void setDtRec(Timestamp dtRec) {
        markAsChanged("DTREC", dtRec);
   }

   public BigDecimal getQtdEstLogicaUma() {
        return this.getVo().asBigDecimal("QTDESTLOGICAUMA");
   }

   public void setQtdEstLogicaUma(BigDecimal qtdEstLogicaUma) {
        markAsChanged("QTDESTLOGICAUMA", qtdEstLogicaUma);
   }

   public BigDecimal getQtdEstLogicaUmaPad() {
        return this.getVo().asBigDecimal("QTDESTLOGICAUMAPAD");
   }

   public void setQtdEstLogicaUmaPad(BigDecimal qtdEstLogicaUmaPad) {
        markAsChanged("QTDESTLOGICAUMAPAD", qtdEstLogicaUmaPad);
   }

   @Override
   public String getTableName() {
        return "TGWIVR";
   }

   @Override
   public String getEntityName() {
        return "InventarioRotativo";
   }

   @Override
   public InventarioRotativo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
