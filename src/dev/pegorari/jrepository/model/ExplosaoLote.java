package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExplosaoLote extends AbstractSankhyaEntity<ExplosaoLote> {
   public BigDecimal getCodEndOrigem() {
        return this.getVo().asBigDecimal("CODENDORIGEM");
   }

   public void setCodEndOrigem(BigDecimal codEndOrigem) {
        markAsChanged("CODENDORIGEM", codEndOrigem);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuTarefa() {
        return this.getVo().asBigDecimal("NUTAREFA");
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
   }

   public BigDecimal getQuantidade() {
        return this.getVo().asBigDecimal("QUANTIDADE");
   }

   public void setQuantidade(BigDecimal quantidade) {
        markAsChanged("QUANTIDADE", quantidade);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWEXPL";
   }

   @Override
   public String getEntityName() {
        return "ExplosaoLote";
   }

   @Override
   public ExplosaoLote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
