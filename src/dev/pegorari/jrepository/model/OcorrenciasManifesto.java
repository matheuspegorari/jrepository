package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciasManifesto extends AbstractSankhyaEntity<OcorrenciasManifesto> {
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

   public char[] getOcorrencias() {
        return this.getVo().asClob("OCORRENCIAS");
   }

   public void setOcorrencias(char[] ocorrencias) {
        markAsChanged("OCORRENCIAS", ocorrencias);
   }

   public Timestamp getDhOcor() {
        return this.getVo().asTimestamp("DHOCOR");
   }

   public void setDhOcor(Timestamp dhOcor) {
        markAsChanged("DHOCOR", dhOcor);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   @Override
   public String getTableName() {
        return "TGFOMDF";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciasManifesto";
   }

   @Override
   public OcorrenciasManifesto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
