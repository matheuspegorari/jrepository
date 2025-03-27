package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Regiao extends AbstractSankhyaEntity<Regiao> {
   public String getAnalitica() {
        return this.getVo().asString("ANALITICA");
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
   }

   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodRegPai() {
        return this.getVo().asBigDecimal("CODREGPAI");
   }

   public void setCodRegPai(BigDecimal codRegPai) {
        markAsChanged("CODREGPAI", codRegPai);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTabMin() {
        return this.getVo().asBigDecimal("CODTABMIN");
   }

   public void setCodTabMin(BigDecimal codTabMin) {
        markAsChanged("CODTABMIN", codTabMin);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getFreteMin() {
        return this.getVo().asBigDecimal("FRETEMIN");
   }

   public void setFreteMin(BigDecimal freteMin) {
        markAsChanged("FRETEMIN", freteMin);
   }

   public String getGerarReceita() {
        return this.getVo().asString("GERARRECEITA");
   }

   public void setGerarReceita(String gerarReceita) {
        markAsChanged("GERARRECEITA", gerarReceita);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getNomeReg() {
        return this.getVo().asString("NOMEREG");
   }

   public void setNomeReg(String nomeReg) {
        markAsChanged("NOMEREG", nomeReg);
   }

   public BigDecimal getPercAdicional() {
        return this.getVo().asBigDecimal("PERCADICIONAL");
   }

   public void setPercAdicional(BigDecimal percAdicional) {
        markAsChanged("PERCADICIONAL", percAdicional);
   }

   public BigDecimal getPercCusVar() {
        return this.getVo().asBigDecimal("PERCCUSVAR");
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
   }

   public BigDecimal getPercDescFob() {
        return this.getVo().asBigDecimal("PERCDESCFOB");
   }

   public void setPercDescFob(BigDecimal percDescFob) {
        markAsChanged("PERCDESCFOB", percDescFob);
   }

   public BigDecimal getPercPremio() {
        return this.getVo().asBigDecimal("PERCPREMIO");
   }

   public void setPercPremio(BigDecimal percPremio) {
        markAsChanged("PERCPREMIO", percPremio);
   }

   public BigDecimal getSemana1Dom() {
        return this.getVo().asBigDecimal("SEMANA1_DOM");
   }

   public void setSemana1Dom(BigDecimal semana1Dom) {
        markAsChanged("SEMANA1_DOM", semana1Dom);
   }

   public BigDecimal getSemana1Qua() {
        return this.getVo().asBigDecimal("SEMANA1_QUA");
   }

   public void setSemana1Qua(BigDecimal semana1Qua) {
        markAsChanged("SEMANA1_QUA", semana1Qua);
   }

   public BigDecimal getSemana1Qui() {
        return this.getVo().asBigDecimal("SEMANA1_QUI");
   }

   public void setSemana1Qui(BigDecimal semana1Qui) {
        markAsChanged("SEMANA1_QUI", semana1Qui);
   }

   public BigDecimal getSemana1Sab() {
        return this.getVo().asBigDecimal("SEMANA1_SAB");
   }

   public void setSemana1Sab(BigDecimal semana1Sab) {
        markAsChanged("SEMANA1_SAB", semana1Sab);
   }

   public BigDecimal getSemana1Seg() {
        return this.getVo().asBigDecimal("SEMANA1_SEG");
   }

   public void setSemana1Seg(BigDecimal semana1Seg) {
        markAsChanged("SEMANA1_SEG", semana1Seg);
   }

   public BigDecimal getSemana1Sex() {
        return this.getVo().asBigDecimal("SEMANA1_SEX");
   }

   public void setSemana1Sex(BigDecimal semana1Sex) {
        markAsChanged("SEMANA1_SEX", semana1Sex);
   }

   public BigDecimal getSemana1Ter() {
        return this.getVo().asBigDecimal("SEMANA1_TER");
   }

   public void setSemana1Ter(BigDecimal semana1Ter) {
        markAsChanged("SEMANA1_TER", semana1Ter);
   }

   public BigDecimal getSemana2Dom() {
        return this.getVo().asBigDecimal("SEMANA2_DOM");
   }

   public void setSemana2Dom(BigDecimal semana2Dom) {
        markAsChanged("SEMANA2_DOM", semana2Dom);
   }

   public BigDecimal getSemana2Qua() {
        return this.getVo().asBigDecimal("SEMANA2_QUA");
   }

   public void setSemana2Qua(BigDecimal semana2Qua) {
        markAsChanged("SEMANA2_QUA", semana2Qua);
   }

   public BigDecimal getSemana2Qui() {
        return this.getVo().asBigDecimal("SEMANA2_QUI");
   }

   public void setSemana2Qui(BigDecimal semana2Qui) {
        markAsChanged("SEMANA2_QUI", semana2Qui);
   }

   public BigDecimal getSemana2Sab() {
        return this.getVo().asBigDecimal("SEMANA2_SAB");
   }

   public void setSemana2Sab(BigDecimal semana2Sab) {
        markAsChanged("SEMANA2_SAB", semana2Sab);
   }

   public BigDecimal getSemana2Seg() {
        return this.getVo().asBigDecimal("SEMANA2_SEG");
   }

   public void setSemana2Seg(BigDecimal semana2Seg) {
        markAsChanged("SEMANA2_SEG", semana2Seg);
   }

   public BigDecimal getSemana2Sex() {
        return this.getVo().asBigDecimal("SEMANA2_SEX");
   }

   public void setSemana2Sex(BigDecimal semana2Sex) {
        markAsChanged("SEMANA2_SEX", semana2Sex);
   }

   public BigDecimal getSemana2Ter() {
        return this.getVo().asBigDecimal("SEMANA2_TER");
   }

   public void setSemana2Ter(BigDecimal semana2Ter) {
        markAsChanged("SEMANA2_TER", semana2Ter);
   }

   public BigDecimal getVlrAntecipacao() {
        return this.getVo().asBigDecimal("VLRANTECIPACAO");
   }

   public void setVlrAntecipacao(BigDecimal vlrAntecipacao) {
        markAsChanged("VLRANTECIPACAO", vlrAntecipacao);
   }

   public BigDecimal getVendaMin() {
        return this.getVo().asBigDecimal("VENDAMIN");
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
   }

   @Override
   public String getTableName() {
        return "TSIREG";
   }

   @Override
   public String getEntityName() {
        return "Regiao";
   }

   @Override
   public Regiao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
