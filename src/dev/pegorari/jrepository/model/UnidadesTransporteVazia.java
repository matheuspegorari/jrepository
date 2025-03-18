package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadesTransporteVazia extends AbstractSankhyaEntity<UnidadesTransporteVazia> {
   private BigDecimal codUnitv;
   private String idUnidTransVazia;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private BigDecimal tipoUnitransVazia;

   public BigDecimal getCodUnitv() {
        return codUnitv;
   }

   public void setCodUnitv(BigDecimal codUnitv) {
        markAsChanged("CODUNITV", codUnitv);
        this.codUnitv = codUnitv;
   }

   public String getIdUnidTransVazia() {
        return idUnidTransVazia;
   }

   public void setIdUnidTransVazia(String idUnidTransVazia) {
        markAsChanged("IDUNIDTRANSVAZIA", idUnidTransVazia);
        this.idUnidTransVazia = idUnidTransVazia;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getTipoUnitransVazia() {
        return tipoUnitransVazia;
   }

   public void setTipoUnitransVazia(BigDecimal tipoUnitransVazia) {
        markAsChanged("TIPOUNITRANSVAZIA", tipoUnitransVazia);
        this.tipoUnitransVazia = tipoUnitransVazia;
   }

   @Override
   public String getTableName() {
        return "TGFUTV";
   }

   @Override
   public String getEntityName() {
        return "UnidadesTransporteVazia";
   }

   @Override
   public UnidadesTransporteVazia fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUnitv = vo.asBigDecimal("CODUNITV");
        this.idUnidTransVazia = vo.asString("IDUNIDTRANSVAZIA");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.tipoUnitransVazia = vo.asBigDecimal("TIPOUNITRANSVAZIA");
        return this;
   }
}
