package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class JuroMensal extends AbstractSankhyaEntity<JuroMensal> {
   public String getFimMes() {
        return this.getVo().asString("FIMMES");
   }

   public void setFimMes(String fimMes) {
        markAsChanged("FIMMES", fimMes);
   }

   public BigDecimal getIndice() {
        return this.getVo().asBigDecimal("INDICE");
   }

   public void setIndice(BigDecimal indice) {
        markAsChanged("INDICE", indice);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSinal() {
        return this.getVo().asBigDecimal("SINAL");
   }

   public void setSinal(BigDecimal sinal) {
        markAsChanged("SINAL", sinal);
   }

   public BigDecimal getVlrJuro() {
        return this.getVo().asBigDecimal("VLRJURO");
   }

   public void setVlrJuro(BigDecimal vlrJuro) {
        markAsChanged("VLRJURO", vlrJuro);
   }

   public BigDecimal getVlrJuroMes() {
        return this.getVo().asBigDecimal("VLRJUROMES");
   }

   public void setVlrJuroMes(BigDecimal vlrJuroMes) {
        markAsChanged("VLRJUROMES", vlrJuroMes);
   }

   public BigDecimal getVlrJuroMes2() {
        return this.getVo().asBigDecimal("VLRJUROMES2");
   }

   public void setVlrJuroMes2(BigDecimal vlrJuroMes2) {
        markAsChanged("VLRJUROMES2", vlrJuroMes2);
   }

   public BigDecimal getVlrMulta() {
        return this.getVo().asBigDecimal("VLRMULTA");
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        markAsChanged("VLRMULTA", vlrMulta);
   }

   public BigDecimal getVlrMultaMes() {
        return this.getVo().asBigDecimal("VLRMULTAMES");
   }

   public void setVlrMultaMes(BigDecimal vlrMultaMes) {
        markAsChanged("VLRMULTAMES", vlrMultaMes);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCotacao() {
        return this.getVo().asBigDecimal("COTACAO");
   }

   public void setCotacao(BigDecimal cotacao) {
        markAsChanged("COTACAO", cotacao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   @Override
   public String getTableName() {
        return "TGFJUM";
   }

   @Override
   public String getEntityName() {
        return "JuroMensal";
   }

   @Override
   public JuroMensal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
