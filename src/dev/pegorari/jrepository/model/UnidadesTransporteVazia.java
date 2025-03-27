package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UnidadesTransporteVazia extends AbstractSankhyaEntity<UnidadesTransporteVazia> {
   public BigDecimal getCodUnitv() {
        return this.getVo().asBigDecimal("CODUNITV");
   }

   public void setCodUnitv(BigDecimal codUnitv) {
        markAsChanged("CODUNITV", codUnitv);
   }

   public String getIdUnidTransVazia() {
        return this.getVo().asString("IDUNIDTRANSVAZIA");
   }

   public void setIdUnidTransVazia(String idUnidTransVazia) {
        markAsChanged("IDUNIDTRANSVAZIA", idUnidTransVazia);
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

   public BigDecimal getTipoUnitransVazia() {
        return this.getVo().asBigDecimal("TIPOUNITRANSVAZIA");
   }

   public void setTipoUnitransVazia(BigDecimal tipoUnitransVazia) {
        markAsChanged("TIPOUNITRANSVAZIA", tipoUnitransVazia);
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
        this.setVo(vo);
        return this;
   }
}
