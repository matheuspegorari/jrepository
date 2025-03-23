package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Regiao extends AbstractSankhyaEntity<Regiao> {
   private String analitica;
   private String ativa;
   private BigDecimal codReg;
   private BigDecimal codRegPai;
   private BigDecimal codTab;
   private BigDecimal codTabMin;
   private BigDecimal codVend;
   private BigDecimal freteMin;
   private String gerarReceita;
   private BigDecimal grau;
   private String nomeReg;
   private BigDecimal percAdicional;
   private BigDecimal percCusVar;
   private BigDecimal percDescFob;
   private BigDecimal percPremio;
   private BigDecimal semana1Dom;
   private BigDecimal semana1Qua;
   private BigDecimal semana1Qui;
   private BigDecimal semana1Sab;
   private BigDecimal semana1Seg;
   private BigDecimal semana1Sex;
   private BigDecimal semana1Ter;
   private BigDecimal semana2Dom;
   private BigDecimal semana2Qua;
   private BigDecimal semana2Qui;
   private BigDecimal semana2Sab;
   private BigDecimal semana2Seg;
   private BigDecimal semana2Sex;
   private BigDecimal semana2Ter;
   private BigDecimal vlrAntecipacao;
   private BigDecimal vendaMin;

   public String getAnalitica() {
        return analitica;
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
        this.analitica = analitica;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
        this.ativa = ativa;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodRegPai() {
        return codRegPai;
   }

   public void setCodRegPai(BigDecimal codRegPai) {
        markAsChanged("CODREGPAI", codRegPai);
        this.codRegPai = codRegPai;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTabMin() {
        return codTabMin;
   }

   public void setCodTabMin(BigDecimal codTabMin) {
        markAsChanged("CODTABMIN", codTabMin);
        this.codTabMin = codTabMin;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getFreteMin() {
        return freteMin;
   }

   public void setFreteMin(BigDecimal freteMin) {
        markAsChanged("FRETEMIN", freteMin);
        this.freteMin = freteMin;
   }

   public String getGerarReceita() {
        return gerarReceita;
   }

   public void setGerarReceita(String gerarReceita) {
        markAsChanged("GERARRECEITA", gerarReceita);
        this.gerarReceita = gerarReceita;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getNomeReg() {
        return nomeReg;
   }

   public void setNomeReg(String nomeReg) {
        markAsChanged("NOMEREG", nomeReg);
        this.nomeReg = nomeReg;
   }

   public BigDecimal getPercAdicional() {
        return percAdicional;
   }

   public void setPercAdicional(BigDecimal percAdicional) {
        markAsChanged("PERCADICIONAL", percAdicional);
        this.percAdicional = percAdicional;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
        this.percCusVar = percCusVar;
   }

   public BigDecimal getPercDescFob() {
        return percDescFob;
   }

   public void setPercDescFob(BigDecimal percDescFob) {
        markAsChanged("PERCDESCFOB", percDescFob);
        this.percDescFob = percDescFob;
   }

   public BigDecimal getPercPremio() {
        return percPremio;
   }

   public void setPercPremio(BigDecimal percPremio) {
        markAsChanged("PERCPREMIO", percPremio);
        this.percPremio = percPremio;
   }

   public BigDecimal getSemana1Dom() {
        return semana1Dom;
   }

   public void setSemana1Dom(BigDecimal semana1Dom) {
        markAsChanged("SEMANA1_DOM", semana1Dom);
        this.semana1Dom = semana1Dom;
   }

   public BigDecimal getSemana1Qua() {
        return semana1Qua;
   }

   public void setSemana1Qua(BigDecimal semana1Qua) {
        markAsChanged("SEMANA1_QUA", semana1Qua);
        this.semana1Qua = semana1Qua;
   }

   public BigDecimal getSemana1Qui() {
        return semana1Qui;
   }

   public void setSemana1Qui(BigDecimal semana1Qui) {
        markAsChanged("SEMANA1_QUI", semana1Qui);
        this.semana1Qui = semana1Qui;
   }

   public BigDecimal getSemana1Sab() {
        return semana1Sab;
   }

   public void setSemana1Sab(BigDecimal semana1Sab) {
        markAsChanged("SEMANA1_SAB", semana1Sab);
        this.semana1Sab = semana1Sab;
   }

   public BigDecimal getSemana1Seg() {
        return semana1Seg;
   }

   public void setSemana1Seg(BigDecimal semana1Seg) {
        markAsChanged("SEMANA1_SEG", semana1Seg);
        this.semana1Seg = semana1Seg;
   }

   public BigDecimal getSemana1Sex() {
        return semana1Sex;
   }

   public void setSemana1Sex(BigDecimal semana1Sex) {
        markAsChanged("SEMANA1_SEX", semana1Sex);
        this.semana1Sex = semana1Sex;
   }

   public BigDecimal getSemana1Ter() {
        return semana1Ter;
   }

   public void setSemana1Ter(BigDecimal semana1Ter) {
        markAsChanged("SEMANA1_TER", semana1Ter);
        this.semana1Ter = semana1Ter;
   }

   public BigDecimal getSemana2Dom() {
        return semana2Dom;
   }

   public void setSemana2Dom(BigDecimal semana2Dom) {
        markAsChanged("SEMANA2_DOM", semana2Dom);
        this.semana2Dom = semana2Dom;
   }

   public BigDecimal getSemana2Qua() {
        return semana2Qua;
   }

   public void setSemana2Qua(BigDecimal semana2Qua) {
        markAsChanged("SEMANA2_QUA", semana2Qua);
        this.semana2Qua = semana2Qua;
   }

   public BigDecimal getSemana2Qui() {
        return semana2Qui;
   }

   public void setSemana2Qui(BigDecimal semana2Qui) {
        markAsChanged("SEMANA2_QUI", semana2Qui);
        this.semana2Qui = semana2Qui;
   }

   public BigDecimal getSemana2Sab() {
        return semana2Sab;
   }

   public void setSemana2Sab(BigDecimal semana2Sab) {
        markAsChanged("SEMANA2_SAB", semana2Sab);
        this.semana2Sab = semana2Sab;
   }

   public BigDecimal getSemana2Seg() {
        return semana2Seg;
   }

   public void setSemana2Seg(BigDecimal semana2Seg) {
        markAsChanged("SEMANA2_SEG", semana2Seg);
        this.semana2Seg = semana2Seg;
   }

   public BigDecimal getSemana2Sex() {
        return semana2Sex;
   }

   public void setSemana2Sex(BigDecimal semana2Sex) {
        markAsChanged("SEMANA2_SEX", semana2Sex);
        this.semana2Sex = semana2Sex;
   }

   public BigDecimal getSemana2Ter() {
        return semana2Ter;
   }

   public void setSemana2Ter(BigDecimal semana2Ter) {
        markAsChanged("SEMANA2_TER", semana2Ter);
        this.semana2Ter = semana2Ter;
   }

   public BigDecimal getVlrAntecipacao() {
        return vlrAntecipacao;
   }

   public void setVlrAntecipacao(BigDecimal vlrAntecipacao) {
        markAsChanged("VLRANTECIPACAO", vlrAntecipacao);
        this.vlrAntecipacao = vlrAntecipacao;
   }

   public BigDecimal getVendaMin() {
        return vendaMin;
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
        this.vendaMin = vendaMin;
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
        this.analitica = vo.asString("ANALITICA");
        this.ativa = vo.asString("ATIVA");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codRegPai = vo.asBigDecimal("CODREGPAI");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTabMin = vo.asBigDecimal("CODTABMIN");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.freteMin = vo.asBigDecimal("FRETEMIN");
        this.gerarReceita = vo.asString("GERARRECEITA");
        this.grau = vo.asBigDecimal("GRAU");
        this.nomeReg = vo.asString("NOMEREG");
        this.percAdicional = vo.asBigDecimal("PERCADICIONAL");
        this.percCusVar = vo.asBigDecimal("PERCCUSVAR");
        this.percDescFob = vo.asBigDecimal("PERCDESCFOB");
        this.percPremio = vo.asBigDecimal("PERCPREMIO");
        this.semana1Dom = vo.asBigDecimal("SEMANA1_DOM");
        this.semana1Qua = vo.asBigDecimal("SEMANA1_QUA");
        this.semana1Qui = vo.asBigDecimal("SEMANA1_QUI");
        this.semana1Sab = vo.asBigDecimal("SEMANA1_SAB");
        this.semana1Seg = vo.asBigDecimal("SEMANA1_SEG");
        this.semana1Sex = vo.asBigDecimal("SEMANA1_SEX");
        this.semana1Ter = vo.asBigDecimal("SEMANA1_TER");
        this.semana2Dom = vo.asBigDecimal("SEMANA2_DOM");
        this.semana2Qua = vo.asBigDecimal("SEMANA2_QUA");
        this.semana2Qui = vo.asBigDecimal("SEMANA2_QUI");
        this.semana2Sab = vo.asBigDecimal("SEMANA2_SAB");
        this.semana2Seg = vo.asBigDecimal("SEMANA2_SEG");
        this.semana2Sex = vo.asBigDecimal("SEMANA2_SEX");
        this.semana2Ter = vo.asBigDecimal("SEMANA2_TER");
        this.vlrAntecipacao = vo.asBigDecimal("VLRANTECIPACAO");
        this.vendaMin = vo.asBigDecimal("VENDAMIN");
        return this;
   }
}
