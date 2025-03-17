package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaCPRB extends AbstractSankhyaEntity<TabelaCPRB> {
   private BigDecimal codCtaCtb;
   private BigDecimal aliquota;
   private String codCprb;
   private BigDecimal codRecolhimento;
   private String descAtividade;
   private Timestamp dtFinal;
   private Timestamp dtInicial;

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getAliquota() {
        return aliquota;
   }

   public void setAliquota(BigDecimal aliquota) {
        this.aliquota = aliquota;
   }

   public String getCodCprb() {
        return codCprb;
   }

   public void setCodCprb(String codCprb) {
        this.codCprb = codCprb;
   }

   public BigDecimal getCodRecolhimento() {
        return codRecolhimento;
   }

   public void setCodRecolhimento(BigDecimal codRecolhimento) {
        this.codRecolhimento = codRecolhimento;
   }

   public String getDescAtividade() {
        return descAtividade;
   }

   public void setDescAtividade(String descAtividade) {
        this.descAtividade = descAtividade;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   @Override
   public String getTableName() {
        return "TGFCPRB";
   }

   @Override
   public String getEntityName() {
        return "TabelaCPRB";
   }

   @Override
   public TabelaCPRB fromVO(DynamicVO vo) {
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.aliquota = vo.asBigDecimal("ALIQUOTA");
        this.codCprb = vo.asString("CODCPRB");
        this.codRecolhimento = vo.asBigDecimal("CODRECOLHIMENTO");
        this.descAtividade = vo.asString("DESCATIVIDADE");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        return this;
   }
}
