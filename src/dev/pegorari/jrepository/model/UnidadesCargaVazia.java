package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadesCargaVazia extends AbstractSankhyaEntity<UnidadesCargaVazia> {
   public BigDecimal getCodUnicv() {
        return this.getVo().asBigDecimal("CODUNICV");
   }

   public void setCodUnicv(BigDecimal codUnicv) {
        markAsChanged("CODUNICV", codUnicv);
   }

   public String getIdUnidCargaVazia() {
        return this.getVo().asString("IDUNIDCARGAVAZIA");
   }

   public void setIdUnidCargaVazia(String idUnidCargaVazia) {
        markAsChanged("IDUNIDCARGAVAZIA", idUnidCargaVazia);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getTipoUniCargaVazia() {
        return this.getVo().asBigDecimal("TIPOUNICARGAVAZIA");
   }

   public void setTipoUniCargaVazia(BigDecimal tipoUniCargaVazia) {
        markAsChanged("TIPOUNICARGAVAZIA", tipoUniCargaVazia);
   }

   @Override
   public String getTableName() {
        return "TGFUCV";
   }

   @Override
   public String getEntityName() {
        return "UnidadesCargaVazia";
   }

   @Override
   public UnidadesCargaVazia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
