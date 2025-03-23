package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class CertificadoDigital extends AbstractSankhyaEntity<CertificadoDigital> {
   private String nomeArquivo;
   private String interno;
   private String cgcCpf;

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public String getInterno() {
        return interno;
   }

   public void setInterno(String interno) {
        markAsChanged("INTERNO", interno);
        this.interno = interno;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   @Override
   public String getTableName() {
        return "TSICDI";
   }

   @Override
   public String getEntityName() {
        return "CertificadoDigital";
   }

   @Override
   public CertificadoDigital fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.interno = vo.asString("INTERNO");
        this.cgcCpf = vo.asString("CGC_CPF");
        return this;
   }
}
