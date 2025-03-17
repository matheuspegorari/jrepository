package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OcorrenciasManifesto implements SankhyaEntity<OcorrenciasManifesto> {

   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private char[] ocorrencias;
   private Timestamp dhOcor;
   private BigDecimal codUsu;

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

   public char[] getOcorrencias() {
        return ocorrencias;
   }

   public void setOcorrencias(char[] ocorrencias) {
        this.ocorrencias = ocorrencias;
   }

   public Timestamp getDhOcor() {
        return dhOcor;
   }

   public void setDhOcor(Timestamp dhOcor) {
        this.dhOcor = dhOcor;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getEntityName() {
        return "OcorrenciasManifesto";
   }

   @Override
   public OcorrenciasManifesto fromVO(DynamicVO vo) {
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.ocorrencias = vo.asClob("OCORRENCIAS");
        this.dhOcor = vo.asTimestamp("DHOCOR");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
