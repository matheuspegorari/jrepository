package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcompanhamentoNota extends AbstractSankhyaEntity<AcompanhamentoNota> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhOcor() {
        return this.getVo().asTimestamp("DHOCOR");
   }

   public void setDhOcor(Timestamp dhOcor) {
        markAsChanged("DHOCOR", dhOcor);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public BigDecimal getHrAct() {
        return this.getVo().asBigDecimal("HRACT");
   }

   public void setHrAct(BigDecimal hrAct) {
        markAsChanged("HRACT", hrAct);
   }

   public BigDecimal getNotaPontual() {
        return this.getVo().asBigDecimal("NOTAPONTUAL");
   }

   public void setNotaPontual(BigDecimal notaPontual) {
        markAsChanged("NOTAPONTUAL", notaPontual);
   }

   public BigDecimal getNotaQualidade() {
        return this.getVo().asBigDecimal("NOTAQUALIDADE");
   }

   public void setNotaQualidade(BigDecimal notaQualidade) {
        markAsChanged("NOTAQUALIDADE", notaQualidade);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getOcorrencias() {
        return this.getVo().asString("OCORRENCIAS");
   }

   public void setOcorrencias(String ocorrencias) {
        markAsChanged("OCORRENCIAS", ocorrencias);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFACT";
   }

   @Override
   public String getEntityName() {
        return "AcompanhamentoNota";
   }

   @Override
   public AcompanhamentoNota fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
