package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaCPRB extends AbstractSankhyaEntity<TabelaCPRB> {
   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getAliquota() {
        return this.getVo().asBigDecimal("ALIQUOTA");
   }

   public void setAliquota(BigDecimal aliquota) {
        markAsChanged("ALIQUOTA", aliquota);
   }

   public String getCodCprb() {
        return this.getVo().asString("CODCPRB");
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
   }

   public BigDecimal getCodRecolhimento() {
        return this.getVo().asBigDecimal("CODRECOLHIMENTO");
   }

   public void setCodRecolhimento(BigDecimal codRecolhimento) {
        markAsChanged("CODRECOLHIMENTO", codRecolhimento);
   }

   public String getDescAtividade() {
        return this.getVo().asString("DESCATIVIDADE");
   }

   public void setDescAtividade(String descAtividade) {
        markAsChanged("DESCATIVIDADE", descAtividade);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
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
        this.setVo(vo);
        return this;
   }
}
