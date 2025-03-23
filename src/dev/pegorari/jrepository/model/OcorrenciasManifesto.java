package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciasManifesto extends AbstractSankhyaEntity<OcorrenciasManifesto> {
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private char[] ocorrencias;
   private Timestamp dhOcor;
   private BigDecimal codUsu;

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

   public char[] getOcorrencias() {
        return ocorrencias;
   }

   public void setOcorrencias(char[] ocorrencias) {
        markAsChanged("OCORRENCIAS", ocorrencias);
        this.ocorrencias = ocorrencias;
   }

   public Timestamp getDhOcor() {
        return dhOcor;
   }

   public void setDhOcor(Timestamp dhOcor) {
        markAsChanged("DHOCOR", dhOcor);
        this.dhOcor = dhOcor;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
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
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.ocorrencias = vo.asClob("OCORRENCIAS");
        this.dhOcor = vo.asTimestamp("DHOCOR");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
