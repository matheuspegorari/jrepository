package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;

public class CertificadoDigital implements SankhyaEntity<CertificadoDigital> {

   private String nomeArquivo;
   private String interno;
   private String cgcCpf;

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
   }

   public String getInterno() {
        return interno;
   }

   public void setInterno(String interno) {
        this.interno = interno;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   @Override
   public String getEntityName() {
        return "CertificadoDigital";
   }

   @Override
   public CertificadoDigital fromVO(DynamicVO vo) {
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.interno = vo.asString("INTERNO");
        this.cgcCpf = vo.asString("CGCCPF");
        return this;
   }
}
