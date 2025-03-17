package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class UnidadesCargaVazia implements SankhyaEntity<UnidadesCargaVazia> {

   private BigDecimal codUnicv;
   private String idUnidCargaVazia;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private BigDecimal tipoUniCargaVazia;

   public BigDecimal getCodUnicv() {
        return codUnicv;
   }

   public void setCodUnicv(BigDecimal codUnicv) {
        this.codUnicv = codUnicv;
   }

   public String getIdUnidCargaVazia() {
        return idUnidCargaVazia;
   }

   public void setIdUnidCargaVazia(String idUnidCargaVazia) {
        this.idUnidCargaVazia = idUnidCargaVazia;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getTipoUniCargaVazia() {
        return tipoUniCargaVazia;
   }

   public void setTipoUniCargaVazia(BigDecimal tipoUniCargaVazia) {
        this.tipoUniCargaVazia = tipoUniCargaVazia;
   }

   @Override
   public String getEntityName() {
        return "UnidadesCargaVazia";
   }

   @Override
   public UnidadesCargaVazia fromVO(DynamicVO vo) {
        this.codUnicv = vo.asBigDecimal("CODUNICV");
        this.idUnidCargaVazia = vo.asString("IDUNIDCARGAVAZIA");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.tipoUniCargaVazia = vo.asBigDecimal("TIPOUNICARGAVAZIA");
        return this;
   }
}
