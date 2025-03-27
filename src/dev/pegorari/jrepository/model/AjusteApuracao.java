package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteApuracao extends AbstractSankhyaEntity<AjusteApuracao> {
   public String getCodAjuste() {
        return this.getVo().asString("CODAJUSTE");
   }

   public void setCodAjuste(String codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDebEsp() {
        return this.getVo().asString("DEBESP");
   }

   public void setDebEsp(String debEsp) {
        markAsChanged("DEBESP", debEsp);
   }

   public String getDescrProcesso() {
        return this.getVo().asString("DESCRPROCESSO");
   }

   public void setDescrProcesso(String descrProcesso) {
        markAsChanged("DESCRPROCESSO", descrProcesso);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getNuAja() {
        return this.getVo().asBigDecimal("NUAJA");
   }

   public void setNuAja(BigDecimal nuAja) {
        markAsChanged("NUAJA", nuAja);
   }

   public String getNumDa() {
        return this.getVo().asString("NUMDA");
   }

   public void setNumDa(String numDa) {
        markAsChanged("NUMDA", numDa);
   }

   public String getNumProcesso() {
        return this.getVo().asString("NUMPROCESSO");
   }

   public void setNumProcesso(String numProcesso) {
        markAsChanged("NUMPROCESSO", numProcesso);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getOrigProcesso() {
        return this.getVo().asBigDecimal("ORIGPROCESSO");
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        markAsChanged("ORIGPROCESSO", origProcesso);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipAjuste() {
        return this.getVo().asBigDecimal("TIPAJUSTE");
   }

   public void setTipAjuste(BigDecimal tipAjuste) {
        markAsChanged("TIPAJUSTE", tipAjuste);
   }

   public BigDecimal getTipApuracao() {
        return this.getVo().asBigDecimal("TIPAPURACAO");
   }

   public void setTipApuracao(BigDecimal tipApuracao) {
        markAsChanged("TIPAPURACAO", tipApuracao);
   }

   public String getTipImposto() {
        return this.getVo().asString("TIPIMPOSTO");
   }

   public void setTipImposto(String tipImposto) {
        markAsChanged("TIPIMPOSTO", tipImposto);
   }

   public BigDecimal getVlrAjuste() {
        return this.getVo().asBigDecimal("VLRAJUSTE");
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
   }

   public BigDecimal getCodCfg() {
        return this.getVo().asBigDecimal("CODCFG");
   }

   public void setCodCfg(BigDecimal codCfg) {
        markAsChanged("CODCFG", codCfg);
   }

   public String getIndSubApuracao() {
        return this.getVo().asString("INDSUBAPURACAO");
   }

   public void setIndSubApuracao(String indSubApuracao) {
        markAsChanged("INDSUBAPURACAO", indSubApuracao);
   }

   public String getSubApuracao() {
        return this.getVo().asString("SUBAPURACAO");
   }

   public void setSubApuracao(String subApuracao) {
        markAsChanged("SUBAPURACAO", subApuracao);
   }

   public String getApuracaoUf() {
        return this.getVo().asString("APURACAOUF");
   }

   public void setApuracaoUf(String apuracaoUf) {
        markAsChanged("APURACAOUF", apuracaoUf);
   }

   public String getRegAjdime() {
        return this.getVo().asString("REGAJDIME");
   }

   public void setRegAjdime(String regAjdime) {
        markAsChanged("REGAJDIME", regAjdime);
   }

   @Override
   public String getTableName() {
        return "TGFAJA";
   }

   @Override
   public String getEntityName() {
        return "AjusteApuracao";
   }

   @Override
   public AjusteApuracao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
