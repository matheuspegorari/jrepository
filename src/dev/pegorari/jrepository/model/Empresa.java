package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Empresa implements SankhyaEntity<Empresa> {

   private BigDecimal ativecon;
   private String cargas;
   private String cep;
   private String cgc;
   private BigDecimal codBai;
   private BigDecimal codCid;
   private String codCnl;
   private BigDecimal codEmp;
   private BigDecimal codEmpMatriz;
   private BigDecimal codEnd;
   private BigDecimal codMun;
   private BigDecimal codParc;
   private BigDecimal codRegTrib;
   private String comissoes;
   private String complemento;
   private Timestamp contabilidade;
   private String cooperativa;
   private String cpfResp;
   private Timestamp dtConvSoc;
   private Timestamp dtRegJunta;
   private String dupliv;
   private String email;
   private BigDecimal empAgruparGol;
   private String estoque;
   private String fax;
   private String financeiro;
   private String folhaPagto;
   private String homepage;
   private String inscEstad;
   private String inscMun;
   private String latitude;
   private BigDecimal limCurvaB;
   private BigDecimal limCurvaC;
   private String livrosFiscais;
   private byte[] logoMarca;
   private String longitude;
   private String modeloNfDes;
   private BigDecimal natEstab;
   private BigDecimal natJur;
   private String nomeFantasia;
   private String numEnd;
   private BigDecimal numPropr;
   private String prinCtitular;
   private String producao;
   private String ramoAtiv;
   private String razaoAbrev;
   private String razaoSocial;
   private String regJuntaCom;
   private String serieNfDes;
   private String simples;
   private String simplesNacNauf;
   private String supDecisao;
   private String telefone;
   private String telex;
   private String tipoRegra;
   private BigDecimal tipoSn;
   private BigDecimal corEmpresa;
   private String razaoSocialCompleta;
   private BigDecimal qtdAcessos;
   private String rntrc;
   private String usaRazaoSocial;
   private String produtorRural;
   private String empIdEnotas;
   private Timestamp dhConsiTimEnd;
   private String numTaf;
   private String nuRest;
   private BigDecimal acdIntiSenMulta;
   private BigDecimal classTrib;
   private BigDecimal indConstr;
   private BigDecimal indCoop;
   private BigDecimal indOpCcp;
   private BigDecimal indSitEsp;
   private BigDecimal infoObra;
   private String cotm;
   private BigDecimal cnaePrepon;
   private String cnpjPrefeitura;

   public BigDecimal getAtivecon() {
        return ativecon;
   }

   public void setAtivecon(BigDecimal ativecon) {
        this.ativecon = ativecon;
   }

   public String getCargas() {
        return cargas;
   }

   public void setCargas(String cargas) {
        this.cargas = cargas;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public String getCgc() {
        return cgc;
   }

   public void setCgc(String cgc) {
        this.cgc = cgc;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        this.codBai = codBai;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public String getCodCnl() {
        return codCnl;
   }

   public void setCodCnl(String codCnl) {
        this.codCnl = codCnl;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpMatriz() {
        return codEmpMatriz;
   }

   public void setCodEmpMatriz(BigDecimal codEmpMatriz) {
        this.codEmpMatriz = codEmpMatriz;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodMun() {
        return codMun;
   }

   public void setCodMun(BigDecimal codMun) {
        this.codMun = codMun;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodRegTrib() {
        return codRegTrib;
   }

   public void setCodRegTrib(BigDecimal codRegTrib) {
        this.codRegTrib = codRegTrib;
   }

   public String getComissoes() {
        return comissoes;
   }

   public void setComissoes(String comissoes) {
        this.comissoes = comissoes;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        this.complemento = complemento;
   }

   public Timestamp getContabilidade() {
        return contabilidade;
   }

   public void setContabilidade(Timestamp contabilidade) {
        this.contabilidade = contabilidade;
   }

   public String getCooperativa() {
        return cooperativa;
   }

   public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
   }

   public String getCpfResp() {
        return cpfResp;
   }

   public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
   }

   public Timestamp getDtConvSoc() {
        return dtConvSoc;
   }

   public void setDtConvSoc(Timestamp dtConvSoc) {
        this.dtConvSoc = dtConvSoc;
   }

   public Timestamp getDtRegJunta() {
        return dtRegJunta;
   }

   public void setDtRegJunta(Timestamp dtRegJunta) {
        this.dtRegJunta = dtRegJunta;
   }

   public String getDupliv() {
        return dupliv;
   }

   public void setDupliv(String dupliv) {
        this.dupliv = dupliv;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public BigDecimal getEmpAgruparGol() {
        return empAgruparGol;
   }

   public void setEmpAgruparGol(BigDecimal empAgruparGol) {
        this.empAgruparGol = empAgruparGol;
   }

   public String getEstoque() {
        return estoque;
   }

   public void setEstoque(String estoque) {
        this.estoque = estoque;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        this.fax = fax;
   }

   public String getFinanceiro() {
        return financeiro;
   }

   public void setFinanceiro(String financeiro) {
        this.financeiro = financeiro;
   }

   public String getFolhaPagto() {
        return folhaPagto;
   }

   public void setFolhaPagto(String folhaPagto) {
        this.folhaPagto = folhaPagto;
   }

   public String getHomepage() {
        return homepage;
   }

   public void setHomepage(String homepage) {
        this.homepage = homepage;
   }

   public String getInscEstad() {
        return inscEstad;
   }

   public void setInscEstad(String inscEstad) {
        this.inscEstad = inscEstad;
   }

   public String getInscMun() {
        return inscMun;
   }

   public void setInscMun(String inscMun) {
        this.inscMun = inscMun;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        this.latitude = latitude;
   }

   public BigDecimal getLimCurvaB() {
        return limCurvaB;
   }

   public void setLimCurvaB(BigDecimal limCurvaB) {
        this.limCurvaB = limCurvaB;
   }

   public BigDecimal getLimCurvaC() {
        return limCurvaC;
   }

   public void setLimCurvaC(BigDecimal limCurvaC) {
        this.limCurvaC = limCurvaC;
   }

   public String getLivrosFiscais() {
        return livrosFiscais;
   }

   public void setLivrosFiscais(String livrosFiscais) {
        this.livrosFiscais = livrosFiscais;
   }

   public byte[] getLogoMarca() {
        return logoMarca;
   }

   public void setLogoMarca(byte[] logoMarca) {
        this.logoMarca = logoMarca;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        this.longitude = longitude;
   }

   public String getModeloNfDes() {
        return modeloNfDes;
   }

   public void setModeloNfDes(String modeloNfDes) {
        this.modeloNfDes = modeloNfDes;
   }

   public BigDecimal getNatEstab() {
        return natEstab;
   }

   public void setNatEstab(BigDecimal natEstab) {
        this.natEstab = natEstab;
   }

   public BigDecimal getNatJur() {
        return natJur;
   }

   public void setNatJur(BigDecimal natJur) {
        this.natJur = natJur;
   }

   public String getNomeFantasia() {
        return nomeFantasia;
   }

   public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
   }

   public BigDecimal getNumPropr() {
        return numPropr;
   }

   public void setNumPropr(BigDecimal numPropr) {
        this.numPropr = numPropr;
   }

   public String getPrinCtitular() {
        return prinCtitular;
   }

   public void setPrinCtitular(String prinCtitular) {
        this.prinCtitular = prinCtitular;
   }

   public String getProducao() {
        return producao;
   }

   public void setProducao(String producao) {
        this.producao = producao;
   }

   public String getRamoAtiv() {
        return ramoAtiv;
   }

   public void setRamoAtiv(String ramoAtiv) {
        this.ramoAtiv = ramoAtiv;
   }

   public String getRazaoAbrev() {
        return razaoAbrev;
   }

   public void setRazaoAbrev(String razaoAbrev) {
        this.razaoAbrev = razaoAbrev;
   }

   public String getRazaoSocial() {
        return razaoSocial;
   }

   public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
   }

   public String getRegJuntaCom() {
        return regJuntaCom;
   }

   public void setRegJuntaCom(String regJuntaCom) {
        this.regJuntaCom = regJuntaCom;
   }

   public String getSerieNfDes() {
        return serieNfDes;
   }

   public void setSerieNfDes(String serieNfDes) {
        this.serieNfDes = serieNfDes;
   }

   public String getSimples() {
        return simples;
   }

   public void setSimples(String simples) {
        this.simples = simples;
   }

   public String getSimplesNacNauf() {
        return simplesNacNauf;
   }

   public void setSimplesNacNauf(String simplesNacNauf) {
        this.simplesNacNauf = simplesNacNauf;
   }

   public String getSupDecisao() {
        return supDecisao;
   }

   public void setSupDecisao(String supDecisao) {
        this.supDecisao = supDecisao;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }

   public String getTelex() {
        return telex;
   }

   public void setTelex(String telex) {
        this.telex = telex;
   }

   public String getTipoRegra() {
        return tipoRegra;
   }

   public void setTipoRegra(String tipoRegra) {
        this.tipoRegra = tipoRegra;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        this.tipoSn = tipoSn;
   }

   public BigDecimal getCorEmpresa() {
        return corEmpresa;
   }

   public void setCorEmpresa(BigDecimal corEmpresa) {
        this.corEmpresa = corEmpresa;
   }

   public String getRazaoSocialCompleta() {
        return razaoSocialCompleta;
   }

   public void setRazaoSocialCompleta(String razaoSocialCompleta) {
        this.razaoSocialCompleta = razaoSocialCompleta;
   }

   public BigDecimal getQtdAcessos() {
        return qtdAcessos;
   }

   public void setQtdAcessos(BigDecimal qtdAcessos) {
        this.qtdAcessos = qtdAcessos;
   }

   public String getRntrc() {
        return rntrc;
   }

   public void setRntrc(String rntrc) {
        this.rntrc = rntrc;
   }

   public String getUsaRazaoSocial() {
        return usaRazaoSocial;
   }

   public void setUsaRazaoSocial(String usaRazaoSocial) {
        this.usaRazaoSocial = usaRazaoSocial;
   }

   public String getProdutorRural() {
        return produtorRural;
   }

   public void setProdutorRural(String produtorRural) {
        this.produtorRural = produtorRural;
   }

   public String getEmpIdEnotas() {
        return empIdEnotas;
   }

   public void setEmpIdEnotas(String empIdEnotas) {
        this.empIdEnotas = empIdEnotas;
   }

   public Timestamp getDhConsiTimEnd() {
        return dhConsiTimEnd;
   }

   public void setDhConsiTimEnd(Timestamp dhConsiTimEnd) {
        this.dhConsiTimEnd = dhConsiTimEnd;
   }

   public String getNumTaf() {
        return numTaf;
   }

   public void setNumTaf(String numTaf) {
        this.numTaf = numTaf;
   }

   public String getNuRest() {
        return nuRest;
   }

   public void setNuRest(String nuRest) {
        this.nuRest = nuRest;
   }

   public BigDecimal getAcdIntiSenMulta() {
        return acdIntiSenMulta;
   }

   public void setAcdIntiSenMulta(BigDecimal acdIntiSenMulta) {
        this.acdIntiSenMulta = acdIntiSenMulta;
   }

   public BigDecimal getClassTrib() {
        return classTrib;
   }

   public void setClassTrib(BigDecimal classTrib) {
        this.classTrib = classTrib;
   }

   public BigDecimal getIndConstr() {
        return indConstr;
   }

   public void setIndConstr(BigDecimal indConstr) {
        this.indConstr = indConstr;
   }

   public BigDecimal getIndCoop() {
        return indCoop;
   }

   public void setIndCoop(BigDecimal indCoop) {
        this.indCoop = indCoop;
   }

   public BigDecimal getIndOpCcp() {
        return indOpCcp;
   }

   public void setIndOpCcp(BigDecimal indOpCcp) {
        this.indOpCcp = indOpCcp;
   }

   public BigDecimal getIndSitEsp() {
        return indSitEsp;
   }

   public void setIndSitEsp(BigDecimal indSitEsp) {
        this.indSitEsp = indSitEsp;
   }

   public BigDecimal getInfoObra() {
        return infoObra;
   }

   public void setInfoObra(BigDecimal infoObra) {
        this.infoObra = infoObra;
   }

   public String getCotm() {
        return cotm;
   }

   public void setCotm(String cotm) {
        this.cotm = cotm;
   }

   public BigDecimal getCnaePrepon() {
        return cnaePrepon;
   }

   public void setCnaePrepon(BigDecimal cnaePrepon) {
        this.cnaePrepon = cnaePrepon;
   }

   public String getCnpjPrefeitura() {
        return cnpjPrefeitura;
   }

   public void setCnpjPrefeitura(String cnpjPrefeitura) {
        this.cnpjPrefeitura = cnpjPrefeitura;
   }

   @Override
   public String getEntityName() {
        return "Empresa";
   }

   @Override
   public Empresa fromVO(DynamicVO vo) {
        this.ativecon = vo.asBigDecimal("ATIVECON");
        this.cargas = vo.asString("CARGAS");
        this.cep = vo.asString("CEP");
        this.cgc = vo.asString("CGC");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codCnl = vo.asString("CODCNL");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpMatriz = vo.asBigDecimal("CODEMPMATRIZ");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codMun = vo.asBigDecimal("CODMUN");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codRegTrib = vo.asBigDecimal("CODREGTRIB");
        this.comissoes = vo.asString("COMISSOES");
        this.complemento = vo.asString("COMPLEMENTO");
        this.contabilidade = vo.asTimestamp("CONTABILIDADE");
        this.cooperativa = vo.asString("COOPERATIVA");
        this.cpfResp = vo.asString("CPFRESP");
        this.dtConvSoc = vo.asTimestamp("DTCONVSOC");
        this.dtRegJunta = vo.asTimestamp("DTREGJUNTA");
        this.dupliv = vo.asString("DUPLIV");
        this.email = vo.asString("EMAIL");
        this.empAgruparGol = vo.asBigDecimal("EMPAGRUPARGOL");
        this.estoque = vo.asString("ESTOQUE");
        this.fax = vo.asString("FAX");
        this.financeiro = vo.asString("FINANCEIRO");
        this.folhaPagto = vo.asString("FOLHAPAGTO");
        this.homepage = vo.asString("HOMEPAGE");
        this.inscEstad = vo.asString("INSCESTAD");
        this.inscMun = vo.asString("INSCMUN");
        this.latitude = vo.asString("LATITUDE");
        this.limCurvaB = vo.asBigDecimal("LIMCURVAB");
        this.limCurvaC = vo.asBigDecimal("LIMCURVAC");
        this.livrosFiscais = vo.asString("LIVROSFISCAIS");
        this.logoMarca = vo.asBlob("LOGOMARCA");
        this.longitude = vo.asString("LONGITUDE");
        this.modeloNfDes = vo.asString("MODELONFDES");
        this.natEstab = vo.asBigDecimal("NATESTAB");
        this.natJur = vo.asBigDecimal("NATJUR");
        this.nomeFantasia = vo.asString("NOMEFANTASIA");
        this.numEnd = vo.asString("NUMEND");
        this.numPropr = vo.asBigDecimal("NUMPROPR");
        this.prinCtitular = vo.asString("PRINCTITULAR");
        this.producao = vo.asString("PRODUCAO");
        this.ramoAtiv = vo.asString("RAMOATIV");
        this.razaoAbrev = vo.asString("RAZAOABREV");
        this.razaoSocial = vo.asString("RAZAOSOCIAL");
        this.regJuntaCom = vo.asString("REGJUNTACOM");
        this.serieNfDes = vo.asString("SERIENFDES");
        this.simples = vo.asString("SIMPLES");
        this.simplesNacNauf = vo.asString("SIMPLESNACNAUF");
        this.supDecisao = vo.asString("SUPDECISAO");
        this.telefone = vo.asString("TELEFONE");
        this.telex = vo.asString("TELEX");
        this.tipoRegra = vo.asString("TIPOREGRA");
        this.tipoSn = vo.asBigDecimal("TIPOSN");
        this.corEmpresa = vo.asBigDecimal("COREMPRESA");
        this.razaoSocialCompleta = vo.asString("RAZAOSOCIALCOMPLETA");
        this.qtdAcessos = vo.asBigDecimal("QTDACESSOS");
        this.rntrc = vo.asString("RNTRC");
        this.usaRazaoSocial = vo.asString("USARAZAOSOCIAL");
        this.produtorRural = vo.asString("PRODUTORRURAL");
        this.empIdEnotas = vo.asString("EMPIDENOTAS");
        this.dhConsiTimEnd = vo.asTimestamp("DHCONSITIMEND");
        this.numTaf = vo.asString("NUMTAF");
        this.nuRest = vo.asString("NUREST");
        this.acdIntiSenMulta = vo.asBigDecimal("ACDINTISENMULTA");
        this.classTrib = vo.asBigDecimal("CLASSTRIB");
        this.indConstr = vo.asBigDecimal("INDCONSTR");
        this.indCoop = vo.asBigDecimal("INDCOOP");
        this.indOpCcp = vo.asBigDecimal("INDOPCCP");
        this.indSitEsp = vo.asBigDecimal("INDSITESP");
        this.infoObra = vo.asBigDecimal("INFOOBRA");
        this.cotm = vo.asString("COTM");
        this.cnaePrepon = vo.asBigDecimal("CNAEPREPON");
        this.cnpjPrefeitura = vo.asString("CNPJPREFEITURA");
        return this;
   }
}
